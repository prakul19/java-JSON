package com.bridgelabz.practiceproblems;
import org.json.JSONArray;
import org.json.JSONObject;
public class StudentJSON {
    public static void main(String[] args) {
        // Create JSON Object
        JSONObject student = new JSONObject();
        // Add fields
        student.put("name", "Prakul Agarwal");
        student.put("age", 21);
        // Add array of subjects
        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("Science");
        subjects.put("Computer Science");
        student.put("subjects", subjects);
        // Printing JSON object
        System.out.println(student.toString(4));
    }
}

