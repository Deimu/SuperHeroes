package mx.com.ubam.interfaces.clases;

import mx.com.ubam.interfaces.contratos.SuperHeroe;

public class IronMan implements SuperHeroe {
	
public void SalvarVidas() {
		
		System.out.println("IronMan salva vidas humanas");
		
	}
	public void Volar() {
		
		System.out.println("IronMan vuela por los aires con propulsores");
		
	}
	public void Pelear() {
		
		System.out.println("IronMan lanza ataques");
	}

}
