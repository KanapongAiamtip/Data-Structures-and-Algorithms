import java.util.Scanner;
public class Task1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in); // in use for input data form user
    int choice =0;
    ArrayCollection data = new  ArrayCollection(10); // call  Object form  ArrayCollection
      while (choice != 7) //  when you user input 7 out program
      {
        menu(); // loop menu
        System.out.print("Enter your choice: ");
        choice = in.nextInt();
        switch (choice)// input number  to  working case in program
        {
          case 1:
            data.add(input());
          break;
          case 2:
            System.out.println("==>"+data.toString());  // print
          break;
          case 3:
            int x= data.search(input()); // find data form user input
              if(x == -1)
              {
                System.out.println("==> no found");
              }
              else
              {
                System.out.println("==> found at no.:"+x);
              }
          break;
          case 4:
            data.remove(input()); // remove data from user input
            break;
          case 5:
            if(data.isEmpty()== true)//  if data is empty  program will return value true  (value = 0)
            {
              System.out.println("==> empty");
            }
            else
            {
              System.out.println("==> not empty");
            }
            break;
          case 6:
            System.out.println("==> size ="+data.size()); // program will  print data in array
            break;
          default:
            if(choice == 7)// if input == 7  program will not say  "==> Wrong choice!"
            {
              break;
            }
            System.out.println("==> Wrong choice!");
          }
      }
      System.out.println("Good bye");
  }
       private  static void menu()
       {
         System.out.println("----- Menu -----");
         System.out.println("1. add(obj)");
         System.out.println("2. toString()");
         System.out.println("3. search(obj)");
         System.out.println("4. remove(obj)");
         System.out.println("5.isEmpty()");
         System.out.println("6.size()");
         System.out.println("7. quit");
       }
       private static Object input()
       {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter words ");
        String s = in.nextLine(); //  input  data(words)
        return s;
       }
}
