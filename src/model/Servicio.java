package model;

import java.time.LocalDate;

public abstract class Servicio  {
protected int idServicio;
protected String codingreso;
protected LocalDate fechaIngreso;
protected boolean checkOut ;
protected Persona responsable;
public int getIdServicio() {
	return idServicio;
}
public void setIdServicio(int idServicio) {
	this.idServicio = idServicio;
}
public String getCodingreso() {
	return codingreso;
}

public LocalDate getFechaIngreso() {
	return fechaIngreso;
}
public void setFechaIngreso(LocalDate fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
}
public boolean isCheckOut() {
	return checkOut;
}
public void setCheckOut(boolean checkOut) {
	this.checkOut = checkOut;
}
public Persona getResponsable() {
	return responsable;
}
public void setResponsable(Persona responsable) {
	this.responsable = responsable;
}
public Servicio(int idServicio, String codingreso, LocalDate fechaIngreso, boolean checkOut, Persona responsable) {
	super();
	this.idServicio = idServicio;
	this.codingreso=codingreso;
	this.fechaIngreso = fechaIngreso;
	this.checkOut = checkOut;
	this.responsable = responsable;
}





public abstract double calcularPrecioFinal();
}
