package controller;


import controller.method.*;
import impl.ProductManagerAct;
import model.Food;
import model.Proceeds;
import model.Product;
import storage.ProductList;

import java.util.ArrayList;

public class ProductManager implements ProductManagerAct {
    ProductList listManager = ProductList.getInstance();
    private final ArrayList<Product> arrayList = listManager.productsList;
    private final ArrayList<Food> orderList = listManager.orderList;
    private final ArrayList<Proceeds> proceedsList = listManager.proceedsList;
    private ProductManager EditInformationProduct;

    @Override
    public void addProduct() {
        AddProduct.addProduct(arrayList);
    }
    @Override
    public void showMenu() {
        ShowMenu.showProductList(arrayList);
    }

    @Override
    public void showOrderList() {
        ShowOrderList.showOrderList(orderList);
    }

    @Override
    public void ordered() {
        Ordered.ordered(orderList);
    }

    @Override
    public void editInformationProduct() {
        EditInformationProduct.editInformationProduct(arrayList);
    }

    private void editInformationProduct(ArrayList<Product> arrayList) {
    }

    @Override
    public void deleteProduct() {
        DeleteProduct.deleteProduct(arrayList);
    }

    @Override
    public void findProduct() {
        FindProduct.findProduct(arrayList);
    }

    @Override
    public void orderFood() {
        OrderFood.orderFood(arrayList);
    }

    @Override
    public void pay() {
        Pay.pay(orderList);
    }

    @Override
    public void proceedsOf_day() {
        ProceedsDay.proceedsDay(orderList);
    }

    @Override
    public void sortUpProceedsOf_day() {
        SortUpProceeds.sortUpProceeds(proceedsList);
    }

    @Override
    public void sortDownProceedsOf_day() {
        SortDownProceeds.sortDownProceeds(proceedsList);
    }
}
