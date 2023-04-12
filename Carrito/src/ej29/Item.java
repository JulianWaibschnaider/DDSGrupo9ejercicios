package ej29;

public class Item {
private Carrito carrito;
private Producto producto;
private Integer precio;
private Integer cantidad;

public Carrito getCarrito() {
	return carrito;
}
public void setCarrito(Carrito carrito) {
	this.carrito = carrito;
}
public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
public Integer getCantidad() {
	return cantidad;
}
public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}
public Integer getPrecio() {
	return precio;
}
public void setPrecio(Integer precio) {
	this.precio = precio;
}

public Integer PrecioxCantidad() {
	return this.precio * this.cantidad;
}

}
