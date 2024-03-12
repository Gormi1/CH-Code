/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java_cup.internal_error;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class Principal {

    public static void main(String[] args) throws internal_error, IOException, Exception {
        // TODO Auto-generated method stub
        String ruta1 = "..\\Analizador_CH-Code\\src\\Codigo\\Lexer.flex";
        String ruta2 = "..\\Analizador_CH-Code\\src\\Codigo\\LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "..\\Analizador_CH-Code\\src\\Codigo\\Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }

    public static void generar(String ruta1, String ruta2, String[] rutaS) throws internal_error, IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);

        /* Ruta a la tabla de simbolos generada por CUP */
        Path rutaSym = Paths.get("..\\Analizador_CH-Code\\src\\Codigo\\sym.java");
        /* Borra el archivo si ya existe en el proyecto */
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        /* Mueve el archivo de simbolos generado por CUP al directorio del proyecto */
        Files.move(
            Paths.get("..\\Analizador_CH-Code\\sym.java"),
            rutaSym
        );

        /* Ruta al archivo de sintactica generada por CUP */
        Path rutaSintax = Paths.get("..\\Analizador_CH-Code\\src\\Codigo\\Sintax.java");
        /* Borra el archivo si ya existe en el proyecto */
        if (Files.exists(rutaSintax)) {
            Files.delete(rutaSintax);
        }
        /* Mueve el archivo de sintactica generado por CUP al directorio del proyecto */
        Files.move(
            Paths.get("..\\Analizador_CH-Code\\Sintax.java"),
            rutaSintax
        );
    }
}
