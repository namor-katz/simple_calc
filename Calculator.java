// this is calc from arabic int
import java.util.Scanner;

class Box {
    int width; // ширина коробки
    int height; // высота коробки
    int depth; // глубина коробки

    // вычисляем объём коробки
    String getVolume() {
        return "Объём коробки: " + (width * height * depth);
    }
}


public class Calculator {

    public static void main(String[] args){

    if(args.length != 3) // if null in args, if overmany args
    {
        System.out.println("Error! Arguments is not a + b! example: 1 + 3");
        System.exit(0);
    }

        int a = Integer.parseInt(args[0]);
        String b = args[1];
        int c = Integer.parseInt(args[2]);
        int z;


//start main

//end main

// TODOS: very long, refactory!!
        if (a > 10 || a < 0)
            {
                System.out.println("Error! very bin int!");
                System.exit(0);
                }

        if (c > 10 || c < 0)
            {
                System.out.println("Error! very bin int!");
                System.exit(0);
                }
// end TODOS

        if (b.equals("+")) {
            z = a+c;
        }
        else if (b.equals("-")){
            z = a-c;
        }
        else if (b.equals("*")){
            z = a*c;
        }
        else if (b.equals("/")){
            z = a/c;
        }
        else{
             throw new java.lang.Error("Operator not recognized");
        }
        System.out.println(z);
    }
}
