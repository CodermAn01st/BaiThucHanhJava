package COLLECTIONS.collectiosList;
import java.util.ArrayList;
import java.util.Scanner;
public class App24 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int number;
    System.out.println("Nhap so phan tu cua arrayList: ");
    int n = scanner.nextInt();
    for (int i = 0; i<n; i++) {
      System.out.println("Nhap phan tu thu " +i + ":");
      number = scanner.nextInt();
      arrayList.add(number);
    }
    int max = arrayList.get(0);

    for(int i = 1; i < arrayList.size(); i++) {
      if(arrayList.get(i).compareTo(max)  > 0) {
        max = arrayList.get(i);
      }
    }
    scanner.close();
  }
}
