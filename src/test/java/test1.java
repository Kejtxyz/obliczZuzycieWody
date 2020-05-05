import org.testng.annotations.Test;

import java.io.PrintWriter;

public class test1 {
    //pierwszy test
   @Test
public void sprawdzZapisaniePliku() throws Exception{
       PrintWriter zapis = new PrintWriter("test.txt");
       zapis.println("test.txt");
    //   Assert.assertTrue((new PrintWriter("text.txt"));
       System.out.println("plik zostal zapisany ,test zapisal plik i sprawdzil ,przeszedl pozytywnie");
   }
}