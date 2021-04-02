//import java.util.*;
import java.util.Scanner;
public class Lab2Task3
{
    public static void main(String[] args)
		{
 	    ArrayCollection mydata = new ArrayCollection(10);
 	 	  Object d = input();
 		   mydata.add(d);
		   for(int i=1;i<=4;i++)
		   {
	        mydata.add(input());
	     }
 		    System.out.println(mydata.size());
     }

     private static Object input()
		 {
       Scanner in = new Scanner(System.in);
       String s = in.nextLine();
       return s;
     }
}
