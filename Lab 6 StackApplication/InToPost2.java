import java.util.Scanner;
import java.util.Stack;

public class InToPost2
{
    static private String expression;
    private Stack<Character> stack = new Stack<Character>();

    public InToPost3 (String infixExpression)
    {
        expression = infixExpression;
    }

    public String infixToPostfix()
    {
        String postfixString = "";
        for (int index = 0; index < expression.length(); ++index)
        {
            char value = expression.charAt(index);
            if (value == '(')
            {

            }
            else if (value == ')')
            {
                Character oper = stack.peek();
                while (!(oper.equals('(')) && !(stack.isEmpty()))
                {
                    stack.pop();
                    postfixString += oper.charValue();
                }
            }
            else if (value == '+' || value == '-')
            {
                if (stack.isEmpty())
                {
                    stack.push(value);
                }
                else
                {
                    Character oper = stack.peek();
                    while (!(stack.isEmpty() || oper.equals(('(')) || oper.equals((')'))))
                    {
                        stack.pop();
                        postfixString += oper.charValue();
                    }
                    stack.push(value);
                }
            }
            else if (value == '*' || value == '/')
            {
                if (stack.isEmpty())
                {
                  stack.push(value);
                }
                else
                {
                  Character oper = stack.peek();
                    while (!oper.equals(('+')) && !oper.equals(('-')) && !stack.isEmpty())
                    {
                      stack.pop();
                      postfixString += oper.charValue();
                    }
                    stack.push(value);
                }
            }
            else
            {
              postfixString += value;
            }
        }

        while (!stack.isEmpty())
        {
            Character oper = stack.peek();
            if (!oper.equals(('(')))
            {
                stack.pop();
                postfixString += oper.charValue();
            }
        }
        return postfixString;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        inconpos convert = new inconpos(expression);
        System.out.println(convert.infixToPostfix());
    }
}
