import java.util.Scanner;
public class App40 {
    public static void main(String agre[]) {

        Scanner scanner=new Scanner (System.in);
        
        int ngay=scanner.nextInt();//Đọc vào một số​
        
        switch (ngay) {
            case 1: System.out.println("Thu hai");    
                break;
            case 2: System.out.println("Thu hai");    
                break;
            case 3: System.out.println("Thu hai");    
                break;
            case 4: System.out.println("Thu hai");   
                break;
            case 5: System.out.println("Thu hai");  
                break;
            case 6: System.out.println("Thu hai");   
                break;
            case 7: System.out.println("Thu hai");    
                break;
            case 8: System.out.println("Thu hai");   
                break;    
        
            default: System.out.println("Nhap sai");
                break;
        }
    }
}