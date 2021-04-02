import java.util.Scanner;
public class TestLinkedCollection
{
  public static void main(String ... args)
  {
    LinkedCollection mydata = new LinkedCollection();
    for(int i = 1;i<=5;i++)
    {
      mydata.addL(input());
     // mydata.addF(input());  if you want test method addF  you can detele  this comment and comment Line 9
    }
      System.out.println(mydata);
   }
  private static Object input()
  {
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      return s;
  }
}
