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

        Tienda m52 = new Tienda();



        port(8080);

        get("/getRopa", (request, response) -> {
            response.type("application/json");
            return m52.getPrendas();
        }, mapper::toJson);

        post("/crearRopa", "application/json", (request, response) -> {

            if(m52.isAdmin( mapper.fromJson(request.headers("Authorization"), Usuario.class) )){
                // es admin
                try{
                    Ropa nuevaRopa = mapper.fromJson(request.body(), Ropa.class);
                    m52.guardarNuevaPrenda(nuevaRopa);
                    return "OK";
                }catch(SQLException e){
                    response.status(400);
                    return e.getLocalizedMessage();
                }
            }else{
                // no es admin
                response.status(401);
                return "FAIL";
            }
        });

    }
}
