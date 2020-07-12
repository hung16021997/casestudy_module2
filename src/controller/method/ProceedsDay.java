package controller.method;

import model.Food;
import model.Proceeds;
import storage.ProductList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProceedsDay {
    public static void proceedsDay(ArrayList<Food>orderList) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ProductList proceeds = ProductList.getInstance();
        ArrayList<Proceeds> proceedsList = proceeds.proceedsList;
        int sum = 0;
        for (Food food : orderList) {
            sum += food.getPrice() * food.getAmount();
        }
        System.out.println("Hôm nay ngày: ");
        String day = sc.next();
        Proceeds prc = new Proceeds(day,sum);
        proceedsList.add(prc);
        System.out.println("Ngày hôm nay bán được: "+sum);
    }
}