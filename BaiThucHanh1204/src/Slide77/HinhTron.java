package Slide77;

import java.util.Scanner;

public class HinhTron {
  protected float banKinh;
  private Scanner scanner;

  public HinhTron() {
      super();
      Scanner scanner = new Scanner(System.in);
      scanner.close();
  }

  public void nhapBanKinh() {
      System.out.println("Ban dung don vi tinh nao: ");
      System.out.println("\t1 - Centimet");
      System.out.println("\t2 - inch");
      configs.donVi = scanner.nextInt();

      System.out.println("Hay nhap vao ban kinh Hinh Tron");
      banKinh = scanner.nextFloat();
  }

  public void inThongTin() {
      if (configs.donVi == configs.DON_VI_CM) {
          System.out.println("Hinh tron co ban kinh " + banKinh + " cm");
          System.out.println("Tuong Duong " + configs.ChuyenCentimetSangInch(banKinh) + "inch");
      } else {
          System.out.println("Hinh tron co ban kinh " + banKinh + " inch");
          System.out.println("Tuong duong " + configs.ChuyenInchSangCentimet(banKinh) + " cm");
      }
  }
}