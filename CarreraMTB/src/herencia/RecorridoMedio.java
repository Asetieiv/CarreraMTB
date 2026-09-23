package herencia;

public final class RecorridoMedio  extends Recorrido {
	
	public RecorridoMedio(float distancia, float puntaje, boolean esAscendente) {
		super(distancia, puntaje);
		this.esAscendente = esAscendente;
		}

	
	private boolean esAscendente;
	
	public float indice() {
		if (esAscendente) {
			return 1.5f;
		}
		else return 0.5f;
	}
	
	
	public void calcularPuntajeMedio() {
		setPuntaje(1+indice());
		}
	
	
	public float tiempoEstimado() {        return distancia/25 * indice();
	}
}
