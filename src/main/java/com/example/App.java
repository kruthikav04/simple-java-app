package com.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // Bind to all interfaces so remote machines can connect (0.0.0.0)
        ipAddress("0.0.0.0");
        // Use port 4567
        port(4567);

        // Simple route that returns the message
        get("/", (req, res) -> "Hello from Simple Java Maven Application!");
    }
}

