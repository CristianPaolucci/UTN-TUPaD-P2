
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaConBufferedReader {
    public static void ejecutar() {
        String ruta = "archivo.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))){
            String linea;
            while ((linea = reader.readLine()) != null){
                System.out.println(linea);
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
}
