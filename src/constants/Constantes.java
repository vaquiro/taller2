package constants;

public enum Constantes {

	ING_MENSUAL("Ingreso mensual"), 
	ING_FIJO("Ingrese sus gastos fijos"),
	ING_VARIABLE("Ingrese sus gastos variables"), 
	MENSAJE("Ingrese valor numérico o escriba Exit para salir"),
	RESULTADO("La capacidad de endeudamiento es: "),
	ERROR("El cálculo no puede ser realizado");
	private String lista;

	private Constantes(String lista) {
		this.lista = lista;
	}

	public String getLista() {
        return lista;
    }

}
