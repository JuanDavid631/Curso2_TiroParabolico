package udemy.poo.codigo;

public class Componentes {
    private float tiempo, x, y;

    public Componentes(float tiempo, float x, float y) {
        this.tiempo = tiempo;
        this.x = x;
        this.y = y;
    }

  public float getTiempo() {
    return tiempo;
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }
}
