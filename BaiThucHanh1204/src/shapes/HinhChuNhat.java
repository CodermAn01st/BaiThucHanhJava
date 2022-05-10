package shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {

  public float dai;
  public float rong;

  public HinhChuNhat() {
    ten = "Hinh Chu Nhat";
  }
  public void nhapChieuDai() {
      System.out.println("Chieu dai = ");
      try (Scanner scanner = new Scanner(System.in)) {
      }
  }
  public void nhapchieuRong() {
    System.out.println("Chieu rong = ");
    try (Scanner scanner = new Scanner(System.in)) {
    }
}
  public void tinhChuVi() {
    chuVi = 2 * (dai + rong);
  }
  public void tinhDienTich() {
    dienTich = dai * rong;
  }
}
