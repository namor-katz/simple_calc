/*
 * print_t.java
 * 
 * Copyright 2019 roman <roman@roman-pc>
 * thi is main version
 * 
 */

//package MapTest;

public class Calc {
  public static void main (String[] args) {
    String a0, b0, c0;
    int a, c, d;
    char b;
    
    if(args.length != 3)
    {
        System.out.println("Error! Arguments is empty!");
        System.exit(0);
    }
    
    a0 = args[0];
    a = Integer.parseInt(a0);
    c0 = args[2];
    c = Integer.parseInt(c0);
    b0 = args[1];
    b = b0.charAt(0);
    d = a b c;
    
    System.out.println(a + b + c);
    System.out.println(b0.getClass().getName());
  }
}



