package herencia;

public final class RecorridoDificil  extends Recorrido {

	public RecorridoDificil(float distancia, float puntaje, int obstaculos) {
		super(distancia, puntaje);
		this.obstaculos = obstaculos;
	}
	
	private int obstaculos;
	
	
	public float calcularPuntajeDificil() {
		return distancia* 0.5f;
	}
	
	@Override
	public float tiempoEstimado() {
		return distancia/20 * obstaculos;
	}
	
}
