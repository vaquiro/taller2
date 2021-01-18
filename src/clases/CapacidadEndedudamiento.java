package clases;

import constants.Constantes;

public class CapacidadEndedudamiento {
	Integer ingresosTotales;
	Integer gastosFijos;
	Integer gastoVariables;
	final double POR_FIJO = 0.35;

	public Integer getIngresosTotales() {
		return ingresosTotales;
	}

	public void setIngresosTotales(Integer ingresosTotales) {
		this.ingresosTotales = ingresosTotales;
	}

	public Integer getGastosFijos() {
		return gastosFijos;
	}

	public void setGastosFijos(Integer gastosFijos) {
		this.gastosFijos = gastosFijos;
	}

	public Integer getGastoVaribales() {
		return gastoVariables;
	}

	public void setGastoVaribales(Integer gastoVaribales) {
		this.gastoVariables = gastoVaribales;
	}

	// Se realiza método para retornar las propiedades en un string
	public String getPropiedades() {
		return getIngresosTotales().toString() + " " + getGastosFijos().toString() + " "
				+ getGastoVaribales().toString();
	}

	// Se calcula la capacidad de endeudamiento del usuario acorde a los valores
	// ingresados
	public String Calcular() {
		if (getIngresosTotales() > 0 && getGastosFijos() > 0 && getGastoVaribales() > 0) {
			double capacidadEndeudamiento = getIngresosTotales() - (getGastosFijos() + getGastoVaribales()) * POR_FIJO;
			return Constantes.RESULTADO.getLista() + capacidadEndeudamiento;
		} else {
			return Constantes.ERROR.getLista();
		}

	}

}
