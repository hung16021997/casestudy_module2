package controller.method;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class AddProduct {
    public static void addProduct(ArrayList<Product>arrayList) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nhập mã id:");
        String newId = scanner.next();
        newId = checkNull(scanner, newId, "Vui lòng nhập id:");

        System.out.println("Nhập tên món mới:");
        String newName = scanner.next();
        newName = checkNull(scanner, newName, "Vui lòng nhập tên món:");

        System.out.println("Nhập đơn giá:");
        String newPrice = scanner.next();
        newPrice = checkNull(scanner, newPrice, "Vui lòng nhập đơn giá:");

        System.out.println("Chú thích món:");
        String newDescription = scanner.next();
        newDescription = checkNull(scanner, newDescription, "Vui lòng nhập chú thích món:");

        Product newProduct = new Product(newId,newName,Integer.parseInt(newPrice),newDescription){};
        arrayList.add(newProduct);
        System.out.println("Thao tác thành công");
    }

    public static String checkNull(Scanner scanner,String input, String s) {
        while (input.equals("")) {
            System.out.println(s);
            input = scanner.next();
        }
        return input;
    }
}
