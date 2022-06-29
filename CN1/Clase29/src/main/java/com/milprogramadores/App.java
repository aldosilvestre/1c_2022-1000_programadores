package com.milprogramadores;

import static spark.Spark.*;

import org.eclipse.jetty.websocket.common.AcceptHash;

import com.google.gson.Gson;

import spark.ModelAndView;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Cine cine = new Cine();

    public static void main( String[] args )
    {
        
        Gson gsonMapper = new Gson();


        port(8080);

        get("/index", (req, res) -> {
            res.type("text/html");
            return new ModelAndView("", "/");
            //return "<h1>Hola mundo</h1><input type='text' placeholder='decir algo'>";
        });

        get("/saludar", (request, response) -> {
            response.type("application/json");
            return gsonMapper.toJson(new Persona("Daniela", "Gomez"));
        });

        post("/guardar", "application/json" ,(request, response) -> {
            
            Persona persona = gsonMapper.fromJson(request.body(), Persona.class);
            response.status(200);
            return persona.getNombre();
        });

        put("/actualizar", "application/json", (req, res) -> {
            Persona persona = gsonMapper.fromJson(req.body(), Persona.class);
            cine.actualizarPerfil(persona);
            res.type("application/json");
            res.status(200);
            return "";
        });

    }
}
