package cn.xly.automobile.test;

import cn.xly.automobile.pojo.*;
import cn.xly.automobile.service.AutoMobileService;

import java.util.Scanner;

public class AutoTest {

    public static void main(String[] args) {

        int type = 0;
        String Type = null;
        String Model = null;
        int seatingCapacity = 0;
        int dayNumber = 0;

        AutoMobileService service = new AutoMobileService();

        System.out.println("--------Welcome to the Car Rental Corporation!--------");

        while (true) {
            System.out.println("Please input the type you want（1，sedan  2，coach）,type 3 to end inputting，8 inputs max");
            Scanner input = new Scanner(System.in);
            type = input.nextInt();
            if (type == 1) {
                System.out.println("please input the brand you'd like（1，BMW  2，BUICK）");
                int brand = input.nextInt();
                if (brand == 1) {
                    Type = "BMW";
                    System.out.println("please input the model you'd like（1，X6  2, 550i）");
                    int models = input.nextInt();
                    if (models == 1) {
                        Model = "X6";
                    } else if (models == 2) {
                        Model = "550i";
                    } else {
                        System.out.println("Sorry, we do not offer the model you'd like for now");
                        return;
                    }
                } else if (brand == 2) {
                    Type = "BUICK";
                    System.out.println("please input the model you'd like（1，Encore  2,Enclave）");
                    int models = input.nextInt();
                    if (models == 1) {
                        Model = "Encore";
                    } else if (models == 2) {
                        Model = "Enclave";
                    } else {
                        System.out.println("Sorry, we do not offer the model you'd like for now");
                        return;
                    }
                } else {
                    System.out.println("Sorry, we do not offer the brand you'd like for now");
                    return;
                }
                System.out.print("How many days would you like for your rent?: ");
                dayNumber = input.nextInt();

            } else if (type == 2) {
                System.out.println("please input the brand you'd like（1, JINBEI，  2，JINLONG）");
                int brand = input.nextInt();
                if (brand == 1) {
                    Type = "JINBEI";
                    System.out.println("please type the number of seats you'd like（1，16 seats  2, 34 seats）");
                    int seatNumber = input.nextInt();
                    if (seatNumber == 1) {
                        seatingCapacity = 16;
                    } else if (seatNumber == 2) {
                        seatingCapacity = 34;
                    } else {
                        System.out.println("Sorry, we do not offer this seat number of coach for now.");
                        return;
                    }
                } else if (brand == 2) {
                    Type = "JINLONG";
                    System.out.println("please type the number of seats you'd like（1，16 seats  2, 34 seats）");
                    int seatNumber = input.nextInt();
                    if (seatNumber == 1) {
                        seatingCapacity = 16;
                    } else if (seatNumber == 2) {
                        seatingCapacity = 34;
                    } else {
                        System.out.println("Sorry, we do not offer this seat number of coach for now.");
                        return;
                    }
                } else {
                    System.out.println("Sorry, we do not offer the brand you'd like for now");
                    return;
                }
                System.out.print("How many days would you like for your rent?: ");
                dayNumber = input.nextInt();
            }else if(type == 3){
                break;
            }
            Auto car = service.init(Type, Model, seatingCapacity);
            car.discount(dayNumber);
            service.addToTotal(car);
            car.showInfo();
        }
        service.showTotal();
    }
}
