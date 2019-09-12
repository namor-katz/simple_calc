//определяем класс для арабских цифр 1-10
class ArabicNumbers {
    //int digit;
    int a, b, c, d, e, f, g, h, i, j;
    boolean if_tru(int digit){
        if (digit > 0 && digit < 11){ //о питончик, ты топчик (
            return true;
            }
        else
            {
                return false;} //оно не может в один if! омерзительно!
        }
}

//определяем класс для латинских цифр   I - X
class LatinNumbers {
    String a, b, c, d, e, f, g, h, i, j;
    }

class CheckLen {
    // проверяем количество аргументов. должно быть ровно 3
    public static void che(String[] args){

    if(args.length != 3)
        {
            System.out.println("Error! Arguments is not a + b! example: 1 + 3");
            System.exit(0);
        }
    }
}

/*
class CheckArab{
    public static void this_arab(String[] args)
        boolean check1 = Characted.isDigit(a);
        if (check1){
            System.out.println("Yes");
            }
    }
*/

class sum {
    // после всех проверок складываем арабские цифры, возвращаем арабскую цифру.
    public static int sum(int a, String b, int c){
        int z;

        if (b.equals("+")) 
            {z = a+c;}
        else if (b.equals("-"))
            {z = a-c;}
        else if (b.equals("*"))
            {z = a*c;}
        else if (b.equals("/"))
            {z = a/c;}
        else
        {throw new java.lang.Error("Operator not recognized");}

        return z;
    }
}

public class Calculator2 {
    //build all function and class
    public static void main(String[] args){

    // итак,  метод - статик. экземпляр объявлять не надо. аргументы просто
    // как есть, без указания типа. принимаемый тип уже указан в объявлении...
    CheckLen.che(args);

    int a = Integer.parseInt(args[0]);
    String b = args[1];
    int c = Integer.parseInt(args[2]);

        //создаём арабские и латинские цифры
        ArabicNumbers Ar = new ArabicNumbers();
        LatinNumbers Ln = new LatinNumbers();
        
        //определяем содержание классов с цифрами
        Ar.a = 1; Ar.b = 2; Ar.c = 3; Ar.d = 4; Ar.e = 5; Ar.f = 6; Ar.g = 7;
        Ar.h = 8; Ar.i = 9; Ar.j = 10;
        
        Ln.a = "I"; Ln.b = "II";

        System.out.print(Ar.if_tru(a) + "\n");

        int z = sum.sum(a, b, c);
        System.out.println(z);
    }
}
