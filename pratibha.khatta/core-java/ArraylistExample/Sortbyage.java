package ArraylistExample;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class Sortbyage implements Comparator 
{

	
        // Used for sorting in ascending order of
        // age
        public int compare(Student a, Student b)
        {
            return a.age - b.age;
        }

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
    }


