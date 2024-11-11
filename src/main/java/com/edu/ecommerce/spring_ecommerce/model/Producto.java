package com.edu.ecommerce.spring_ecommerce.model;

public class Producto {
	
	private Integer Id;
	private String nombre;
	private String desccipcion;
	private String imagen;
	private double precio;
	private int cantidad;
	
	public Producto() {
		super();
	}

	public Producto(Integer id, String nombre, String desccipcion, String imagen, double precio, int cantidad) {
		super();
		Id = id;
		this.nombre = nombre;
		this.desccipcion = desccipcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDesccipcion() {
		return desccipcion;
	}

	public void setDesccipcion(String desccipcion) {
		this.desccipcion = desccipcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [Id=" + Id + ", nombre=" + nombre + ", desccipcion=" + desccipcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	

}
