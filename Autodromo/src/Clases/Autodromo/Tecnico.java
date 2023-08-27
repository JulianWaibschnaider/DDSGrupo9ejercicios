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
public class Tecnico extends Persona {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTecnico;
    private String certificado;
    @OneToMany(mappedBy="Tecnico")
    @JoinTable(name="EquipoXTecnico")
    @JoinColumn(name="IdPersona")
    private int IdPersona;
    public int getIdTecnico() {
        return IdTecnico;
    }
    public void setIdTecnico(int idTecnico) {
        IdTecnico = idTecnico;
    }
    public String getCertificado() {
        return certificado;
    }
    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
}