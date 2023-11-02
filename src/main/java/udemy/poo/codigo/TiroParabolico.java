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
      float v0y = (float) (this.velocidadInicial * Math.sin(Math.toRadians(grado)));
      float tiempo = v0y / this.gravedad;
      float y = (float) (v0y * tiempo - (4.9f * Math.pow(tiempo, 2)));
      return y;
    }
    public float alcance(){
      float v0x = (float) (this.velocidadInicial * Math.cos(Math.toRadians(grado)));
      float tiempo = (float) (2 * ((this.velocidadInicial * Math.sin(Math.toRadians(grado))) / this.gravedad));
      float x = (v0x * tiempo);
      return x;
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
