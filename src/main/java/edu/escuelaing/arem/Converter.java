package edu.escuelaing.arem;

public class Converter {

    private String name;
    private float ingresado;
    private float res;
    private float div = (float)(1.8);


    public Converter(String name , float ingresado) {
        this.name = name;
        this.ingresado = ingresado;
    }
    public void metodo (){
        System.out.println("Pene ");
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
        res = (ingresado -32) * div;
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




}
