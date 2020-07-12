package controller.method;

import model.Food;

import java.util.ArrayList;

public class ShowOrderList {
    public static void showOrderList(ArrayList<Food> orderList) {
        if (orderList.isEmpty()) {
            System.out.println("Đang ế,chưa có ai vào ăn đâu!");
        } else {
            for (Food product : orderList) {
                System.out.println(product.toString());
            }
        }

    }
}