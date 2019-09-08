/*
 * print_t.java
 * 
 * Copyright 2019 roman <roman@roman-pc>
 * 
 * 
 */
//import java.util.Scanner;

public class CommandLine {
  public static void main (String[] args) {

        if(args.length == 0)
    {
        System.out.println("Error! Arguments is empty!");
        System.exit(0);
    }
    
    System.out.println("numbe one arg: " + args[0]);
  }
}

