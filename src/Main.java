import carrito.ServicioCarrito;
import producto.Laptop;
import producto.Telefono;
import producto.Televisor;

public class Main {
  public static void main(String[] args) {

    ServicioCarrito carrito = new ServicioCarrito();

    carrito.addProducto(new Telefono("iPhone", "Apple", 500000, true, "colorao"));
    carrito.addProducto(new Televisor("Brabia", "Sonya", 200000, 50, "4k"));
    carrito.addProducto(new Laptop("Macbook Pro M2 Pro", "Apple", 2500000, 16, 16, 1024));

    carrito.addProducto(new Telefono("Galaxy", "Samsung", 300000, true, "morocho"));

    carrito.mostrarCarrito();
    System.out.println("El total de compra es: $ " + carrito.calcularTotal());

    carrito.removeProducto(0);

    carrito.mostrarCarrito();
    System.out.println("El total de compra es: $ " + carrito.calcularTotal());

  }
}