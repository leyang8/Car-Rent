package cn.xly.automobile.pojo;

public class Car extends Auto{

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String brand, String model, String plate, int rent) {
        setBrand(brand);
        setModel(model);
        setPlateNumber(plate);
        setDailyRent(rent);
    }

    //计算价格方法
    public void discount(int days) {

        setRentDay(days);
        if (days<=7){
             super.setSumPrice(days * this.getDailyRent());
        }else if (days<=30){
             super.setSumPrice(days * this.getDailyRent() * 0.9);
        }else if (days<=150){
             super.setSumPrice(days * this.getDailyRent() * 0.8);
        }else {
             super.setSumPrice(days * this.getDailyRent() * 0.7);
        }
    }

    public void showInfo(){
        System.out.println("The vehicle brand you're renting is: "+super.getBrand()+
                           ", the model is："+this.getModel()+
                           ", the plate number is："+super.getPlateNumber()+
                           ", total being: "+getRentDay()+" days"+
                           ", total cost is: "+getSumPrice());
    }

}

