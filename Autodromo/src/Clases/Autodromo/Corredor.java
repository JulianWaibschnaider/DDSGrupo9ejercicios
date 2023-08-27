package Clases.Autodromo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Corredor extends Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCorredor;
	private int pesoGrs;
	@OneToMany(mappedBy="corredor")
    @JoinTable(name="EquipoXCorredor")
    @JoinColumn(name="IdPersona")
	private int IdPersona;
	public Long getIdCorredor() {
		return IdCorredor;
	}
	public void setIdCorredor(Long idCorredor) {
		IdCorredor = idCorredor;
	}
	public int getPesoGrs() {
		return pesoGrs;
	}
	public void setPesoGrs(int pesoGrs) {
		this.pesoGrs = pesoGrs;
	}
	public int getIdPersona() {
		return IdPersona;
	}
	public void setIdPersona(int idPersona) {
		IdPersona = idPersona;
	}

}