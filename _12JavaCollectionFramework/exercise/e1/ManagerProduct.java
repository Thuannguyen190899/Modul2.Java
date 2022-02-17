package _Module2_java._12JavaCollectionFramework.exercise.e1;


import java.util.Scanner;

public class ManagerProduct {

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn thao tác");
        System.out.println( "1. Hiển thị danh sách sản phẩm\n" +
                "2. Thêm sản phẩm\n" +
                "3. Sửa thông tin sản phẩm theo id\n" +
                "4. Xoá sản phẩm theo id\n" +
                "5. Tìm kiếm sản phẩm theo tên\n" +
                "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                "7. Exit");


        int choose = Integer.parseInt(scanner.nextLine());

      switch (choose) {
          case 1:
               productService.display();
              break;

          case 2:
                productService.add();
              break;

          case 3:
                productService.edit();
               break;
          case 4:
                productService.delete();
              break;

          case 5:
              productService.find();
              break;

          case 6:
              productService.increaseSort();
              break;

          case 7:
              productService.exit();

      }
    }
}
