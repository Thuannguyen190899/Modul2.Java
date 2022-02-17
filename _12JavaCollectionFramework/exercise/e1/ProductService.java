package _Module2_java._12JavaCollectionFramework.exercise.e1;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Objects;

public class ProductService extends Product {

    List<Product> productList = new ArrayList<Product>();
    public static Product[] products = new Product[10];
    Scanner scanner = new Scanner(System.in);

    static {
            products[0] = new Product("1a", "Sữa rửa mặt", 150000);
            products[1] = new Product("1b", "Bông tẩy trang", 35000);
            products[2] = new Product("1c", "Sữa tắm", 110000);
            products[3] = new Product("1d", "Kem dưỡng ẩm", 250000);
            products[4] = new Product("1e", "Mặt nạ ngủ", 15000);

        }

        public Product [] getAll () {
        return products;
        }


    public void display () {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.toString());
            }
        }
    }
    public void add () {
        System.out.println("Nhập số lượng sản phẩm mới");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Nhập id");
            String id = scanner.nextLine();
            System.out.println("Nhập tên sản phẩm");
            String name = scanner.nextLine();
            System.out.println("Nhập giá");
            double price = Integer.parseInt(scanner.nextLine());

            Product product = new Product(id, name, price);
            productList.add(product);

        }
        System.out.println(productList.toString());
    }
    public void edit () {

        System.out.println("Nhập id sản phẩm bạn muốn chỉnh sửa");
        String id = scanner.nextLine();
        for (Product product : products) {
            if (product != null && product.getId().equals(id)) {
                System.out.println("Mời bạn sửa tên");
                String newName = scanner.nextLine();
                System.out.println("Mời bạn sửa giá");
                double newPrice = Integer.parseInt(scanner.nextLine());
                product.setName(newName);
                product.setPrice(newPrice);
                System.out.println(product.toString());
                break;
            }

        }

    }
    public void delete () {
        System.out.println("Nhập id sản phẩm bạn muốn xóa");

    }
    public void find () {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm");
        String findName = scanner.nextLine();
        for (Product product : products) {
            if (product.getName() == findName) {
                System.out.println(product.toString());
            }
        }


    }
    public void increaseSort () {

    }

    public void exit () {
        System.out.println("Đóng trình quản lý");
        System.exit(0);
    }
}
