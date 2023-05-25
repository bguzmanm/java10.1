package carrito;

import producto.Producto;

import java.util.ArrayList;
import java.util.List;

public class ServicioCarrito {
  private List<Producto> lista = new ArrayList<Producto>();

  public void addProducto(Producto p){
    lista.add(p);
  }

  public void removeProducto(Producto p){
    lista.remove(p);
  }

  public void removeProducto(int index){
    lista.remove(index);
  }

  public double calcularTotal(){
    double total =0;
    for (Producto p: lista) {
      total+= p.calcularPrecio();
    }
    return total;
  }

  public void mostrarCarrito(){
    for (Producto p: lista) {
      p.mostrarInformacion();
    }
  }

}
