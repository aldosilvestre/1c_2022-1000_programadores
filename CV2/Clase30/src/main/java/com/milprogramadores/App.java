package com.milprogramadores;

import static spark.Spark.*;

import java.sql.SQLException;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Gson mapper = new Gson();

        Heladeria gredo = new Heladeria();

        port(8080);

        get("/getSabores", (request, response) -> {
            response.type("application/json");
            return gredo.obtenerSabores();
        }, mapper::toJson);


        post("/guardarSabor", "application/json", (request, response) -> {

            String json = request.headers("Authorization");

            if(gredo.isAdmin(mapper.fromJson(json, Usuario.class))){

                try{
                    Sabor nuevoSabor = mapper.fromJson(request.body(), Sabor.class);
                    gredo.guardarNuevoSabor(nuevoSabor);
                    response.status(201);
                }catch(SQLException e){
                    response.status(400);
                    return "Hubo un error";
                }
            }else{
                response.status(401);
                response.body("No tienes permisos");
            }
            return "";
        });

    }
}
