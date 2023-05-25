# 10 - Ejercicio Java
POO, Herencia, Interfaces y Polimorfismo

## Enunciado

Supongamos que estás desarrollando un sistema de gestión de una tienda en línea que vende productos electrónicos. Debes implementar un sistema que administre diferentes tipos de productos, como teléfonos, laptops y televisores, y realice operaciones como agregar productos al carrito de compras, calcular el total y mostrar la información de los productos. Aquí tienes un esbozo del ejercicio:

1. Crea una clase abstracta llamada "Producto" que tenga los siguientes atributos y métodos:
    - Atributos:
        - nombre: una cadena que representa el nombre del producto.
        - precio: un número decimal que indica el precio del producto.
    - Métodos:
        - constructor: para inicializar los atributos.
        - abstract void mostrarInformacion(): un método abstracto que muestra la información del producto.
2. Crea tres clases derivadas de "Producto": "Telefono", "Laptop" y "Televisor". Cada una debe tener sus propios atributos y métodos, así como implementar el método "mostrarInformacion()" para mostrar la información específica de cada tipo de producto.
3. Crea una interfaz llamada "AgregableCarrito" que declare un método "calcularPrecio()". Esta interfaz representará la capacidad de un producto de ser agregado al carrito de compras y calcular su precio total.
4. Implementa la interfaz "AgregableCarrito" en las clases "Telefono", "Laptop" y "Televisor". El método "calcularPrecio()" debe calcular el precio total del producto, teniendo en cuenta cualquier descuento o impuesto aplicable.
5. En la clase principal, crea una lista de productos que contenga instancias de "Telefono", "Laptop" y "Televisor". Luego, recorre la lista y llama al método "mostrarInformacion()" para mostrar la información de cada producto. Además, para los productos que implementan la interfaz "AgregableCarrito", llama al método "calcularPrecio()" y muestra el precio total.