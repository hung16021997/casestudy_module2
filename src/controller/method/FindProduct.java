package controller.method;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class FindProduct {
    public static void findProduct(ArrayList<Product>arrayList) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nhập tên món cần tìm:");
        String name = scanner.next();
        boolean check=false;
        for (Product product : arrayList) {
            if (product.getName().equalsIgnoreCase(name)) {
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Món chưa có trong menu");
        } else {
            System.out.println("Món đã có trong menu");
        }
    }
}