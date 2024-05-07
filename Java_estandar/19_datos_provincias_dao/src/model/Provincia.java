package model;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Provincia {
	@SerializedName("CODPROV")
	private String codigo;
	@SerializedName("NOMBRE_PROVINCIA")
	private String nombre;
	@SerializedName("COMUNIDAD_CIUDAD_AUTONOMA")
	private String comunidad;
	@SerializedName("CODAUTON")
	private String codComunidad;
}
