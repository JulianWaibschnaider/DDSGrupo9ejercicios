package ej31;
import java.lang.Integer;

public class MultaController{

    public Integer DevolucionCopia(){
        Integer diasMulta;
        Prestamo prestamo = new Prestamo();
        Multa multa = prestamo.CalcularDiasMulta();
        Lector lector = new Lector();
        diasMulta = lector.DiasMultaRestantes(multa);
        lector.AgregarDiasMultado(diasMulta);
        
        return diasMulta;

    }
}