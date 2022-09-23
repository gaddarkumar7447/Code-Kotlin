import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class JavaClass {
    public static void bf (){
        System.out.println("hello");
    }
    public String complexNumberMultiply(String num1, String num2) {
        String[] a = num1.split("\\+|i");
        String[] b = num2.split("\\+|i");
        int ar = Integer.parseInt(a[0]), ai = Integer.parseInt(a[1]);
        int br = Integer.parseInt(b[0]), bi = Integer.parseInt(b[1]);
        return String.format("%d+%di",ar*br -ai*bi, ar*bi + ai*br);
    }

    public static String a(){
        return "Gaddar";
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        hashMap1.put(1,2);
        hashMap1.put(13,2);
        hashMap1.put(4,2);
        System.out.println(hashMap1);
        for (int i : hashMap1.values())
        {
            System.out.println(i);
        }

        /*System.out.println(a());
        Double d = new Double(0/0.);
        System.out.println(d.isNaN());*/
        /*String  num1 = "1+1i";
        String num2 = "1+1i";
        String[] a = num1.split("\\+|i");
        String[] b = num2.split("\\+|i");
        System.out.println(Arrays.toString(a));*/

        /*String a = "gaddar";
        char []chars = a.toCharArray();
        System.out.println(chars[3]);
        List<List<Integer>> list = new ArrayList<>(List.of(List.of(1,2,3,4,5),List.of(2,7,8),List.of(2,9,5),List.of(4,5,6)));
        System.out.println(list);
        System.out.println(Arrays.toString(chars));*/
    }
}
