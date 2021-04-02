import java.util.Scanner;
public class Lab1Task5 {

    public static void main(String[] args)
    {
        int[] numbers = intArray();
        int result = sum(numbers);
        System.out.println(result);
    }
    public static int sum(int[] numbers)
    {
        int sum =0;
        for (int j = 0; j < numbers.length; j++)
        {
            sum = sum + numbers[j];
        }
        return sum;
    }
    public static int[] intArray()
    {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] data = input.split(",");

        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++)
        {
            result[i] = Integer.parseInt(data[i]);
        }
        return result;
    }
 }
 
