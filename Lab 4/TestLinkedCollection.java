import java.util.Scanner;
public class TestLinkedCollection
{
  public static void main(String ... args)
  {
	 LinkedCollection mydata = new LinkedCollection();

    for(int i = 1;i<=5;i++)
    {
      mydata.addL(input());
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
