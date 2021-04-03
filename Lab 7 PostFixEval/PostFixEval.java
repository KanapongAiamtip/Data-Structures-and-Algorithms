import java.util.*;
public class PostFixEval
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        System.out.println(postfixEvaluate(x));
    }

    public static int postfixEvaluate(String exp)
    {
	 Stack<Integer> s = new Stack<Integer>();
	 Scanner tokens = new Scanner(exp);
     	 while (tokens.hasNext())
         {
		if (tokens.hasNextInt())
		{
		   s.push(tokens.nextInt());
	   	}
		else   //  "+", "-", "*", "/"
	 	{
			int num2 = s.pop();
			int num1 = s.pop();
			String op = tokens.next();
			if (op.equals("+"))
			{
			   s.push(num1 + num2);
			}
			else if (op.equals("-"))
			{
			   s.push(num1 - num2);
			}
			else if (op.equals("*"))
			{
		           s.push(num1 * num2);
			}
			else
			{
			   s.push(num1 / num2);
			}
		 }
	}
	   return s.pop();
  }
}
