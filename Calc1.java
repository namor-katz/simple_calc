import java.util.Scanner;

class Calc1 {
  public static void main(String[] args) {
    int a;
    int b;

    Scanner input = new Scanner(System.in); // create scanner?
    System.out.println("Enter number 1: ");
    a = input.nextInt();
    System.out.println("Enter number 2: ");
    b = input.nextInt();
    System.out.println("Please enter operation + - / or *: ");
    Scanner op = new Scanner(System.in);
    String operation = op.next();

    if (operation.equals("+")) {
      System.out.println(a + " + " + b + " = " + (a + b));
    }
    if (operation.equals("-")){
      System.out.println(a + " - " + b + " = " + (a - b));
    }
    if (operation.equals("/")){
      System.out.println(a + " ÷ " + b + " = " + (a / b));
    }
    if (operation.equals("*")){
      System.out.println(a + " x " + b + " = " + (a * b));
    }
    
  }
}
