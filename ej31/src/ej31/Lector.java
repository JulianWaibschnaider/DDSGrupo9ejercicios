package ej31;

import java.util.ArrayList;
import java.time.LocalDate;

public class Lector {
	private String nombre;
	private Integer cantidadLibros;
	private ArrayList<Prestamo> prestamos;
	private Boolean habilitado;
	private ArrayList<Multa> multas;

	public Boolean PuedePedirNuevoPrestamo() {
		return prestamos.size() < 3;
	}

	public void AgregarDiasMultado(int diasRestantes) {
		Multa multa = new Multa();
		int diasMulta;
		for (Prestamo p : this.prestamos) {
			diasMulta = p.CalcularDiasMulta().getDiasMultado();
			if(diasRestantes<diasMulta) {
				multa.setDiasMultado(diasMulta);
				multa.setFechaMulta(p.getFechaDevolucion());
				multas.add(multa);
			}
		}
	}

	public Integer DiasMultaRestantes(Multa multa){
		int diasRestantes;
		diasRestantes = multa.ConsultarDiasRestantes();
		return diasRestantes;
	}

	public void setHabilitado() {
		this.habilitado = this.PuedePedirNuevoPrestamo();
	}

	public void TomarPrestadoNuevoLibro(Libro libro) {
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaProximoMes = fechaActual.plusMonths(1);
		if (this.habilitado) {
			Prestamo prestamo = new Prestamo();
			prestamo.setFechaRetiro(fechaActual);
			prestamo.setFechaVencimiento(fechaProximoMes);
			prestamo.setLibro(libro);
			prestamo.setLector(this);
			prestamos.add(prestamo);
			this.setHabilitado();
		} else {
			System.out.println("No estas habilitado para sacar un nuevo libro");
		}

	}


}