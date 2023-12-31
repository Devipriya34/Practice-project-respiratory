package comparable;
import java.lang.Comparable;
public class Student implements Comparable{
	String name;
		int age;
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		@Override
		public int compareTo(Object o) {
			Student s1=(Student)o;
			if(age>s1.age)return 1;
			if(age<s1.age)return -1;
			return 0;
			//return age-s1.age;
			
		}
//		public int CompareTo(Object O)
//		{
//			Student s1=(Student)O;
//			return name.compareTo(s1.name);
//		}
		
		

}
  