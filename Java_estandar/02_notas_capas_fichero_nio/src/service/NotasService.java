package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class NotasService {
	String fichero = "notas.txt";

    public void borrarNotas() {
        try {
            Files.deleteIfExists(Paths.get(fichero));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void agregarNota(double nota) {
		try {
            Files.write(Paths.get(fichero,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public double media() {
		double media=0;
		int contador=0;
		String linea;
		//Se lee el fichero
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			//mientras haya una notas para leer
			while((linea=bf.readLine())!=null) {
				contador++;
				media+=Double.parseDouble(linea);
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return contador>0?media/contador:0;
	}
	public double max() {
		double max=Double.MIN_VALUE;
		String linea;
		//Se lee el fichero
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			//mientras haya una nota que leer
			while((linea=bf.readLine())!=null) {

				if(Double.parseDouble(linea)>max) {
					max=Double.parseDouble(linea);
				}
			}

		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return max;
	}
	public double min() {
		double min=Double.MAX_VALUE;
		String linea;
		//Se lee el fichero
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			//mientras haya una nota que leer
			while((linea=bf.readLine())!=null) {

				if(Double.parseDouble(linea)<min) {
					min=Double.parseDouble(linea);
				}
			}

		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return min;

	}
	public ArrayList<Double> obtenerNotas() {
		ArrayList<Double> aux=new ArrayList<Double>();
		String linea;
		//Se lee el fichero
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr);){
			//mientras haya una nota que leer
			while((linea=bf.readLine())!=null) {

				aux.add(Double.parseDouble(linea));
			}

		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return aux;
	}
}
