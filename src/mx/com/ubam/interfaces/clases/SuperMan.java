package mx.com.ubam.interfaces.clases;

import mx.com.ubam.interfaces.contratos.SuperHeroe;

public class SuperMan implements SuperHeroe {
	
	public void SalvarVidas() {
		
		System.out.println("SuperMan salva vidas humanas");
		
	}
	public void Volar() {
		
		System.out.println("SuperMan vuela por los aires");
		
	}
	public void Pelear() {
		
		System.out.println("SuperMan pelea con los ojos");
	}

}
