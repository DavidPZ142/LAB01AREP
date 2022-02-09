package edu.escuelaing.arem;

import junit.framework.TestCase;

import edu.escuelaing.arem.Converter;
import junit.framework.TestResult;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;

public class ConvertTest  {
    private Converter converterToFahrenheit = new Converter("Celsius",45);



    @Test

    public void convierteBienaFahrenheit(){
        converterToFahrenheit.metodoConverter();
        float a= converterToFahrenheit.getRes();
        assertTrue(a ==113);
    }




}

