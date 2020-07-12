package model;

import model.Product;

public class Food extends Product {
    private String table;
    private int amount = 0;
    private String note = null;
    private String cooked = "Đang chờ";
    private String paid = "Chưa thanh toán";
    public Food() {
    }
    public Food(String table,String id,String name,int price,int amount,String description,String note,String cooked,String paid) {
        super(id, name, price, description);
        this.table = table;
        this.amount = amount;
        this.note = note;
        this.cooked = cooked;
        this.paid = paid;
    }
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public String getCooked() {
        return cooked;
    }

    public void setCooked(String cooked) {
        this.cooked = cooked;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return getTable()+","+getId()+","+getName()+","+getPrice()+","+getAmount()+","+getDescription()+","+getNote()+","+getCooked()+","+getPaid();
    }
}
