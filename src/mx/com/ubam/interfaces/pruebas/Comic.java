package mx.com.ubam.interfaces.pruebas;
import mx.com.ubam.interfaces.contratos.*;
import mx.com.ubam.interfaces.clases.*;

public class Comic {

	public static void main(String[] args) {
		SuperHeroe sm = new SuperMan();
		SuperHeroe im = new IronMan();
		SuperHeroe ch = new ChapulinColorado();
		
		Accion miAccion = new Accion();
		
		miAccion.altaHeroes(sm);
		miAccion.altaHeroes(im);
		miAccion.altaHeroes(ch);
		
		miAccion.EntrarAccion();

	}

}
