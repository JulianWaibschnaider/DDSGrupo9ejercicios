package ej29;

import java.util.ArrayList;

public class Cliente {
private String nombre;
private String direccionEnvio;
private String direccionCobro;
private String mail;
private Integer dni;
private Boolean preferencial;
private ArrayList <Tarjeta> tarjetas;
private ArrayList <Carrito> carritos;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccionEnvio() {
	return direccionEnvio;
}
public void setDireccionEnvio(String direccionEnvio) {
	this.direccionEnvio = direccionEnvio;
}
public String getDireccionCobro() {
	return direccionCobro;
}
public void setDireccionCobro(String direccionCobro) {
	this.direccionCobro = direccionCobro;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public ArrayList<Carrito> getCarritos() {
	return carritos;
}
public Integer getDni() {
	return dni;
}
public void setDni(Integer dni) {
	this.dni = dni;
}
public Boolean getPreferencial() {
	return preferencial;
}
public void setPreferencial(Boolean preferencial) {
	this.preferencial = preferencial;
}
public ArrayList <Tarjeta> getTarjetas() {
	return tarjetas;
}
public void setTarjetas(ArrayList <Tarjeta> tarjetas) {
	this.tarjetas = tarjetas;
}

public void PagarCarrito() {
	for(Carrito p : this.carritos) {
		p.Pagar(this.preferencial);
	}
}



}
