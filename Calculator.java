// x -> a and any
// this is calc from arabic int

public class Calculator {
    public static void main(String[] args){

    if(args.length != 3) // if null in args, if overmany args
    {
        System.out.println("Error! Arguments is empty!");
        System.exit(0);
    }
        
        int a = Integer.parseInt(args[0]);
        String b = args[1];
        int c = Integer.parseInt(args[2]);
        int z;

        if (b.equals("+")) {
            z = a+c;
        } else if (b.equals("-")){
            z = a-c;
        } else if (b.equals("*")){
            z = a*c;
        } else if (b.equals("/")){
            z = a/c;
        } else{
             throw new java.lang.Error("Operator not recognized");
        }
        System.out.println(z);
    }
}
