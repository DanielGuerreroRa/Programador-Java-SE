package exceptions;

public class ErrorFuenteDatosException extends RuntimeException {

	@Override
	public String getMessage() {
		return "No se ha podido acceder al fichero donde están las notas";
	}

}
