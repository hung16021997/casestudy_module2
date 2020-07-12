package controller.method;

import model.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordered {
    public static void ordered(ArrayList<Food>foodArrayList) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int sum = 0;
        if (foodArrayList.size()==0) {
            System.out.println("Chưa có gì để làm!");
        } else {
            System.out.println("Món nào đã xong?");
            String id = sc.next();
            System.out.println("Của bàn nào?");
            String table = sc.next();
            for (int i=0;i<foodArrayList.size();i++) {
                if (id.equals(foodArrayList.get(i).getId()) && table.equals(foodArrayList.get(i).getTable()) && foodArrayList.get(i).getCooked().equals("Đang chờ")) {
                    foodArrayList.get(i).setCooked("Ordered");
                    break;
                }
            }
        }
    }
}