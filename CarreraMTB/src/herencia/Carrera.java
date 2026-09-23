package herencia;
import java.util.ArrayList;
public class Carrera {
	
	ArrayList <Ciclista> ciclistas = new ArrayList<>();
	
	public ArrayList<Ciclista> puntajeMayorATreinta() {
		ArrayList <Ciclista> buenosPuntajes = new ArrayList<>();
		for (Ciclista c : ciclistas) {
			if (c.puntajeTotal()>30) {
				buenosPuntajes.add(c);
			}
		}
		return buenosPuntajes;
	}
	
	public Ciclista MayorTiempoEstimado() {
		Ciclista mayorTiempo = new Ciclista();
		for (Ciclista c : ciclistas) {
			if (c.tiempoEstimado()>mayorTiempo.tiempoEstimado()) {
				mayorTiempo = c;
			}
		}
		return mayorTiempo;
	}
	
	public boolean terminaElRecorridoEnMenosDeDosHoras() {
		for (Ciclista c : ciclistas) {
			if (c.terminaElRecorridoRapido()) {
				return true;
			}
		}
		return false;
	}
}