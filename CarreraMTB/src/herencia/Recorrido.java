package herencia;

public abstract class Recorrido {
	
	protected float distancia;
	protected float puntaje;
	
	public abstract float tiempoEstimado();
	
	//constructor
	public Recorrido(float distancia, float puntaje) {
		this.distancia = distancia;
		this.puntaje = puntaje;
	}
	
	//getters y setters
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	public float getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(float puntaje) {
		this.puntaje = puntaje;
	}
}