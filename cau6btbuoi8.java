package Baitapbuoi8;

public class cau6 {
    public static void main(String[] args) {
        int height = 5;
        for(int i = 1;i <= height;++i){
            for(int j = 1;j <= height - i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= i;k++){
                System.out.print(k);
            }
            for(int k =i - 1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
