package edu.escuelaing.arem;



import static spark.Spark.*;
import org.json.JSONObject;

/**
 * @author David Pérez Mejia
 */

public class App {

    public static void main(String[] args) {
        port(getPort());
        staticFileLocation("/public");
        get("/Converter/:name/:ingresado", (req,res) -> newConverter(req.params(":name"), req.params(":ingresado")));

    }

    /**
     * Metodo de spark que genera el puerto para una conexión local
     * @return puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set

    }

    /**
     * Metodo para crear un objeto JSON que nos permita lanzarlo
     * @param name : Nombre del cambio temperatura ( Celsius o Fahrenheit)
     * @param ingresado Valor ingresado para el cambio
     * @return retorna nuestro JSONObject
     */
    public static JSONObject newConverter(String name, String ingresado){
        Converter converter = new Converter(name, Float.parseFloat(ingresado));
        converter.metodoConverter();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",converter.getName());
        jsonObject.put("ingresado",converter.getIngresado());
        jsonObject.put("res",converter.getRes());


        return jsonObject ;
    }
}