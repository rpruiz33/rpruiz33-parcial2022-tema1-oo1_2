package model;

import java.time.LocalDate;
import java.time.Period;

public class Campamento extends Servicio {
private LocalDate fechaEgreso;
private int CantCarpas;
private double precioCarpa;
public LocalDate getFechaEgreso() {
	return fechaEgreso;
}
public void setFechaEgreso(LocalDate fechaEgreso) {
	this.fechaEgreso = fechaEgreso;
}
public int getCantCarpas() {
	return CantCarpas;
}
public void setCantCarpas(int cantCarpas) {
	CantCarpas = cantCarpas;
}
public double getPrecioCarpa() {
	return precioCarpa;
}
public void setPrecioCarpa(double precioCarpa) {
	this.precioCarpa = precioCarpa;
}
public Campamento(int idServicio, String codingreso, LocalDate fechaIngreso, boolean checkOut, Persona responsable,
		LocalDate fechaEgreso, int cantCarpas, double precioCarpa) throws Exception {
	super(idServicio, codingreso, fechaIngreso, checkOut, responsable);
	this.fechaEgreso = fechaEgreso;
	CantCarpas = cantCarpas;
	this.precioCarpa = precioCarpa;
}
@Override
public String toString() {
	return "\nCampamento [fechaEgreso=" + fechaEgreso + ", CantCarpas=" + CantCarpas + ", precioCarpa=" + precioCarpa
			+ ", idServicio=" + idServicio + ", codingreso=" + codingreso + ", fechaIngreso=" + fechaIngreso
			+ ", checkOut=" + checkOut + ", responsable=" + responsable + "]";
}
public int  cantidadDias() {
	int dias=0;
	if(this.checkOut==true) {
	 dias=Period.between(getFechaIngreso(), getFechaEgreso()).getDays();
}else {
	dias=Period.between(getFechaIngreso(), LocalDate.of(2022,10 , 18)).getDays();
	}
return dias;
}
public double calcularPrecioFinal() {
	return this.CantCarpas* this.precioCarpa*this.cantidadDias();
}

}
