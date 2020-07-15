package storage;

import model.Food;
import model.Proceeds;
import model.Product;

import java.io.File;
import java.util.ArrayList;

public class ProductList extends Product {
    public ArrayList<Product> productsList = new ArrayList<>();
    public ArrayList<Food> orderList = new ArrayList<>();
    public ArrayList<Proceeds> proceedsList = new ArrayList<>();
    private ProductList() {
    }
    private static volatile ProductList instance;
    public synchronized static ProductList getInstance() {
        if (instance==null) {
            instance = new ProductList();
        }
        return instance;
    }
    public File getMenuFile() {
        return menuFile;
    }
    public File getProceedsDay() {
        return proceeds_Day;
    }
    private final File menuFile = new File("/Users/mac/CodeGym/Module2/baithithuchanh/src/Menu.csv");
    private final File proceeds_Day = new File("/Users/mac/CodeGym/Module2/baithithuchanh/src/Product");
}