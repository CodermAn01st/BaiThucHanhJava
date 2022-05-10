import java.util.Scanner; 
public class App81 {
    public static void main( String[] args) {
    int m, n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so dong: ");
    m = scanner.nextInt();
    System.out.println("Nhap so cot: ");
    n = scanner.nextInt();
    int A[][] = new int[m][n];
    System.out.println("Nhap phan tu: ");
    for (int i = 0; i < m; i++) {
       for (int j = 0; j < n; j++) {
    System.out.print("A[" + i + "]["+ j + "]= ");
    A[i][j] = scanner.nextInt();  
}    
}

   int max = A[0][0];
   for (int i = 0; i < m; i++) {
       for (int j = 0; j < n; j++) {
       if (max < A[i][j]) {
       max = A[i][j];
     } 
  }  
}
System.out.println("Phan tu max  = " + max);
scanner.close();
   }
}

    