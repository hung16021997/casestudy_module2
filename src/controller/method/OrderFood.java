package controller.method;

import model.Food;
import model.Product;
import storage.ProductList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderFood {
    public static void orderFood(ArrayList<Product> arrList) {
        ProductList order = ProductList.getInstance();
        List<Food> orderList = order.orderList;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nhập Id của món khách order: ");
        int numberId = scanner.nextInt();
        for (int i = 0; i < arrList.size(); i++) {
            if (i == numberId) {
                String id = arrList.get(i).getId();
                String name = arrList.get(i).getName();
                int price = arrList.get(i).getPrice();
                String description = arrList.get(i).getDescription();
                System.out.println("Bạn đang phục vụ bàn nào?");
                String table = scanner.next();
                table = AddProduct.checkNull(scanner,table,"Cần nhập tên bàn");
                System.out.println("Nhập số lượng đồ ăn");
                String amount = scanner.next();
                amount = AddProduct.checkNull(scanner,amount,"Cần nhập số lượng");
                System.out.println("Khách có yêu cầu gì khác không?");
                String note = scanner.next();
                Food orderFoods = new Food(table,id, name, price,Integer.parseInt(amount),description,note, "Đang chờ","Chưa thanh toán");
                orderList.add(orderFoods);
                break;
            }
        }
    }
}
