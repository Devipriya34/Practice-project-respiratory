package comparable;

public class StudentTest {

	public static void main(String[] args) {
          Student s=new Student("dilleep",24);
          Student s2=new Student("gaya",20);
        System.out.println(s.compareTo(s2));
        System.out.println(s2.compareTo(s));
	}

}
