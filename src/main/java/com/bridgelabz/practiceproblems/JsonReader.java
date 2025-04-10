package com.bridgelabz.practiceproblems;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
public class JsonReader {
    public static void main(String[] args) {
        try {
            // Read contents
            String content = new String(Files.readAllBytes(Paths.get("/Users/prakulagarwal/Desktop/bridgelabz-workspace/java-JSON/src/main/java/com/bridgelabz/practiceproblems/data.json")));
            // Convert string to a JSONObject
            JSONObject jsonObject = new JSONObject(content);
            // Extract fields
            String name = jsonObject.getString("name");
            String email = jsonObject.getString("email");
            // Print the extracted fields
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

