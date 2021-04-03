import java.util.Scanner;
public class TestLinkedCollection
{
  public static void main(String[] args)
  {
    LinkedCollection mydata = new LinkedCollection();
    for(int i = 1;i<=5;i++)
    {
      mydata.addL(input());
    }
    System.out.println(mydata);
    System.out.println("size  = " + mydata.size());

    System.out.println("**** contains ****");
    System.out.print("search word: ");
    Object in = input();

    System.out.println(mydata.contains(in));
    System.out.println("**** remove ****");
    System.out.print("word: ");
    in = input();
    mydata.remove(in);
    System.out.println(mydata);
    System.out.println("size  = " + mydata.size());
  }

  private static Object input()
  {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    return s;
  }
}
