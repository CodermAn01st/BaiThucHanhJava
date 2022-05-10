import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
           int n, soDu, Tong = 0;
           Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao 1 so n bat ky : ");
            n = scanner.nextInt();
            while (n > 0) {
                soDu = n % 10;
                n = n / 10;
                Tong += soDu;
        }
        System.out.println("Tong cac chu so bang: " + Tong);
        scanner.close();
    }
}