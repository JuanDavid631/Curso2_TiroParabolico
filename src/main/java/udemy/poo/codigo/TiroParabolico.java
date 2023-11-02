package udemy.poo.codigo;

public class TiroParabolico {
    private float velocidadInicial;
    private int grado;
    private final float gravedad = 9.8f;

    public TiroParabolico(float velocidadInicial, int grado) {
        this.velocidadInicial = velocidadInicial;
        this.grado = grado;
    }

    public  float alturaMaxima(){

      return 0.0f;
    }
    public float alcance(){
      return 0.0f;
    }

  public float getVelocidadInicial() {
    return velocidadInicial;
  }

  public void setVelocidadInicial(float velocidadInicial) {
    this.velocidadInicial = velocidadInicial;
  }

  public int getGrado() {
    return grado;
  }

  public void setGrado(int grado) {
    this.grado = grado;
  }

  public float getGravedad() {
    return gravedad;
  }
}
