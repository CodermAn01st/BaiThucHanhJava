package shapes;
import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru() {
      ten = "Hinh Tru";
    }      
    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.println("Chieu cao");
        try (Scanner scanner = new Scanner(System.in)) {
          chieuCao = scanner.nextFloat();
        }
 } 
    public void tinhTheTich() {
        System.out.println("The tich" + theTich);
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}


