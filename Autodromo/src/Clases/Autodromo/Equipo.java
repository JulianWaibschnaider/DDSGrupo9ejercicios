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
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEquipo;
    private String nombre;
    @OneToMany(mappedBy="equipo")
    @JoinTable(name="EquipoXCorredor")
    @JoinColumn(name="IdCorredor")
    private ArrayList<Corredor> corredores;
    @OneToMany(mappedBy="equipo")
    @JoinTable(name="EquipoXTecnico")
    @JoinColumn(name="IdTecnico")
    private ArrayList<Tecnico> tecnicos;
    @OneToMany(mappedBy="equipo")
    @JoinTable(name="EquipoXVehiculo")
    @JoinColumn(name="IdVehiculo")
    private ArrayList<Vehiculo> vehiculos;



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Corredor> getCorredores() {
		return corredores;
	}
	public void setCorredores(ArrayList<Corredor> corredores) {
		this.corredores = corredores;
	}
	public ArrayList<Tecnico> getTecnicos() {
		return tecnicos;
	}
	public void setTecnicos(ArrayList<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
}
