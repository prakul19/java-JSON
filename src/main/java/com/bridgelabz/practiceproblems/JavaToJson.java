package com.bridgelabz.practiceproblems;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
public class JavaToJson {
    public static void main(String[] args) {
        try {
            // Create a list of objects
            List<MyObject> objectList = new ArrayList<>();
            objectList.add(new MyObject("prakul", 21));
            objectList.add(new MyObject("parth", 22));
            ObjectMapper objectMapper = new ObjectMapper();
            // Convert list of objects to JSON array
            String json = objectMapper.writeValueAsString(objectList);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class MyObject {
    private String name;
    private int age;
    // Constructor
    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
