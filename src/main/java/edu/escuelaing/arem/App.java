package edu.escuelaing.arem;

import netscape.javascript.JSObject;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        port(getPort());
        //PasrceCelsius pasrceCelsius = new PasrceCelsius(1);
        //JSONObjec jsonObjec =
        get("/hello/:numero", (req,res) ->  new PasrceCelsius(req.params(":numero")).suma());
        get("/Arep", (req,res)-> "Arep XD");
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set

    }
}