import java.util.Scanner;

public class AppBai10 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
             
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }
             
        System.out.println("So lan xuat hien ky tu " + kyTu +
            " trong chuỗi " + chuoi + " = " + count);
            scanner.close();
    }
}
