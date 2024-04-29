package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Contacto {
	private int idContacto;
	private String nombre;
	private String email;
	private int edad;
}
