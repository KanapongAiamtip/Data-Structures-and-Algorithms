import java.util.Scanner;
//import java.util.Arrays;

  public class TestLinkedCollectionMenu
  {
    public static void main(String[] args)
    {
      LinkedCollection data = new LinkedCollection();
      menu();
      int choice  = inputChoice();
      while (choice != 0) {
        switch (choice)
        {
          case 1:

            data.addL(input());
          break;
          case 2:
            System.out.println("**** contains ****");
            System.out.print("Search word: ");
            boolean n = data.contains(input());
            if(n == false)
            {
              System.out.println("==> no found ");
            }
            else
            {
              System.out.println("==> found ");
            }
            break;
          case 3:
            System.out.println("**** Remove ****");
            System.out.print("word ");
            data.remove(input());
          break;
          case 4:
            if(data.isEmpty()== true)
            {
              System.out.println("==> empty");
            }
            else
            {
              System.out.println("==> not empty");
            }
            break;
            case 5:
              System.out.println("==> size ="+ data.size());
            break;
            case 6:
            System.out.println(data.toString());
            break;
            

        }
        menu();
        choice = inputChoice();
     }
      System.out.println("End Program");
    }
    private static void menu()
    {
         System.out.println("----- Menu -----");
         System.out.println("1 Add     data");
         System.out.println("2 Find    data");
         System.out.println("3 Remove  data");
         System.out.println("4 Check   data ");
         System.out.println("5 Size    data");
         System.out.println("6 Print   data");
         System.out.println("---- 0 quit ----- ");
      }

     private static int inputChoice()
     {
       Scanner in = new Scanner(System.in);
       System.out.print("Press number: ");
       int x = in.nextInt();
       return x;
     }

     private static Object input()
     {
       Scanner in = new Scanner(System.in);
       String word = in.nextLine();
       return word;
     }
  }
