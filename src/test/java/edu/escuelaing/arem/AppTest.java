package edu.escuelaing.arem;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void puedeCorrer10() {
        for (int i = 0; i <= 10; i++) {
            new Thread(new HttpConection()).start();
        }

    }
}