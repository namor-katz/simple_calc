import java.util.*;
//определяем класс для арабских цифр 1-10
class ArabicNumbers {
    int[] arabic = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    //проверка на то, что число входит в диапазон 1-10
    boolean if_tru(int digit){
        //о питончик, ты топчик (
        if (digit > 0 && digit < 11)
            return true;
        else
            {
                return false;
            } //оно не может в один if! омерзительно!
        }
}

//определяем класс для латинских цифр I - X
class LatinNumbers {
    static String[] latin = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    // проверка на вхождение строки в массив

    public static boolean if_tru(String[] array, String lat_string) {
        List<String> list = Arrays.asList(latin);
        boolean result = Arrays.asList(latin).contains(lat_string);
        return result;
    }
}


class LatinToArabic {
    //вернуть словарь лат: арабик
    public static Map latin_to_arabic(String[] Ln, int[] Ar) {
        Map<String, Integer> states = new HashMap<String, Integer>();
        for (int i = 0; i < Ln.length; i++) {
            states.put(Ln[i], Ar[i]);
        }
        return states;
    }
}

class ArabicToLatin {
    //вернуть словарь арабик: лат
    public static Map arabic_to_latin(String[] Ln, int[] Ar) {
        Map<Integer, String> states2 = new HashMap<Integer, String>();
        for (int i = 0; i < Ln.length; i++) {
            states2.put(Ar[i], Ln[i]);
        }
        return states2;
    }
}

class CheckLen {
    // check count args, if != 3; exit
    public static void che(String[] args){

    if(args.length != 3)
        {
            System.out.println("Error! Arguments is not a + b! example: 1 + 3");
            System.exit(0);
        }
    }
}

class sum {
    // после всех проверок складываем арабские цифры, возвращаем арабскую цифру.
    // латинок будем конвертить.
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
            {throw new java.lang.Error("Operator not recognized. Use +, -, *, or /");}

        return z;
    }
}

public class Calculator2 {
    //build all function and class
    public static void main(String[] args){
    // итак,  метод - статик. экземпляр объявлять не надо. аргументы просто
    // как есть, без указания типа. принимаемый тип уже указан в объявлении...
    CheckLen.che(args); // проверяем что аргументов ровно 3
    //создаём арабские и латинские цифры
    ArabicNumbers Ar = new ArabicNumbers();
    LatinNumbers Ln = new LatinNumbers();
    Map<String, Integer> states = LatinToArabic.latin_to_arabic(Ln.latin, Ar.arabic);
    Map<Integer, String> states2 = ArabicToLatin.arabic_to_latin(Ln.latin, Ar.arabic);

    //считываем аргументы командной строки, проверяем их соответствие требованиям.
    //read stdin, check args
    int a;
    boolean is_arabic1; //какого хуя ниже по потоку утверждает, что переменной нет? ведь будет либо тру либо катч, и она создастся.
    try {
        a = Integer.parseInt(args[0]);
        is_arabic1 = true;
    }
    catch (NumberFormatException nfe) {
        String a2 = args[0];
        a = states.get(a2);
        System.out.println("первый операнд не число, пробую преобразовать.");
        is_arabic1 = false;
    }

    String b = args[1];

    int c;
    boolean is_arabic2;
    try {
        c = Integer.parseInt(args[2]);
        is_arabic2 = true;
    }
    catch (NumberFormatException nfe) {
        String c2 = args[2];
        c = states.get(c2);
        System.out.println("второй операнд не число, пробую преобразовать.");
        is_arabic2 = false;
    }

    //оба аргумента арабские. если нет выйти
    boolean result_lat;
    if (is_arabic1 == true && is_arabic2 == true) {
        result_lat = false;
        System.out.println("обе цифры арабские, продолжаем.");
        }
    else if (is_arabic1 == false && is_arabic2 == false) {
        System.out.println("обе цифры латинские, продолжаем.");
        result_lat = true;
    }
    else {
        System.out.println("Error! Not mixed args! Good: 1 + 2 OR V - I. BAD 2 + V.");
        result_lat = false; //оно всё равно выйдет и не пройдет дальше.
        System.exit(0);
    }


        ///уря победа
        int z = sum.sum(a, b, c);
        if (result_lat == false) {
            System.out.println(z);
        }
        else if (result_lat == true) {
            String z2 = states2.get(z);
            System.out.println(z2);
        }
        else
            {
                System.out.println("Так быть не может.");
            }
    }
}
