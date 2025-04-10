package com.bridgelabz.practiceproblems;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
public class JsonFilter {
    public static void main(String[] args) {
        try {
            File jsonFile = new File("/Users/prakulagarwal/Desktop/bridgelabz-workspace/java-JSON/src/main/java/com/bridgelabz/practiceproblems/data2.json");
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonFile);
            Iterator<JsonNode> elements = rootNode.elements();
            while (elements.hasNext()) {
                JsonNode record = elements.next();
                // Check if age is greater than 25
                if (record.has("age") && record.get("age").asInt() > 25) {
                    System.out.println(record.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

