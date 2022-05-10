import java.util.ArrayList;
public class App {
    public static void main(String[] args)  {
       ArrayList<String> arr = new ArrayList<>();
       arr.add("HTML");
       arr.add("CSS");
       arr.add("JAVACRIPT");
       arr.add("JAVA");
       arr.add("C#");

       System.out.println("Cac phan tu trong mang ArrList la :");
       for (int i = 0; i < arr.size(); i++) {
           System.out.println(arr.get(i) + "\t");
       }

       arr.set(4, "C++");
       System.out.println("Cac phan tu trong mang ArrList la :");
       for (int i = 0; i < arr.size(); i++) {
        System.out.println(arr.get(i) + "\t");
    }
    }
}
