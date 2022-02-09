package edu.escuelaing.arem;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * @author David Pérez Mejia
 */

public class AppTest {

    /**
     * Prueba concurrente con la creacion de 10 hilos haciendo una conexion a el servicio.
     */
    @Test
    public void puedeCorrer10() {
        for (int i = 0; i <= 10; i++) {
            HttpConection thread  =new HttpConection();
            thread.start();
            int a = thread.getCode();
            //Assertions.assertEquals(200,a);

        }

    }
}