package model;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pais {
	@SerializedName("name")
	private String nombre;
	@SerializedName("region")
	private String continente;
	private String capital;
	@SerializedName("population")
	private long poblacion;
}
