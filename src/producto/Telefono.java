package producto;

public class Telefono extends Producto {

  private boolean smart;
  private String color;

  public Telefono(String nombre, String marca, float precio) {
    super(nombre, marca, precio);
  }

  public Telefono(String nombre, String marca, float precio, boolean smart, String color) {
    super(nombre, marca, precio);
    this.smart = smart;
    this.color = color;
  }

  public boolean isSmart() {
    return smart;
  }

  public void setSmart(boolean smart) {
    this.smart = smart;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println(this.getMarca() + " " + this.getNombre() + " $" + this.getPrecio() + ", " + color + " es " +
            "inteligente? : " + smart);
  }

  @Override
  public double calcularPrecio() {
    if (smart){
      return this.getPrecio() + ((this.getPrecio() * IVA) + (this.getPrecio() * 0.05));
    }

    return this.getPrecio() + (this.getPrecio() * IVA);
  }
}
