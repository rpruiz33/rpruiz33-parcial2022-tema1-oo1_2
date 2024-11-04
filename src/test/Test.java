package test;

import java.time.LocalDate;

import model.CampingNacional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CampingNacional nacional=new CampingNacional();
		try {
			System.out.println(nacional.agregarPersona("Sergio", "Lopez", 1111111));
			System.out.println(nacional.agregarPersona("Juan", "Rodriguez", 22222222));
			System.out.println(nacional.agregarPersona("Maria", "fernadez", 33333333));
			System.out.println(nacional.agregarPersona("Juan", "Vasquez", 44444444));
			System.out.println(nacional.agregarPersona("Ana", "Martinez", 5555555));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(nacional.agregarRecreo("7358902", LocalDate.of(2022,9,2), false, nacional.traerPersona(11111111),  5, 300));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(nacional.agregarCampamento("6573540",LocalDate.of(2022, 9, 3), false, nacional.traerPersona(22222222), null, 1, 1500));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(nacional.agregarRecreo("2583941", LocalDate.of(2022,9,3),true, nacional.traerPersona(33333333),  10, 300));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(nacional.agregarCampamento("2583941",LocalDate.of(2022,9,3), false,nacional.traerPersona(44444444), LocalDate.of(2022,9,8), 2, 1500));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(nacional.agregarRecreo("5243925", LocalDate.of(2022,9,3),true, nacional.traerPersona(5555555),  8, 300));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nacional.traerServiciosPorPrecioFinal(1000));
		System.out.println();
		System.out.println(nacional.traerCampamentoPorDias(5));
		try {
			System.out.println(nacional.agregarPersona("Maria", "fernadez", 33333333));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(nacional.agregarRecreo("5732927", LocalDate.of(2022,10,2), false, nacional.traerPersona(11111111),  5, 300));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
