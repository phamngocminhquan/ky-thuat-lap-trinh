package phamngocminhquan;

public class baitap43 { 
        public static void main(String[] args) {
            // Khai báo và khởi tạo mảng hai chiều arr1 với kích thước 2x3
            int arr1[][] = new int[2][3];
    
            // Gán giá trị cho các phần tử của mảng
            arr1[0][0] = 1;
            arr1[0][1] = 2;
            arr1[0][2] = 3;
            arr1[1][0] = 4;
            arr1[1][1] = 5;
            arr1[1][2] = 6;
    
            // Hiển thị các phần tử của mảng
            System.out.println("Các phần tử của mảng arr1 là:");
            for (int i = 0; i < arr1.length; i++) {        // Duyệt qua các hàng
                for (int j = 0; j < arr1[i].length; j++) { // Duyệt qua các cột
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println(); // Xuống dòng sau mỗi hàng
            }
        }
    }
