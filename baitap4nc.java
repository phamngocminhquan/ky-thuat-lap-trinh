package phamngocminhquan;

import java.util.Scanner;

public class baitap4nc {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap mot so nguyen: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2)
            if (i % 2 == 0) 
        {
            System.out.println(i + " ");
        }
        scanner.close();
    }
}


