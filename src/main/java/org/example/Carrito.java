package org.example;
import java.util.Scanner;


public class Carrito {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 5);
    }


    private static void mostrarOpciones() {
        System.out.println("\n=========================================" );
        System.out.println("            IMPERIO                        " );
        System.out.println("      Gestión de Pistolas                  " );
        System.out.println("===========================================" );
        System.out.println("    [1] Agregar un producto                " );
        System.out.println("    [2] Eliminar un producto               " );
        System.out.println("    [3] Calcular el total de su carrito    " );
        System.out.println("    [4] Aplicar descuento                  " );
        System.out.println("    [5] Listar productos                   " );
        System.out.println("    [6]    Salir                           ");
        System.out.println("===========================================" );
        System.out.print("      Opcion: ");
    }


    private static int obtenerOpcion() {
        return Integer.parseInt(scanner.nextLine());
    }


    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> agregarProducto();
            case 2 -> eliminarProducto();
            case 3 -> calcularTotal();
            case 4 -> aplicarDescuento();
            case 5 -> listarProductos();
            case 6 -> System.out.println("  Hasta pronto vuleve a comprar con nosotros...");
            default -> System.out.println(" Opcion invalida...");
        }
    }

    private static void agregarProducto() {
        System.out.println("\n--- Agregar Producto ---");
        Scanner scanner = new Scanner(System.in); // Usamos el scanner estático de la clase

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine(); // Leemos la línea completa ingresada por el usuario

        System.out.print("Ingrese el precio del producto: ");
        double precio = -1; // si fuera texto seguiria siendo -1
        if (scanner.hasNextDouble()) {
            precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea pendiente después de leer el double
        } else {
            System.out.println("Precio inválido. Intente de nuevo.");
            scanner.nextLine(); // Limpiar la entrada incorrecta
            return;
        }
    }


}


