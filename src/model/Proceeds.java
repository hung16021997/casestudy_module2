package model;

public class Proceeds {
    private String day = null;
    private int money = 0;
    public Proceeds() {
    }
    public Proceeds(String day,int money) {
        this.day = day;
        this.money = money;
    }
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public String toString() {
        return getDay()+","+getMoney();
    }
}
