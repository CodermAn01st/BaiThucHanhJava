import java.util.LinkedList;
public class App38 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("java");
    list.add("c++");
    list.add("php");
    list.add("ajax");

    System.out.println("Vi du ve phuong thuc addAll()");
    LinkedList<String> listA = new LinkedList<>();
    listA.addAll(list);
    System.out.println("listA: ");
    showList(listA);
    System.out.println("\nvi du su dung phuong thuc retainAll()");
    LinkedList<String> listB = new LinkedList<>();
    listB.add("Java");
    listA.retainAll(listB);
    System.out.println("listA:");
    showList(listA);

    System.out.println("\nVi du su dung phuong thuc removeAll()");
    list.removeAll(listB);
    System.out.printf("list:");
    showList(list);
  }
  public static void showList(LinkedList<String> list) {
    for (String obj : list) {
      System.out.println("\t" + obj + ",");
    }
    System.out.println();
  }
}
