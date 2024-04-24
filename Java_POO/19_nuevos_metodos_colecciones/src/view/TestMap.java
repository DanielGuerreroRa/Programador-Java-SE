package view;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, Integer> ciudades=new HashMap<String, Integer>();
		ciudades.put("Madrid", 3200000);
		ciudades.put("Zaragoza", 300000);
		ciudades.put("Caceres", 100000);
		ciudades.put("Caceres", 120000);
		//System.out.println(ciudades.get("Caceres"));
		//recorrido de un HashMap con forEach
		ciudades.forEach((k,v)->System.out.println(k+"|"+v));

	}

}
