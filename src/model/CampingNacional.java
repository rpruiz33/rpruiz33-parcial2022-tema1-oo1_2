package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class CampingNacional {
private List<Persona>lstPersonas;
private List<Servicio>lstServicios;

public List<Persona> getLstPersonas() {
	return lstPersonas;
}
public void setLstPersonas(List<Persona> lstPersonas) {
	this.lstPersonas = lstPersonas;
}
public List<Servicio> getLstServicios() {
	return lstServicios;
}
public void setLstServicios(List<Servicio> lstServicios) {
	this.lstServicios = lstServicios;
}
public CampingNacional() {
	super();
	this.lstPersonas = new ArrayList<Persona>();
	this.lstServicios = new ArrayList<Servicio>();
}
@Override
public String toString() {
	return "CampingNacional [lstPersonas=" + lstPersonas + ", lstServicios=" + lstServicios + ", getLstPersonas()="
			+ getLstPersonas() + ", getLstServicios()=" + getLstServicios() + "]";
}

public Persona traerPersona(long dni) {
	Persona persona=null;
	int i=0;
	while(i<lstPersonas.size()&&persona==null) {
	if (lstPersonas.get(i).getDni()==dni) {
		persona=lstPersonas.get(i);
	}
	i++;
	}
	return persona;
}


public boolean agregarPersona(String Apellido , String nombre, long dni)throws Exception {
	Persona persona=traerPersona(dni);
	if(persona!=null) {
		throw new Exception("ya existe con ese dni");
	}
	int id=1;
			if(lstPersonas.size()>0) {
				id=lstPersonas.get(lstPersonas.size()-1).getIdPersona()+1;
			}
			
			return lstPersonas.add(new Persona(id,Apellido , nombre,  dni));
}

public boolean agregarRecreo(String codIngreso, LocalDate fechaIngreso, boolean chekOut, Persona responsable, int cantPersonas, double precioPersona) throws Exception {
    // Validación del código de ingreso
    if (!esValidoDigitoControl(codIngreso)) {
        throw new Exception("Código de ingreso inválido.");
    }
    
    int id = 1;
    
    if (lstServicios.size() > 0) {
        id = lstServicios.get(lstServicios.size() - 1).getIdServicio() + 1;
    }

    return lstServicios.add(new Recreo(id, codIngreso, fechaIngreso, chekOut, responsable, cantPersonas, precioPersona));
}

public boolean agregarCampamento(String codingreso, LocalDate fechaIngreso, boolean checkOut, Persona responsable,
		LocalDate fechaEgreso , int cantCarpas, double precioCarpa )throws Exception {
	int id=1;
	if(lstServicios.size()>0) {
		id=lstServicios.get(lstServicios.size()-1).getIdServicio()+1;
	}
	return 	lstServicios.add(new Campamento(id,codingreso ,fechaIngreso, checkOut,responsable,fechaEgreso,  cantCarpas,precioCarpa));
	}

public List<Servicio>traerServiciosPorPrecioFinal(double mayorIgualA){
	List<Servicio> servi=new ArrayList <Servicio>();
	for (int i=0;i<lstServicios.size();i++) {
	if(lstServicios.get(i).isCheckOut()==true&& lstServicios.get(i).calcularPrecioFinal()>=mayorIgualA) {
		servi.add(lstServicios.get(i));
	}

}
	return servi;
}
public List<Campamento> traerCampamentoPorDias(int mayorIgualA){
	List<Campamento> servi=new ArrayList <Campamento>();
	for (int i=0;i<lstServicios.size();i++) {
	if(lstServicios.get(i)instanceof Campamento && ((Campamento)lstServicios.get(i)).cantidadDias()>=mayorIgualA) {
		servi.add((Campamento)lstServicios.get(i));
	}

}
	return servi;
}
public boolean esValidoDigitoControl(String codigoIngreso) {
    int suma = 0;
    boolean flag = false;
    
    for (int i = 0; i < codigoIngreso.length() -1; i++) {
        if (Character.getNumericValue(codigoIngreso.charAt(i)) >= 0 && Character.getNumericValue(codigoIngreso.charAt(i)) <= 9) {
            suma += Character.getNumericValue(codigoIngreso.charAt(i));
        }
    }
    
    int resul = suma % 10;
    
    if (resul == Character.getNumericValue(codigoIngreso.charAt(codigoIngreso.length() -1))) {
        flag = true;
    }
    
    return flag;
}

}