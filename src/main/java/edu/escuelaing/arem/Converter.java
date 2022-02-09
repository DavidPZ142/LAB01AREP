package edu.escuelaing.arem;
/**
 * @author David Pérez Mejia
 */

public class Converter {

    private String name;
    private float ingresado;
    private float res;
    private float div = (float)(1.8);
    private float dic = (float)(0.555556);

    /**
     * Metodo constructor
     * @param name (Celsius o Fahrenheit)
     * @param ingresado Valor ingresado a convertir
     */
    public Converter(String name , float ingresado) {
        this.name = name;
        this.ingresado = ingresado;
    }

    /**
     * Metodo que define que accion tomar dependiendo del nombre recibido en el constructor
     */
    public void metodoConverter (){

        if (name.equals("Celsius")){
            fahrenheit();
        }
        else{
            celsius();

        }

    }

    /**
     * Metodo que convierte de celsius a fahrenheit
     */
    public void fahrenheit(){
        System.out.println("Entro a fahrein");

        res = (ingresado * div) + 32;

    }

    /**
     * Metodo que convierte de fahrenheit a celsius
     */
    public void celsius(){
        System.out.println("Entro a celius");
        res = (ingresado -32) * dic;
    }
    /**
     * Metodo que retorna la respuesta
     * @return la respuesta despues que paso por la formula
     */
    public float getRes(){
        return res;
    }

    /**
     * Metodo que retorna el nombre
     * @return el nombre que ingreso
     */
    public String getName(){
        return name;
    }

    public float getIngresado(){
        return ingresado;
    }

    public void setIngresado(int ingresado){
        this.ingresado = ingresado;
    }
    public void setName(String name){
        this.name = name;
    }




}
