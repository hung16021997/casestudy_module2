package controller.method;

import model.Proceeds;
import storage.ProductList;
import storage.Synchronized;

import java.util.ArrayList;

public class SortUpProceeds {
    public static void sortUpProceeds(ArrayList<Proceeds>arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Proceeds currentMin = arrayList.get(i);
            int currentMinIndex = i;
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (currentMin.getMoney() > arrayList.get(j).getMoney()) {
                    currentMin = arrayList.get(j);
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                arrayList.set(currentMinIndex, arrayList.get(i));
                arrayList.set(i, currentMin);
            }
        }
        System.out.println("Doanh thu theo thứ tự tăng dần: ");
        for (Proceeds proceeds : arrayList) {
            System.out.println(proceeds);
        }
    }
}
