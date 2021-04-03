import java.util.*;
public class PostFixEval2
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      String x = in.nextLine();
      String[] strArr = x.split(" ");
      System.out.println(calculator(strArr));
    }

    public static double calculator(String[] strArr)
    {
        Stack<Double> operands = new Stack<Double>();
        for(String str : strArr) {
            if (str.trim().equals(""))
            {
              continue;
            }
            switch (str)
            {
                case "+":
                case "-":
                case "*":
                case "/":
                    double right = operands.pop();
                    double left = operands.pop();
                    double value = 0;
                    switch(str)
                    {
                        case "+":
                            value = left + right;
                            break;
                        case "-":
                            value = left - right;
                            break;
                        case "*":
                            value = left * right;
                            break;
                        case "/":
                            value = left / right;
                            break;
                        default:
                            break;
                    }
                    operands.push(value);
                    break;
                default:
                    operands.push(Double.parseDouble(str));
                    break;
            }
        }
        return operands.pop();
    }
}
