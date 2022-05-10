import java.util.ArrayList;
public class App17 {
    public static void main(String[] args)  {
       ArrayList<Integer> arrInteger = new ArrayList<>();
       arrInteger.add(0);
       arrInteger.add(7);
       arrInteger.add(1);
       arrInteger.add(9);

       System.out.println("Cac phan tu trong mang ArrList la :");
       for (int number : arrInteger) {
           System.out.println(number + "\t");
       }
    }
}
