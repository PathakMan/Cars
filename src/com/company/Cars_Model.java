package com.company;

class Car
{
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public  Car(String model, String brand, int year, int price, String color, int quantity)
    {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;

    }

    //***********//

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //***********//

    void sell(int sold)
    {
        quantity -= sold;
    }

    void delivery(int delivery)
    {
        quantity += delivery;
    }

    //***********//

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

public class Cars_Model {

    public static void main(String[] args) {

        Car car_1 = new Car("Urus","Lamborghini",2019,200000,"White",4);

        System.out.println(car_1.toString());

        car_1.sell(2);

        car_1.delivery(3);

        //***********//

        Car car_2 = new Car("Aventador","Lamborghini",2020,150000,"Blue",7);

        System.out.println(car_2.toString());

        car_2.sell(4);

        car_2.delivery(3);

        //***********//

        Car car_3 = new Car("Huracan","Lamborghini",2018,100000,"Yellow",10);

        System.out.println(car_3.toString());

        car_3.sell(5);

        car_3.delivery(5);
    }
}
