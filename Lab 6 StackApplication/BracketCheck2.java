import java.util.Stack;
import java.util.Scanner;
public class BracketCheck2
{
    public static void main (String [] args)
    {
      Scanner sc= new Scanner(System.in);
      String expr = sc.next(); // input  data
      if (checkBalanced(expr))
      {
        System.out.println("correct");
      }
      else
      {
        System.out.println("incorrect");
      }
    }

    public static boolean checkBalanced(String check)
    {
        Stack<Character> S = new Stack<Character>();
        for(int a = 0; a < check.length(); a++)
        {
            char let = check.charAt(a);
            if(let == '[' || let == '{' || let == '(')
            {
              S.push(let);
            }
            else if(let == ']' || let == '}' || let == ')')
            {
                if(S.empty())
                {
                  return false;
                }
                switch(let)
                {
                    case ']': // Opening square brace
                        if (S.pop() != '[')
                        {
                          return false;
                        }
                          break;

                    case '}': // Opening curly brace
                        if (S.pop() != '{')
                        {
                          return false;
                        }
                          break;

                    case ')': // Opening paren brace
                        if (S.pop() != '(')
                        {
                          return false;
                        }
                          break;
                    default:
                      break;
                }
            }
        }
        if(S.empty())
        {
          return true;
        }
      return false;
    }
}
