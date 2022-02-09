package edu.escuelaing.arem;

public class Converter {

    private String name;
    private float ingresado;
    private float res;
    private float div = (float)(1.8);
    private float dic = (float)(0.555556);


    public Converter(String name , float ingresado) {
        this.name = name;
        this.ingresado = ingresado;
    }
    public void metodoConverter (){

        if (name.equals("Celsius")){
            fahrenheit();
        }
        else{
            celsius();

        }

    }

    public void fahrenheit(){
        System.out.println("Entro a fahrein");

        res = (ingresado * div) + 32;

    }
    public void celsius(){
        System.out.println("Entro a celius");
        res = (ingresado -32) * dic;
    }

    public float getRes(){
        return res;
    }
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
