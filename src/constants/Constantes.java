package constants;

public enum Constantes {

	ING_MENSUAL("Ingreso mensual"), 
	ING_FIJO("Ingrese sus gastos fijos"),
	ING_VARIABLE("Ingrese sus gastos variables"), 
	MENSAJE("Ingrese valor num�rico o escriba Exit para salir"),
	RESULTADO("La capacidad de endeudamiento es: "),
	ERROR("El c�lculo no puede ser realizado");
	private String lista;

	private Constantes(String lista) {
		this.lista = lista;
	}

	public String getLista() {
        return lista;
    }

}
