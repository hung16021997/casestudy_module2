package user;

import controller.ProductManager;
import storage.ProductList;
import storage.Synchronized;

import java.util.Scanner;

public class UserDisplay {
    ProductManager productManager = new ProductManager();
    ProductList list = ProductList.getInstance();
    int accType = -1;
    Scanner sc = new Scanner(System.in);
    Synchronized aSynchronized = new Synchronized();
    public void start() {
        showUseSelection();
        int userOption = sc.nextInt();
        aSynchronized.readToFileMenu(list.getMenuFile());
        aSynchronized.readToFileProceeds(list.getProceedsDay());
        switch (userOption) {
            case 1:
                showMenuAdmin();
                start();
                break;
            case 2:
                showMenuCashier();
                start();
                break;
            case 3:
                showMenuChef();
                start();
                break;
            case 0:
                aSynchronized.writeToFileMenu(list.getMenuFile());
                aSynchronized.writeToFileProceeds(list.getProceedsDay());
                System.exit(0);
        }
    }

    private void showUseSelection() {
        System.out.println("Welcome to Restaurant: Who are you?");
        System.out.println("1. Admin");
        System.out.println("2. Cashier");
        System.out.println("3. Chef");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private void showMenuAdmin() {
        System.out.println("=====Menu=====");
        System.out.println("1. Show food menu");
        System.out.println("2. Find food by name");
        System.out.println("3. Add food in menu");
        System.out.println("4. Delete product by id");
        System.out.println("5. Edit food menu");
        System.out.println("6. Show food order");
        System.out.println("7. Doanh thu ngày hôm nay");
        System.out.println("8. Doanh thu ngày cao nhất");
        System.out.println("9. Doanh thu ngày thấp nhất");
        System.out.println("0. Save and Exit");
        System.out.print("Enter your choice: ");
        int adminOption = sc.nextInt();
        switch (adminOption) {
            case 1:
                productManager.showMenu();
                showMenuAdmin();
                break;
            case 2:
                productManager.findProduct();
                showMenuAdmin();
                break;
            case 3:
                productManager.addProduct();
                showMenuAdmin();
                break;
            case 4:
                productManager.deleteProduct();
                showMenuAdmin();
                break;
            case 5:
                productManager.editInformationProduct();
                showMenuAdmin();
                break;
            case 6:
                productManager.showOrderList();
                showMenuAdmin();
                break;
            case 7:
                productManager.proceedsOf_day();
                showMenuAdmin();
                break;
            case 8:
                productManager.sortDownProceedsOf_day();
                showMenuAdmin();
                break;
            case 9:
                productManager.sortUpProceedsOf_day();
                showMenuAdmin();
                break;
            case 0:
                System.out.println("Login out...");
                aSynchronized.writeToFileMenu(list.getMenuFile());
                aSynchronized.writeToFileProceeds(list.getProceedsDay());
                System.exit(0);
        }
    }
    private void showMenuCashier() {
        System.out.println("=====Menu=====");
        System.out.println("1. Show food menu");
        System.out.println("2. Find food by name");
        System.out.println("3. Order food");
        System.out.println("4. Show food order");
        System.out.println("5. Pay");
        System.out.println("0. Exit");
//        System.out.println("0. Return to Menu");
        System.out.print("Enter your choice: ");
        int cashierOption = sc.nextInt();
        switch (cashierOption) {
            case 1:
                productManager.showMenu();
                showMenuCashier();
                break;
            case 2:
                productManager.findProduct();
                showMenuCashier();
                break;
            case 3:
                productManager.orderFood();
                showMenuCashier();
                break;
            case 4:
                productManager.showOrderList();
                showMenuCashier();
                break;
            case 5:
                productManager.pay();
                showMenuCashier();
                break;
            case 0:
                showUseSelection();
                break;
//                System.exit(0);
        }
    }
    private void showMenuChef() {
        System.out.println("=====Menu=====");
        System.out.println("1. Show food order");
        System.out.println("2. Ordered");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int chefOption = sc.nextInt();
        switch (chefOption) {
            case 1:
                productManager.showOrderList();
                showMenuChef();
                break;
            case 2:
                productManager.ordered();
                showMenuChef();
                break;
            case 0:
                showUseSelection();
                break;
//                System.exit(0);
        }
    }
}