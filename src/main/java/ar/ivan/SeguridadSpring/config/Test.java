package ar.ivan.SeguridadSpring.config;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Empleado[] empleados=new Empleado[5];	
		empleados[0]=new Empleado();
		empleados[1]=new Empleado();
		empleados[2]=new Empleado();
		empleados[3]=new Director();
		empleados[4]=new Empleado();
		
		
		for(Empleado obj : empleados) {
			obj.descanso();
		}
		
	}

}

class Empleado{

	int nombre;
	int apellido;
	
	void trabaja() {
		System.out.println("Trabajo Empleado");
	}
	
	void descanso() {
		System.out.println("Descanso empleado");
	}
}

class Director extends Empleado{
	int nombre;
	int apellido;
	
	void trabaja() {
		System.out.println("Trabajo Director");
	}
	void gestiono() {
		
		System.out.println("Gestiono");
		
	
	}
	
}
