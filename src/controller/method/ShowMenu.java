package controller.method;

import model.Product;

import java.util.ArrayList;

public class ShowMenu {
    public static void showProductList(ArrayList<Product> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("Menu chưa có gì, cần đưa thực đơn vào!");
        } else {
            for (Product thisProduct : arrayList) {
                System.out.println(thisProduct.toString());
            }
        }
    }
}
