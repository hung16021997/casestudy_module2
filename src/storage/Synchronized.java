package storage;


import model.Proceeds;
import model.Product;

import java.io.*;
import java.util.ArrayList;

public class Synchronized {
    ProductList listManager = ProductList.getInstance();
    FileReader fileReader = null;
    BufferedReader br = null;
    String line = null;
    String[] food;
    ArrayList<Product> productsList = listManager.productsList;
    ArrayList<Proceeds> proceedsList = listManager.proceedsList;
    public void readToFileMenu(File inFile) {
        try {
            fileReader = new FileReader(inFile);
            br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                food = line.split(",");
                Product addProduct = new Product(food[0],food[1],Integer.parseInt(food[2]),food[3]){};
                productsList.add(addProduct);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Kho lưu trữ không tồn tại, bạn cần sửa lại link lưu trữ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeToFileMenu(File outFile) {
        try {
            FileWriter fileWriter = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String content = null;
            for (Product newFood : productsList) {
                String id = newFood.getId();
                String name = newFood.getName();
                int price = newFood.getPrice();
                String description = newFood.getDescription();
                content = id + "," + name + "," + price + "," + description;
                bw.write(content);
                bw.newLine();//xuống dòng
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readToFileProceeds(File inFile) {
        try {
            fileReader = new FileReader(inFile);
            br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                food = line.split(",");
                Proceeds addProceeds = new Proceeds(food[0],Integer.parseInt(food[1])){};
                proceedsList.add(addProceeds);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Kho lưu trữ không tồn tại, bạn cần sửa lại link lưu trữ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeToFileProceeds(File outFile) {
        try {
            FileWriter fileWriter = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String content = null;
            for (Proceeds newProceeds : proceedsList) {
                String day = newProceeds.getDay();
                int money = newProceeds.getMoney();
                content = day + "," + money;
                bw.write(content);
                bw.newLine();//xuống dòng
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
