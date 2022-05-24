import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class App113 {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    String name;
    hashSet.add("Tao");
    hashSet.add("Thanh long");
    hashSet.add("Xoai");
    hashSet.add("Nhan");
    hashSet.add("Mit");
    hashSet.add("Buoi");

    System.out.println("Các phần tử có trong hashSet là: ");
    System.out.println(hashSet);

    System.out.println("Nhap mot loai trai cay bat ky:");
    name = sc.next();
    if(hashSet.contains(name)) {
      System.out.println("Tim thay ten trai cay vua nhap");
    } else {
      System.out.println("khong tim thay ten trai cay vua nhap");
    }
    hashSet.remove("Tao");
    System.out.println("Các phần tử con lai trong hashSet là: ");
    System.out.println(hashSet);

    List<String> list = new ArrayList<>();
    list.add("Tao");
    list.add("Chuoi");
    list.add("Hong xiem");
    list.add("Dua chuot");

    hashSet.addAll(list);
    System.out.println("Các phần tử có trong hashSet sau khi thêm: ");
    Iterator<String> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");
    }
    hashSet.removeAll(list);
    System.out.println("\nCác phần tử có trong hashSet sau khi xóa: " + hashSet);
    sc.close();
  }
}
