package principal;

import java.util.Arrays;

public class Dominio1 {
	public static void main(String[] args) {
		String emails="""
				aaa@gmail.com,\
				bbb@tel.es,\
				ccc@gmail.es,\
				ddd@gmail.com,\
				abc@hotmail.com,
				""";
		//indicar cuantas direcciones hay de cada dominio
		
		String[] direcciones=emails.split(",");
		
		System.out.println("Direcciones '.es' "+contarDominio("es",direcciones));
		System.out.println("Direcciones '.com' "+contarDominio("com",direcciones));

	}
	static int contarDominio(String dominio,String[] dirs) {
		return (int)Arrays.stream(dirs)//Stream<String>
				.filter(d->d.endsWith(dominio))//Stream<String>
				.count();
	}

}

