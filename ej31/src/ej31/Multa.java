package ej31;

import java.time.LocalDate;
import java.util.Date;
import java.time.temporal.ChronoUnit;

public class Multa {
	private Integer diasMultado;
	private LocalDate fechaMulta;
	
	public Integer getDiasMultado() {
		return diasMultado;
	}
	public void setDiasMultado(Integer diasMultado) {
		this.diasMultado = diasMultado;
	}
	public LocalDate getFechaMulta() {
		return fechaMulta;
	}
	public void setFechaMulta(LocalDate fechaMulta) {
		this.fechaMulta = fechaMulta;
	}
	
	public int ConsultarDiasRestantes(){
		LocalDate fechaFinalMulta = fechaMulta.plusDays(diasMultado);
		LocalDate fechaActual = LocalDate.now();
    	long diasRestantes = ChronoUnit.DAYS.between(fechaActual, fechaFinalMulta); //Calcula la diferencia en dias entre dos fechas
	    return (int) diasRestantes;}
}
