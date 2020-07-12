package controller.method;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteProduct {
    public static void deleteProduct(ArrayList<Product>arrList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id của món muốn bỏ đi: ");
        String deleteId = sc.next();
        boolean check = false;
        for (int i=0;i<arrList.size();i++) {
            if (arrList.get(i).getId().equals(deleteId)) {
                arrList.remove(i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Bạn nhập sai id");
        } else {
            System.out.println("Đã xoá thành công");
        }
    }
}
