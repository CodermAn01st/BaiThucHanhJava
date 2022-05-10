import java.util.LinkedList;
public class AppLink {
  public static void main (String[] args) {
    LinkedList<NhanVien> NV = new LinkedList<>();
    NhanVien NV1 = new NhanVien("a123", "Nguyen van a", "Ha Noi");
    NhanVien NV2 = new NhanVien("b123", "Nguyen van b", "Thai Binh");
    NhanVien NV3 = new NhanVien("c149", "Nguyen van c", "Quang Binh");
    NhanVien NV4 = new NhanVien("d130", "Nguyen van d", "Bac Ninh");
    NhanVien NV5 = new NhanVien("e420", "Nguyen van e", "Ha Noi");
    NV.add(NV1);
    NV.add(NV2);
    NV.add(NV3);
    NV.add(NV4);
    NV.remove(NV1);
    NV.add(NV5);
    NV.set(3,NV1);
    showList(NV);
  }
  private static void showList(LinkedList<NhanVien> NV) {
  }
}
