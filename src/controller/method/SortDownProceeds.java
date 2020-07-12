package controller.method;

import model.Proceeds;

import java.util.ArrayList;

public class SortDownProceeds {
    public static void sortDownProceeds(ArrayList<Proceeds>arrayList) {
        boolean status = true;
        for (int k = 1; k < arrayList.size() && status; k++) {
            status = false;
            for (int i = 0; i < arrayList.size() - k; i++) {
                if (arrayList.get(i).getMoney() < arrayList.get(i + 1).getMoney()) {
                    Proceeds temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    status = true;
                }
            }
        }
        System.out.println("Doanh thu theo thứ tự giảm dần: ");
        for (Proceeds proceeds : arrayList) {
            System.out.println(proceeds);
        }
    }
}
