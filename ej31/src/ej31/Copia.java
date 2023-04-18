package ej31;

public class Copia {
	private Libro libro;
	private Estado estado;
	private Integer identificador;

	public void CambiarEstado(Estado estadoNuevo) {
		this.estado = estadoNuevo;
	}

}