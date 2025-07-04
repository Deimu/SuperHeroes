package mx.com.ubam.interfaces.pruebas;
import java.util.ArrayList;
import mx.com.ubam.interfaces.contratos.SuperHeroe;

public class Accion {
	
	private ArrayList<SuperHeroe> heroes = new ArrayList<SuperHeroe>();

	public ArrayList<SuperHeroe> getHeroes() {
		return heroes;
	}

	public void setHeroes(ArrayList<SuperHeroe> heroes) {
		this.heroes = heroes;
	}

	public void altaHeroes (SuperHeroe sh) {
		this.heroes.add(sh);
	}
	public void EntrarAccion() {
		for(SuperHeroe h: heroes ) {
			h.Volar();
			h.SalvarVidas();
			h.Pelear();
		}
	}
}
