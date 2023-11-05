package cn.xly.automobile.pojo;

public abstract class Auto {

    private String brand;
    private String plateNumber;
    private int dailyRent;
    private int rentDay;
    private double sumPrice = 0;

    public abstract void discount(int days);

    public abstract void showInfo();

    public double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public int getRentDay() {
        return rentDay;
    }

    public void setRentDay(int rentDay) {
        this.rentDay = rentDay;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(int dailyRent) {
        this.dailyRent = dailyRent;
    }
}
