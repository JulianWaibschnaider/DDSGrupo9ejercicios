package Clases;

import Clases.Autodromo.Persona;
import Clases.Autodromo.Equipo;
import Clases.Autodromo.Corredor;
import Clases.Autodromo.Tecnico;
import Clases.Utils.BDUtils;
import java.util.List;
import javax.persistence.EntityManager;
import java.time.LocalDateTime;

public class MainClass {

    public static void main(String[] args) {
        EntityManager em = BDUtils.getEntityManager();
        BDUtils.comenzarTransaccion(em);
        
        Corredor juan = new Corredor();
        em.persist(juan);

        juan.setNombre("Juan");
        juan.setApellido("Perez");;
        juan.setNroDocumento(12345678);
        juan.setFechaNacimiento(LocalDateTime.parse("01/01/1990"));
        juan.setPesoGrs(80);
        juan.setNacionalidad("Argentina");
        
        Equipo ferrari = new Equipo();
        em.persist(ferrari);
        ferrari.setNombre("Ferrari");


        juan.setEquipo(ferrari);

        BDUtils.commit(em);

    }
}