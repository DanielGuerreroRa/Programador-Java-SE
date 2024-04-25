package service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import model.Empleado;

public class EmpleadosService {
	String ruta="empleados.json";
	private Stream<Empleado> getEmpleados(){
		try {
			Gson gson=new Gson();
			return Arrays.stream(gson.fromJson(new FileReader(ruta), Empleado[].class));
		}
		catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return Stream.empty();
	}
	
	public List<Empleado> empleadosDepartamento(String departamento) {
        return getEmpleados()
                .filter(e->e.getDepartamento().equalsIgnoreCase(departamento))
                .toList();
    }

    public Empleado empleadoMayorSalario() {
    	return getEmpleados()
    			.max(Comparator.comparingDouble(e->e.getSalario()))
    			.orElse(null); 
    }

    public List<String> departamentos() {
        return getEmpleados()
                .map(e->e.getDepartamento())//Transpormar Empleado en Stram<String>
                .distinct()
                .toList(); 
    }
}