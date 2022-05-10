import java.util.ArrayList;
import java.util.Iterator;
public class App18 {
    public static void main(String[] args)  {
       ArrayList<Float> arrFloat = new ArrayList<>();
       arrFloat.add(0.7f);
       arrFloat.add(7.26f);
       arrFloat.add(1.03f);
       arrFloat.add(9.3f);

       Iterator<Float> iterator = arrFloat.iterator();
       System.out.println("Cac phan tu trong mang ArrList la :");
       while(iterator.hasNext()) {
           System.out.println(iterator.next()+ "\t");
       }
    }
}
