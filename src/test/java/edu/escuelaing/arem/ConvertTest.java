package edu.escuelaing.arem;

import junit.framework.TestCase;

import edu.escuelaing.arem.Converter;
import junit.framework.TestResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;
/**
 * @author David Pérez Mejia
 */

public class ConvertTest  {


    /**
     * Prueba unitaria prueba si el metodo Converter es correcto
     */
    @Test
    public void convierteBienaFahrenheit(){
        Converter converter = new Converter("Celsius",45);
        converter.metodoConverter();
        float a= converter.getRes();
        Assertions.assertTrue(a ==113);
    }

    /**
     * Prueba unitaria prueba si los metodos varios son correctos , el setName y converter
     */
    @Test
    public void CambiaYFunciona(){
        Converter converter = new Converter("Celsius",32);
        converter.setName("Fahrenheit");
        converter.metodoConverter();
        float b = converter.getRes();
        Assertions.assertTrue(b == 0);
    }




}

