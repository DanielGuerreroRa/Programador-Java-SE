package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class CursoFichero {

	public static void main(String[] args) {
		String [] cursos= {
				"Java básico",
				"Python para principaiantes",
				"Java EE en Web",
				"JavaScript en Front",
				"POO con Java",
				"Python y Django",
				"Desarrollo Web con ASP.NET",
				"Aplicaciones Web con Python"
		}; 
		//Solicitamos por teclado la introducción de un nombre y guardaremos en un fichero todos los cursos que contengan ese nombre
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce el nombre de un curso:");
		String nombreCurso = teclado.nextLine();
		String ruta="cursos.txt";
		boolean cursoEncontrado = false;
		try (FileOutputStream fos = new FileOutputStream(ruta, true);
                PrintStream out = new PrintStream(fos);) {
            for (String curso: cursos) {
                if (curso.contains(nombreCurso)) {
                    out.println(curso);
                    cursoEncontrado = true;
                }
            }

            if (cursoEncontrado) {
                System.out.println("Curso registrado");
            } else {
                System.out.println("Este curso no se encuentra en el fichero");
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}