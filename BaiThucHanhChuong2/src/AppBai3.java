import java.util.Scanner;
 
public class AppBai3 {
 
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào năm sinh: ");
        year = scanner.nextInt();

        age = 2022 - year;  
        if (age < 16) {
            ageGroup = "tuoi vi thanh nien";
        } else if (age >= 16 || age < 18) {
            ageGroup = "Tuoi truong thanh";
        } else {
            ageGroup = " Ban da gia !";
        }

        System.out.println("Bạn " + name + " thuộc nhóm " + ageGroup);
        scanner.close();
    }

}