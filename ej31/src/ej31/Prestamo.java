package ej31;

import java.time.LocalDate;
import java.util.Date;

public class Prestamo {
	private LocalDate fechaRetiro; // 2 marzo
	private LocalDate fechaDevolucion; // 5 abril
	private LocalDate fechaVencimiento; // 2 abril
	private Libro libro;
	private Lector lector;

	public Multa CalcularDiasMulta() {
		int diasRetraso = ((this.fechaDevolucion.getDayOfYear() - this.fechaVencimiento.getDayOfYear()));
		Multa multa = new Multa();
		if (diasRetraso > 0) {
			multa.setDiasMultado(diasRetraso * 2);
			multa.setFechaMulta(fechaDevolucion);
			return multa;
		}
		return null;
	}

	public LocalDate getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(LocalDate fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Lector getLector() {
		return lector;
	}

	public void setLector(Lector lector) {
		this.lector = lector;
	}
}