package phamngocminhquan;

import java.util.Scanner;

public class baitap2nc {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Nhap mot so nguyen: ");
       int n = scanner.nextInt();

       for (int i = 1; i <= n; i ++){
        if (i % 2 !=0) {

            System.out.println(i + " ");
            
        }
       }
       scanner.close();
    }
    
}


