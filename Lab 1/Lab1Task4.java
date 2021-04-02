import java.util.*;

public class Lab1Task4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test[] = new int[20];
        for (int i = 0; i < 10; i++)
        {
            test[i] = sc.nextInt();
        }
        for (int i = 0; i < test.length; i++)
        {
          if(i < test.length-1)
          {
            System.out.print(test[i] + ",");
          }
          else
          {
            System.out.print(test[i]);
          }
        }
    }
}
