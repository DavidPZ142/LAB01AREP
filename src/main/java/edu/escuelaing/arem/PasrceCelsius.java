package edu.escuelaing.arem;

public class PasrceCelsius {

    private String name;
    private int xd;


    public PasrceCelsius(String xd) {
        this.xd = Integer.parseInt(xd);
    }



    public void setName(String name) {
        this.name = name;
    }
    public int suma(){
        return xd + 1;
    }
}
