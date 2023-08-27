package Clases.Autodromo;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
@Entity
public class Persona {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int IdPersona;
		private String nombre;
	    private String apellido;
	    private String tipoDocumento;
	    private int nroDocumento;
	    private LocalDateTime fechaNacimiento;
	    private String nacionalidad;
	    private Equipo equipo; 

	public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getTipoDocumento() {
			return tipoDocumento;
		}

		public void setTipoDocumento(String tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}

		public int getNroDocumento() {
			return nroDocumento;
		}

		public void setNroDocumento(int nroDocumento) {
			this.nroDocumento = nroDocumento;
		}

		public LocalDateTime getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		public Equipo getEquipo() {
			return equipo;
		}

		public void setEquipo(Equipo equipo) {
			this.equipo = equipo;
		}

	public void validarIdentidad(){

	}
}
