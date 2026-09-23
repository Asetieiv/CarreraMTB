package herencia;

public final class RecorridoFacil extends Recorrido {
	
	public RecorridoFacil (float distancia, float puntaje) {
		super(distancia, puntaje);
	}
	
	@Override
	public float tiempoEstimado() {
		return distancia/30;
	}
	
	
	public void calcularPuntajeFacil() {
		setPuntaje(1);
	}
}
