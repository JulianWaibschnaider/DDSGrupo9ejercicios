package ej29;
import java.util.Date;

public class Tarjeta {
private String nombre;
private Integer numero;
private Date fechaVencimiento;
private String cvv;
private Boolean verificado;
//private cliente clientito
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Integer getNumero() {
	return numero;
}
public void setNumero(Integer numero) {
	this.numero = numero;
}
public Date getFechaVencimiento() {
	return fechaVencimiento;
}
public void setFechaVencimiento(Date fechaVencimiento) {
	this.fechaVencimiento = fechaVencimiento;
}
public String getCvv() {
	return cvv;
}
public void setCvv(String cvv) {
	this.cvv = cvv;
}
public Boolean getVerificado() {
	return verificado;
}
public void setVerificado(Boolean verificado) {
	this.verificado = verificado;
}

public void Verificar() {
	//verifica con el servicio externo 
	this.setVerificado(true);
}


}



