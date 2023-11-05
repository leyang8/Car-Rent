package cn.xly.automobile.pojo;

public class Coach extends Auto{

    private int seatNum;

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public Coach(String brand, int seat, String plate, int rent) {
        setBrand(brand);
        setSeatNum(seat);
        setPlateNumber(plate);
        setDailyRent(rent);
    }

    //计算价格方法
    public void discount(int days) {
        setRentDay(days);

        if (days<3){
             setSumPrice(days * this.getDailyRent());
        }else if (days<7){
            setSumPrice(days * this.getDailyRent() * 0.9);
        }else if (days<30){
            setSumPrice(days * this.getDailyRent() * 0.8);
        }else if (days<150){
           setSumPrice(days * this.getDailyRent() * 0.7);
        }else {
            setSumPrice(days * this.getDailyRent() * 0.6);
        }
    }

    public void showInfo(){
        System.out.println("The vehicle brand you're renting is: " + super.getBrand()+
                           ", total seat number："+this.seatNum+
                           ", the plate number is："+super.getPlateNumber()+
                           ", total being: "+super.getRentDay()+" days"+
                           ", total cost is: "+getSumPrice());
    }
}
