package model;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Municipio {
	@SerializedName("CODIGOINE")
	private String codigo;
	@SerializedName("NOMBRE")
	private String nombre;
	@SerializedName("CODPROV")
	private String codProvincia;
	@SerializedName("POBLACION_MUNI")
	private int poblacion;
	@SerializedName("ALTITUD")
	private int altitud;
	@SerializedName("SUPERFICIE")
	private double superficie;
}
