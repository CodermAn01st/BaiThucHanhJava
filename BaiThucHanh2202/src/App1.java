import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        num1 = (int)scanner.nextInt();
        System.out.print("Nhập số thứ hai:");
        num2 = (int)scanner.nextInt();
        scanner.close();
        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        System.out.printf("Uoc chung max la: %d", num2);
    }
}