package model;

import java.time.LocalDate;

public class Recreo extends Servicio {
private int cantPersonas;
private double precioPersona;
public int getCantPersonas() {
	return cantPersonas;
}
public void setCantPersonas(int cantPersonas) {
	this.cantPersonas = cantPersonas;
}
public double getPrecioPersona() {
	return precioPersona;
}
public void setPrecioPersona(double precioPersona) {
	this.precioPersona = precioPersona;
}
public Recreo(int idServicio, String codingreso, LocalDate fechaIngreso, boolean checkOut, Persona responsable,
		int cantPersonas, double precioPersona) throws Exception {
	super(idServicio, codingreso, fechaIngreso, checkOut, responsable);
	this.cantPersonas = cantPersonas;
	this.precioPersona = precioPersona;
}
@Override
public String toString() {
	return "\nRecreo [cantPersonas=" + cantPersonas + ", precioPersona=" + precioPersona + ", idServicio=" + idServicio
			+ ", codingreso=" + codingreso + ", fechaIngreso=" + fechaIngreso + ", checkOut=" + checkOut
			+ ", responsable=" + responsable + "]";
}

public double calcularPrecioFinal() {
	return this.precioPersona* this.cantPersonas;
}

}
