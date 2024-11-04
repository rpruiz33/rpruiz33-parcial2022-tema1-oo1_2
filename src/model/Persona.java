package model;

public class Persona {
private int idPersona;
private String Apellido;
private String Nombre;
private long dni;


public int getIdPersona() {
	return idPersona;
}
public void setIdPersona(int idPersona) {
	this.idPersona = idPersona;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public long getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public Persona(int idPersona, String apellido, String nombre, long dni) {
	super();
	this.idPersona = idPersona;
	Apellido = apellido;
	Nombre = nombre;
	this.dni = dni;
}
@Override
public String toString() {
	return "Persona [idPersona=" + idPersona + ", Apellido=" + Apellido + ", Nombre=" + Nombre + ", dni=" + dni + "]";
}





}

