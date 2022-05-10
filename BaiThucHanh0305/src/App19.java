import java.util.ArrayList;
import java.util.ListIterator;
public class App19 {
    public static void main(String[] args)  {
       ArrayList<Character> arrChar = new ArrayList<>();
       arrChar.add('a');
       arrChar.add('b');
       arrChar.add('c');
       arrChar.add('d');

       ListIterator<Character> listIterator = arrChar.listIterator();
       System.out.println("Cac phan tu trong mang ArrList la :");
       while(listIterator.hasNext()) {
           System.out.println(listIterator.next()+ "\t");
       }
    }
}
