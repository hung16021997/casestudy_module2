package controller.method;

import model.Food;
import java.util.ArrayList;
import java.util.Scanner;

public class Pay {
    public static void pay(ArrayList<Food>arrList) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bàn nào cần thanh toán?");
        String table = sc.next();
        int sum = 0;
        for (int i=0;i<arrList.size();i++) {
            if (table.equals(arrList.get(i).getTable())) {
                if (arrList.get(i).getCooked().equalsIgnoreCase("Đang chờ")) {
                    System.out.println("Đã ăn đâu mà thanh toán");
                } else if (!arrList.get(i).getPaid().equalsIgnoreCase("Chưa thanh toán")) {
                    System.out.println("Bàn này thanh toán rồi");
                } else {
                    sum += arrList.get(i).getPrice() * arrList.get(i).getAmount();
                    arrList.get(i).setPaid("Đã thanh toán");
                }
            }
        }
        System.out.println("Bàn này tổng hết: "+sum);
    }
}
