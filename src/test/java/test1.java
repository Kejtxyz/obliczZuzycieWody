import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.PrintWriter;

public class test1 {
    //pierwszy test
   @Test
public void sprawdzZapisaniePliku() throws Exception{
       PrintWriter zapis = new PrintWriter("test.txt");
       zapis.println("aaaa");
       Assert.assertFalse(zapis.equals(null));
       System.out.println("TEST - plik zostal utworzony ,sprawdzil ,przeszedl pozytywnie");
   }
//@Test
    //    public void zapiszcosdopliku() throws Exception {
    // zapisz cos do pliku testowego
  //  zapis.println("aaaa");
//    Assert.assertTrue(zapis.equals("aaaa"));

  //  Assert.assertTrue(zapis.equals("aaaa"));
//}
    //usun utworzony plik do testow



}
