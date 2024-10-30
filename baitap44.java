package phamngocminhquan;

public class baitap44 {
    public static void main(String[] args) {
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}, {7}};   
        System.out.println("Các phần tử của mảng arr2 là:");
        for (int i = 0; i < arr2.length; i++) {        
            for (int j = 0; j < arr2[i].length; j++) {  
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

