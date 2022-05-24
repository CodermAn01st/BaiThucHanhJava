package COLLECTIONS.collectiosList;
import java.util.ListIterator;
import java.util.ArrayList;
public class App19 {
  public static void main(String[] args) {

    ArrayList<Character> arrayList = new ArrayList<>();
    arrayList.add('a');
    arrayList.add('e');
    arrayList.add('b');
    arrayList.add('c');
    ListIterator<Character> listIterator = arrayList.listIterator();
    System.out.println("Cac phan tu co trong arrListChar la :");
    while(listIterator.hasNext()) {
      System.out.println(listIterator.next() + "\t");
    }
  }
}
