package principal;

public class ComprobarDireccionesCompleto {

	public static void main(String[] args) {
		String emails = "andregp@gmail.com,alfonso_garcia@hotmail.es,btorija@gmail.com,leticia-perez98@yahoo.es,leopoldoJimenez@hotmail.com,cominidad-madrid@cm.org,vodagone_informacion@vodafone.net";
		//Mostrar cuantas direcciones de cada dominio hay
		String[] direcciones = emails.split(",");
		//Obtener un array con los dominios que hay y llamamos al metodo obtenerDominios
		String[] dominios = obtenerDominios(direcciones);
        //Recorro los dominios y con cada uno llamo al segundo método contarDominio
        for(String doms:dominios) {
        	System.out.println("El dominio '"+doms+"' aparece en: "+contarDominio(doms,direcciones)+" correos");
        }

	}


	static String[] obtenerDominios(String[] direcciones) {
		//Recibe una array con direcciones y devuelve array de dominios
		String cadenaDominios="";
		for(String dir:direcciones){
			//Obtenemos el dominio de la dirección que estamos recorriendo
			String dominio = dir.substring(dir.indexOf(".")+1,dir.length());
			if(cadenaDominios.indexOf(dominio)==-1) { //La cadena de dominios no contiene ese dominio ==-1 significa que no esta (no existe)
				//Añadimos el dominio a la cadena de dominios
				cadenaDominios=cadenaDominios+dominio+",";
			}

		}
		cadenaDominios=cadenaDominios.substring(0,cadenaDominios.length()-1);
		return cadenaDominios.split(",");
	}
	static int contarDominio(String dominio,String[] dirs) {
		int contador=0;
		for(String dir:dirs) {
			//si la diracción termina en el dominio recibido, incrementamos contador
			if(dir.endsWith(dominio)) {
				contador++;
			}
		}
		return contador;
	}
}

