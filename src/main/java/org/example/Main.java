package org.example;

import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        JsonObject json = new JsonObject();
        json.addProperty("name", "YourName");
        json.addProperty("lastName", "YourLastName");
        System.out.println(json.toString());
    }
}
