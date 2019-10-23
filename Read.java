import java.util.Scanner;
/*
public class Read {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num = in.nextLine();
          
        System.out.printf(num);
        //System.out.printf(num.length());
        in.close();
    }
}
*/

public class Read {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введи что нибудь вроде этого 1 + 3 ");
        String str;
    try {
        str = in.nextLine();
        String[] subStr;
        String delimeter = " "; // Разделитель
        subStr = str.split(delimeter); // Разделения строки str с помощью метода split()

        for(int i = 0; i < 3; i++) { 
         System.out.println(subStr[i]); 
            }
        }

        
    catch (java.lang.ArrayIndexOutOfBoundsException e)
        {System.out.println("требуется цифра, знак операции, цифра. например 5 - 1");}
      // Вывод результата на экран
      
    }
}
