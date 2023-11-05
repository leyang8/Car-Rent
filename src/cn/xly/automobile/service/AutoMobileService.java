package cn.xly.automobile.service;

import cn.xly.automobile.pojo.*;

public class AutoMobileService {

    Auto[] vehicles = new Auto[8];
    Auto[] Cars = new Auto[8];
    double sumPrice = 0;

    public Auto init(String brands, String model, int seat) {

        vehicles[0] = new Car("BMW", "X6", "CMLS123", 800);
        vehicles[1] = new Car("BMW", "550i", "AWSD345", 600);
        vehicles[2] = new Car("BUICK", "Encore", "JSNM123", 300);
        vehicles[3] = new Car("BUICK", "Enclave", "NSWD456", 600);
        vehicles[4] = new Coach("JINBEI", 16, "SDJN789", 800);
        vehicles[5] = new Coach("JINBEI", 34, "CXSA123", 1500);
        vehicles[6] = new Coach("JINLONG", 16, "BSJH123", 800);
        vehicles[7] = new Coach("JINLONG", 34, "JKSM123", 1500);

        for (Auto vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                if (car.getBrand().equals(brands) && model.equals(car.getModel())) {

                    return vehicle;
                }

            } else if (vehicle instanceof Coach) {
                Coach coach = (Coach) vehicle;
                if (brands.equals(coach.getBrand())) {
                    if (seat == (coach.getSeatNum())) {

                        return vehicle;
                    }
                }
            }
        }
        return null;
    }

    public void addToTotal(Auto car) {
        for (int i = 0; i<8; i++) {
            if (Cars[i]==null){
                Cars[i] = car;
                sumPrice+=car.getSumPrice();
                break;
            }
        }
    }

    public void showTotal() {
        for (Auto cars : Cars) {
            if (cars instanceof Car) {
                Car car = (Car) cars;
                System.out.println("The vehicle brand you're renting is: " + car.getBrand() +
                        ", the model is：" + car.getModel() +
                        ", the plate number is：" + car.getPlateNumber() +
                        ", total being: " + car.getRentDay() + " days" +
                        ", total cost is: " + car.getSumPrice());
            } else if (cars instanceof Coach) {
                Coach coach = (Coach) cars;
                System.out.println("The vehicle brand you're renting is: " + coach.getBrand() +
                        ", total seat number：" + coach.getSeatNum() +
                        ", the plate number is：" + coach.getPlateNumber() +
                        ", total being: " + coach.getRentDay() + " days" +
                        ", total cost is: " + coach.getSumPrice());
            }
        }
        System.out.println("Total price is:"+sumPrice);
    }
}

