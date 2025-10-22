package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void ejecutar() {
        File archivo = new File("archivo.txt");

        try (Scanner scanner = new Scanner(archivo)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        }
    }
}
