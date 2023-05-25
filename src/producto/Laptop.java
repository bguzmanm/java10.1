package producto;

public class Laptop extends Producto{
  private int pulgadas;
  private int ram;
  private int hd;
  public Laptop(String nombre, String marca, float precio) {
    super(nombre, marca, precio);
  }

  public Laptop(String nombre, String marca, float precio, int pulgadas, int ram, int hd) {
    super(nombre, marca, precio);
    this.pulgadas = pulgadas;
    this.ram = ram;
    this.hd = hd;
  }

  public int getPulgadas() {
    return pulgadas;
  }

  public void setPulgadas(int pulgadas) {
    this.pulgadas = pulgadas;
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public int getHd() {
    return hd;
  }

  public void setHd(int hd) {
    this.hd = hd;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println(this.getMarca() + " " + this.getNombre() + " $" + this.getPrecio() + ", " + pulgadas + ", " +
            ram + ", " + hd);
  }

  @Override
  public double calcularPrecio() {
    return this.getPrecio() + (this.getPrecio() * IVA);
  }
}
