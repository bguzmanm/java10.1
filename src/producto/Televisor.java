package producto;

public class Televisor extends Producto {
  private int pulgadas;
  private String tipoPantalla;

  public Televisor(String nombre, String marca, float precio) {
    super(nombre, marca, precio);
  }

  public Televisor(String nombre, String marca, float precio, int pulgadas, String tipoPantalla) {
    super(nombre, marca, precio);
    this.pulgadas = pulgadas;
    this.tipoPantalla = tipoPantalla;
  }

  public int getPulgadas() {
    return pulgadas;
  }

  public void setPulgadas(int pulgadas) {
    this.pulgadas = pulgadas;
  }

  public String getTipoPantalla() {
    return tipoPantalla;
  }

  public void setTipoPantalla(String tipoPantalla) {
    this.tipoPantalla = tipoPantalla;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println(this.getMarca() + " " + this.getNombre() + " $" + this.getPrecio() + ", " + tipoPantalla  +
            ", " + pulgadas);
  }

  @Override
  public double calcularPrecio() {
    return this.getPrecio() + (this.getPrecio() * IVA);
  }
}
