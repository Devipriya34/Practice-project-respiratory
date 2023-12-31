
import java.util.stream.IntStream;

public class StringToIntegerStreamTest {
   public static void main(String[] args) {
      String str = "Tutorials Point";
      IntStream stream = str.chars();
      stream.forEach(element -> System.out.println((char)(element))); 
      // using lambda expression
   }
}
