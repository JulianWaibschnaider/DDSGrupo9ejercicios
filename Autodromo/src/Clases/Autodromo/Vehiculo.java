package Clases.Autodromo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdVehiculo;
	private Equipo equipoCompeticion;
    private String marca;
    private String modelo;
    private int pesoEnGrs;

    public Equipo getEquipoCompeticion() {
        return equipoCompeticion;
    }

    public void setEquipoCompeticion(Equipo equipoCompeticion) {
        this.equipoCompeticion = equipoCompeticion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPesoEnGrs() {
        return pesoEnGrs;
    }

    public void setPesoEnGrs(int pesoEnGrs) {
        this.pesoEnGrs = pesoEnGrs;
    }

    public void inscribirse(){
        
    }
}
