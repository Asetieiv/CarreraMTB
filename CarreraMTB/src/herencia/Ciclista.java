package herencia;
import java.util.ArrayList;
public class Ciclista {
	private int rendimiento;
	ArrayList<Recorrido> recorridos = new ArrayList<>();
	
	public float tiempoEstimado() {
		float suma = 0;
		for(Recorrido r : recorridos) {
			suma =+ r.tiempoEstimado();
		}
		return suma;
	}
	
	public float puntajeTotal() {
		float suma = 0;
		for (Recorrido r : recorridos) {
			suma =+ r.puntaje;
		}
		return suma;
	}

	
	public float distanciaTotal() {
		float suma = 0;
		for (Recorrido r : recorridos) {
			suma =+ r.distancia;
		}
		return suma;
	}
	
	
	public boolean terminaElRecorridoRapido() {
		if (rendimiento > (distanciaTotal()/2)) {
			return true;
		}
		else return false;
	}
}