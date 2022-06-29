package com.milprogramadores;

import static spark.Spark.*;

import com.Persona;
import com.google.gson.Gson;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Gson gson = new Gson();

        //http => 80
        //https => 443
        // 0 - 65535 
        port(8080);

        get("/saludo", (request, response) -> {
            response.type("application/json");
            return gson.toJson(new Persona("Maria", "Velez"));
        });

    }
}
