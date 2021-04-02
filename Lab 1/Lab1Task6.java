import java.util.Scanner;
public class Lab1Task6
{

     public static void main(String []args)
     {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
		     String number[] = str.split(",");
		     int[] data = new int[10];
         for(int i=0;i<number.length;i++)
         {
			    data[i] = Integer.parseInt(number[i]);
		     }
		     for(int i=0;i<data.length;i++)
         {
           if(i < data.length-1)
           {
            System.out.print(data[i]+",");
           }
           else
           {
            System.out.print(data[i]);
           }
		     }
     }
}
