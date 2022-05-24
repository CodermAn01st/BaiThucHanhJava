package COLLECTIONS.collectiosList;
import java.util.LinkedList;

public class App38 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Java");
    list.add("c++");
    list.add("php");
    list.add("Java");

    System.out.println("vi du su dung phuong thuc addAll()");
    LinkedList<String> listA = new LinkedList<String>();
    listA.addAll(list);
    System.out.println("ListA:");
    showList(listA);
    System.out.println("\nVi du su dung phuong thuc retainAll()");
    LinkedList<String> listB = new LinkedList<String>();
    listB.add("Java");
    listA.retainAll(listB);
    System.out.println("listA:");
    showList(listA);

    System.out.println("\nVi du su dung phuong thuc removeAll()");
    list.removeAll(listB);
    System.out.println("List:");
    showList(list);
  } 
  public static void showList(LinkedList<String> list) {
    for(String obj : list) {
      System.out.print("\t" + obj + ",");
    }
    System.out.println();
   }  
  }
