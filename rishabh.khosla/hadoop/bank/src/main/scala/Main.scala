
import org.apache.spark._ 

object Main extends App{

  override def main(arg:Array[String]) : Unit = {
    
  var sparkConf = new SparkConf().setMaster("local").setAppName("bank")
 var sc = new SparkContext(sparkConf)
sc.setLogLevel("ERROR")
var rdd=sc.textFile("file:///home/rishab/Downloads/bank/Transaction Sample data-1.csv")
var fill=rdd.filter(x=> !x.contains("Account_id"))
val data1=fill.map(parse)
val total_transactions=data1.count()
val sum_of_transactions=data1.map(_.amount).reduce(_+_)
val average_sys_1=sum_of_transactions/total_transactions
val join1=data1.map(x=> ((x.account_Id),x))
//var sum=join1.map(_._2).sum()
var rdd1=sc.textFile("file:///home/rishab/Downloads/bank/Transaction Sample data-2.csv")
val fill1=rdd1.filter(x=> !x.contains("Account_id"))
val data2=fill1.map(parse1)
val join2=data2.map(x=> ((x.account_Id),x))

val total_transactions2=data2.count()
val sum_of_transactions2=data2.map(_.amount).reduce(_+_)
val average_sys_2=sum_of_transactions2/total_transactions2


val output=join1.join(join2).map{case (s,(bank_sys1(a,b,c,d,e),bank_sys2(f,g,h,i,j,k)))=>(a,e+k)}
var sum_of_systems=output.map(_._2).sum()
var total_system_transactions=output.count()
var req_average=sum_of_systems/total_system_transactions


//transaction_time
 var pair_time1=data1.map(x =>((x.transaction_time) ,x.amount))
 var pair_time2=data2.map(x =>((x.transaction_time) ,x.amount))
 //time_key_join=pair_time1.zip(pair_time2)
 var time_key_join=pair_time1.join(pair_time2)
 var group_time_key=time_key_join.groupByKey()

var key_size=group_time_key.map{ case (key,value)=> (key,value.size)}.collect.toList



//here i find out the year wise amount avg.

var pair_year1=data1.map(x=>((x.transaction_time),x.amount)).groupByKey()
var pair_year2=data2.map(x=>((x.transaction_time),x.amount)).groupByKey()
var result_year1=pair_year1.map{case (key,value)=> (key,value.sum/value.size)}
 var result_year2=pair_year2.map{case (key,value)=> (key,value.sum/value.size)}
 var pair_result=result_year1.join(result_year2)
 var final_result=pair_result.map{case (a,(b,c))=>("year="+a," average="+(b+c)/2)}.foreach(println)

 // calucate balance 

 //var credit_data1=data1.filter(x=>x.transaction_type=="C")
  //var debit_data1=data1.filter(x=>x.transaction_type=="D")
  //var credit_data2=data2.filter(x=>x.transaction_type=="C")
  //var debit_data2=data2.filter(x=>x.transaction_type=="D")

  //var pair_acc_credit1=credit_data1.map(x=>((x.account_Id),x.amount)).groupByKey()
  //var pair_acc_debit1=debit_data1.map(x=>((x.account_Id),x.amount)).groupByKey()

  //var result1=pair_acc_credit1.zip(pair_acc_debit1)

//calucate 
var credit1rdd = data1.map(x => (x.account_Id,x)).groupByKey().map{case (a,b) => (a,b.filter(_.transaction_type == 'C').map(_.amount))}
var sum_C1 = credit1rdd.map(x => (x._1,x._2.sum))
var credit11rdd = data2.map(x => (x.account_Id,x)).groupByKey().map{case (a,b) => (a,b.filter(_.transaction_type == 'C').map(_.amount))}
var sum_C2 = credit11rdd.map(x => (x._1,x._2.sum))
var aaa = sum_C1.zip(sum_C2).map{case ((a,b),(c,d)) => (a,b+d)}

var debit2rdd = data1.map(x => (x.account_Id,x)).groupByKey().map{case (a,b) => (a,b.filter(_.transaction_type == 'D').map(_.amount))}
var sum_D1 = debit2rdd.map(x => (x._1,x._2.sum))
var debit22rdd = data2.map(x => (x.account_Id,x)).groupByKey().map{case (a,b) => (a,b.filter(_.transaction_type == 'D').map(_.amount))}
var sum_D2 = debit22rdd.map(x => (x._1,x._2.sum))
var bbb = sum_D1.zip(sum_D2).map{case ((a,b),(c,d)) => (a,b+d)}
var balance = aaa.zip(bbb).map{case ((a,b),(c,d)) => (a, b-d)}
var balanceRdd = balance.map{case (a,b) => (f"Account_Id = $a%10s", f"Balance = $b%8s")}

sc.stop()
}
//parse function of system 1 dataset
case class bank_sys1(account_Id:String,name:String,transaction_time:String,transaction_type:String,amount:Int)extends Serializable{}

def parse(row:String):bank_sys1={
val field=row.split(",")
val account_Id=field(0)
val name=field(1)
val transaction_time=field(2).substring(field(2).length-4)
val transaction_type=field(3)
val amount:Int=field(4).substring(1).replaceAll("\\s", "").toInt
bank_sys1(account_Id,name,transaction_time,transaction_type,amount)
}


// parse function of system 2 dataset
case class bank_sys2(account_Id:String,name:String,transaction_mode:String,transaction_time:String,transaction_type:String,amount:Int)extends Serializable{}

def parse1(row:String):bank_sys2={
val field=row.split(",")
val account_Id=field(0)
val name=field(1)
val transaction_mode=field(2)
val transaction_time=field(3)
val transaction_type=field(4)
val amount:Int=field(5).substring(1).replaceAll("\\s", "").toInt
bank_sys2(account_Id,name,transaction_mode,transaction_time,transaction_type,amount)
}

}
