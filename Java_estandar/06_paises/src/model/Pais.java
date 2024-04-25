package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

//Implementar lógica de negocio de una aplicación que proporcione información
//sobre paises. Cada pais se caracteriza por: nombre,continente,capital,habitantes


public class Pais {
	private String pais;
	private String continente;
	private String capital;
	private long habitantes;

}
