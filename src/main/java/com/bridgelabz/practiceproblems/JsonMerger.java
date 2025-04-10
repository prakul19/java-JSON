package com.bridgelabz.practiceproblems;
import org.json.JSONObject;
public class JsonMerger {
    public static void main(String[] args) {
        try {
            JSONObject jsonObject1 = new JSONObject();
            jsonObject1.put("name", "Prakul Agarwal");
            jsonObject1.put("email", "prakul@gmail.com");
            JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("age", 21);
            jsonObject2.put("address", "Lucknow, India");
            // Merge two JSON objects
            for (String key : jsonObject2.keySet()) {
                jsonObject1.put(key, jsonObject2.get(key));
            }
            System.out.println("Merged JSON Object: " + jsonObject1.toString(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

