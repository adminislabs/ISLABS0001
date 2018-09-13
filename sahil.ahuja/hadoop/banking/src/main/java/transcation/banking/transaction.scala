package transcation.banking
import org.apache.spark._

object transaction {
  def main(arg: Array[String]): Unit = {
    var sparkConf = new SparkConf()
    var sc = new SparkContext(sparkConf)
    var transaction1 = sc.textFile("file:///home/sahil/projects/banking/Transaction-Sample-data-1.txt")
    var filtertransaction1 = transaction1.filter(x => !x.contains("Account_id"))
    var parsetransaction1 = filtertransaction1.map(parse1)
    var transaction2 = sc.textFile("file:///home/sahil/projects/banking/Transaction Sample data-2 (copy).txt")
    var filtertransaction2 = transaction2.filter(x => !x.contains("Account_id"))
    var parsetransaction2 = filtertransaction2.map(parse2)
    var map1 = parsetransaction1.map(x => (x.status, x.amount)).groupByKey().map { case (a, b) => (a, b.size) }
    var map1av = parsetransaction1.map(x => (x.status, x.amount)).reduceByKey((x, y) => x + y)
    var map2 = parsetransaction2.map(x => (x.status, x.amount)).groupByKey().map { case (a, b) => (a, b.size) }
    var map2av = parsetransaction2.map(x => (x.status, x.amount)).reduceByKey((x, y) => x + y)
    var m1zipm2 = map1.zip(map2).map { case ((a, b), (c, d)) => (a, b + d) }
    var m1avzipm2av = map1av.zip(map2av).map { case ((a, b), (c, d)) => (a, b + d) }
    var average = m1avzipm2av.zip(m1zipm2).map { case ((a, b), (c, d)) => (a, b / d) }
    var showaverage = average.map { case (a, b) => (f"Status=$a " + f"Average=$b ") }

    var yearpercredit1c = parsetransaction1.map(x => (x.year, x)).groupByKey().map { case (a, b) => (a, b.filter(_.status == 'C').map(_.amount)) }
    var sc1 = yearpercredit1c.map(x => (x._1, x._2.sum))
    var rc1 = yearpercredit1c.map { case (a, b) => (a, b.size) }
    var yearpercredit1d = parsetransaction1.map(x => (x.year, x)).groupByKey().map { case (a, b) => (a, b.filter(_.status == 'D').map(_.amount)) }
    var sd1 = yearpercredit1d.map(x => (x._1, x._2.sum))
    var rd1 = yearpercredit1d.map { case (a, b) => (a, b.size) }

    var yearpercredit2c = parsetransaction2.map(x => (x.year, x)).groupByKey().map { case (a, b) => (a, b.filter(_.status == 'C').map(_.amount)) }
    var sc2 = yearpercredit2c.map(x => (x._1, x._2.sum))
    var rc2 = yearpercredit2c.map { case (a, b) => (a, b.size) }
    var yearpercredit2d = parsetransaction2.map(x => (x.year, x)).groupByKey().map { case (a, b) => (a, b.filter(_.status == 'D').map(_.amount)) }
    var sd2 = yearpercredit2d.map(x => (x._1, x._2.sum))
    var rd2 = yearpercredit2d.map { case (a, b) => (a, b.size) }

    var sc1zipsc2 = sc1.zip(sc2).map { case ((a, b), (c, d)) => (a, b + d) }
    var rc1ziprc2 = rc1.zip(rc2).map { case ((a, b), (c, d)) => (a, b + d) }
    var cr = sc1zipsc2.zip(rc1ziprc2).map { case ((a, b), (c, d)) => (a, b / d) }

    var sd1zipsd2 = sd1.zip(sd2).map { case ((a, b), (c, d)) => (a, b + d) }
    var rd1ziprd2 = rd1.zip(rd2).map { case ((a, b), (c, d)) => (a, b + d) }
    var deb = sd1zipsd2.zip(rd1ziprd2).map { case ((a, b), (c, d)) => (a, b / d) }

    var averageperyear = cr.zip(deb).map { case ((a, b), (c, d)) => (f"Year=$a " + f"AverageCredit=$b " + f"AverageDebit=$d") }

    var accountpercredit1c = parsetransaction1.map(x => (x.accountId, x)).groupByKey().map { case (a, b) => (a, b.filter(_.status == 'C').map(_.amount)) }
    var tc1 = accountpercredit1c.map(x => (x._1, x._2.sum))
    var accountpercredit1d = parsetransaction1.map(x => (x.accountId, x)).groupByKey().map { case (a, b) => (a, b.filter(_.status == 'D').map(_.amount)) }
    var td1 = accountpercredit1d.map(x => (x._1, x._2.sum))

    var accountpercredit2c = parsetransaction2.map(x => (x.account_id, x)).groupByKey().map { case (a, b) => (a, b.filter(_.status == 'C').map(_.amount)) }
    var tc2 = accountpercredit2c.map(x => (x._1, x._2.sum))
    var accountpercredit2d = parsetransaction2.map(x => (x.account_id, x)).groupByKey().map { case (a, b) => (a, b.filter(_.status == 'D').map(_.amount)) }
    var td2 = accountpercredit2d.map(x => (x._1, x._2.sum))

    var tc1ziptc2 = tc1.zip(tc2).map { case ((a, b), (c, d)) => (a, b + d) }
    var td1ziptd2 = td1.zip(td2).map { case ((a, b), (c, d)) => (a, b + d) }
    var balanceperaccount = tc1ziptc2.zip(td1ziptd2).map { case ((a, b), (c, d)) => (a, b - d) }
    var shorbalanceperaccount = balanceperaccount.map { case (a, b) => (f"AccountId=$a " + f"Balance=$b ") }
    var max = balanceperaccount.max()(new Ordering[Tuple2[Int, Int]]() {
      override def compare(x: (Int, Int), y: (Int, Int)): Int =
        Ordering[Int].compare(x._2, y._2)
    })
  }

  case class transaction1(accountId: Int, name: String, year: Int, status: Char, amount: Int)
  def parse1(row: String): transaction1 = {
    var fields = row.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)

    var accountId: Int = fields(0).toInt
    var name: String = fields(1).replace('"', ' ').trim().replaceAll(" ", "")
    var year: Int = fields(2).substring(fields(2).length() - 4, fields(2).length()).toInt
    var status: Char = fields(3).toCharArray()(1)
    var amount1: String = fields(4).replace('"', ' ').trim().replaceAll(" ", "")
    var amount: Int = amount1.substring(1, amount1.length()).toInt
    transaction1(accountId, name, year, status, amount)
  }
  case class transaction2(account_id: Int, name: String, channel: String, year: Int, status: Char, amount: Int)
  def parse2(row: String): transaction2 = {
    var fields = row.split(",")
    var account_id: Int = fields(0).toInt
    var name: String = fields(1)
    var channel: String = fields(2)
    var year: Int = fields(3).substring(fields(3).length() - 4, fields(3).length()).toInt
    var status: Char = fields(4).toCharArray()(0)
    var amount: Int = fields(5).substring(1, fields(5).length()).toInt
    transaction2(account_id, name, channel, year, status, amount)
  }
}