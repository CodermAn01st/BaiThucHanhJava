import java.util.ArrayList;

public class App21 {
  public static void main(String[] args ) {
    ArrayList<String> arrList = new ArrayList<>();
    arrList.add("red");
    arrList.add("blue");
    arrList.add("green");
    arrList.add("orange");
    arrList.remove("green");
    arrList.add("pink");
    arrList.add("yellow");
    
    System.out.println(arrList.get(1));
    System.out.println(arrList.contains("orange"));
    System.out.println(arrList.size());
    System.out.println(arrList);

  }
}