package producto;

public abstract class Producto implements IAgregableCarrito {
  private String nombre;
  private String marca;
  private float precio;

  public Producto(String nombre, String marca, float precio) {
    this.nombre = nombre;
    this.marca = marca;
    this.precio = precio;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public abstract void mostrarInformacion();
}
