package com.bridgelabz.practiceproblems;
import org.json.JSONObject;
public class CarToJson {
    public static void main(String[] args) {
        // Car class
        class Car {
            private String make;
            private String model;
            private int year;
            // Constructor
            public Car(String make, String model, int year) {
                this.make = make;
                this.model = model;
                this.year = year;
            }
            // Getters
            public String getMake() {
                return make;
            }
            public String getModel() {
                return model;
            }
            public int getYear() {
                return year;
            }
        }
        // Car object
        Car car = new Car("Toyota", "Camry", 2020);
        // Convert Car object to JSON
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("make", car.getMake());
        jsonObject.put("model", car.getModel());
        jsonObject.put("year", car.getYear());
        System.out.println(jsonObject.toString(1));
    }
}

