package service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import model.Pais; 

public class PaisesService {
    String ruta="empleados.json";
    
    private Stream<Pais> getPaises(){
        try {
            Gson gson=new Gson();
            return Arrays.stream(gson.fromJson(new FileReader(ruta), Pais[].class));
        }
        catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return Stream.empty(); 
    }
    
    //Lista de países a partir del continente
    public List<Pais> listaPaisesPorContinente(String continente) {
        return getPaises()
                .filter(p->p.getContinente().equalsIgnoreCase(continente))
                .collect(Collectors.toList());
    }
    
    //País más poblado
    public Pais paisMasPoblado() {
        return getPaises()
                .max(Comparator.comparingLong(p->p.getHabitantes()))
                .orElse(null);
    }
    
    //Tabla con países agrupados por continente
    public Map<String, List<Pais>> tablaPaisesPorContinente() {
        return getPaises()
                .collect(Collectors.groupingBy(p->p.getContinente()));
    }
    
    //País a partir de su capital
    public Pais paisPorCapital(String capital) {
        return getPaises()
                .filter(p->p.getCapital().equalsIgnoreCase(capital))
                .findFirst()
                .orElse(null);
    }
}