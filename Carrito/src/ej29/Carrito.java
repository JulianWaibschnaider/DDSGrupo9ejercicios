package ej29;

import java.util.ArrayList;

public class Carrito {
private ArrayList<Item> items;
private String Id;
private Integer cantidad;
private Boolean comprado; //


public void Pagar(Boolean esPreferencial) {	
double totAPagar = 0;	
	if(esPreferencial) {
		totAPagar = this.CalcularTotal() * 0.85;  
	}else {
		totAPagar = this.CalcularTotal();
	}
	//aca le descontaria el credito en la tarjeta 
	this.setComprado(true);
}

public Integer CalcularTotal() {
	Integer sumaPrecio = 0; 
	for (Item i : items) {
		sumaPrecio += i.PrecioxCantidad();
	}
	return sumaPrecio;
}

public Boolean getComprado() {
	return comprado;
}


public void setComprado(Boolean comprado) {
	this.comprado = comprado;
}


public ArrayList<Item> getProductos() {
	return items;
}


public void setProductos(ArrayList<Item> items) {
	this.items = items;
}


public String getId() {
	return Id;
}


public void setId(String id) {
	Id = id;
}


public Integer getCantidad() {
	return cantidad;
}


public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}


}