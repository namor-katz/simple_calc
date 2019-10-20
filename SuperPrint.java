import java.util.*;
/*
public class SuperPrint {
    int[] arabic = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] latin = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public static void Print([] String){
        System.out.println(String)
        }
    
    Print(latin[0])
    
}
*/

class SuperPrint {
    static String[] latin = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    // проверка на вхождение строки в массив
    
    public static boolean Check(String[] array, String fuck) {
        List<String> list = Arrays.asList(array);
        System.out.println(list);
        return Arrays.asList(array).contains(fuck);
        }
    
    public static void main(String[] args) {
        //String[] a = {"foo", "bar", "baz"};
        //System.out.println(latin.length);
        boolean Val = Check(latin, "you");
        if (Val == true){
            System.out.println("тру!");
            }
        else {
            System.out.println("фолс");
            }
        }
}
