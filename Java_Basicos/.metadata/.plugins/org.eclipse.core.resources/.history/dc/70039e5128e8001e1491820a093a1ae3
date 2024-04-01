package principal;

public class ComprobarDirecciones {

	public static void main(String[] args) {
		String emails="aaa@gmail.com,bbb@tel.es,ccc@gmail.es,ddd@gmail.com,abc@hotmail.com";
		//indicar cuantas direcciones hay de cada dominio
		int contEs=0,contCom=0;
		String[] direcciones=emails.split(",");
		for(String dir:direcciones) {
			switch(dir.substring(dir.indexOf(".")+1,dir.length())) {
				case "es":
					contEs++;
					break;
				case "com":
					contCom++;
			}
		}
		System.out.println("Direcciones '.es' "+contEs);
		System.out.println("Direcciones '.com' "+contCom);
	}

}
