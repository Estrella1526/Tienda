/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot� - Colombia)
 * Programa de Ingenier�a de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Gu�a 2 - Actividad 2
 * Ejercicio: tienda
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package mundo;

import java.util.ArrayList;

/**
 * Tienda que maneja 4 productos.
 */
public class Tienda {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Producto 1 de la tienda.
     */
    private Producto producto1;

    /**
     * Producto 2 de la tienda.
     */
    private Producto producto2;

    /**
     * Producto 3 de la tienda.
     */
    private Producto producto3;

    /**
     * Producto 4 de la tienda.
     */
    private Producto producto4;

    /**
     * Dinero total recibido por las ventas.
     */
    private double dineroEnCaja;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la tienda con sus 4 productos. <br>
     * <b> post: </b> El dinero en caja fue inicializado en 0.<br>
     * Los 4 productos fueron inicializados con los siguientes valores: <br>
     * Producto 1 - Tipo: PAPELERIA, Nombre: L�piz, Valor unitario: 550.0, Cantidad en bodega: 18, Cantidad m�nima: 5, Imagen: lapiz.png. <br>
     * Producto 2 - Tipo: DROGUERIA, Nombre: Aspirina, Valor unitario: 109.5, Cantidad en bodega: 25, Cantidad m�nima: 8, Imagen: aspirina.png. <br>
     * Producto 3 - Tipo: PAPELERIA, Nombre: Borrador, Valor unitario: 207.3, Cantidad en bodega: 30, Cantidad m�nima: 10, Imagen: borrador.png. <br>
     * Producto 4 - Tipo: SUPERMERCADO, Nombre: Pan, Valor unitario: 150.0, Cantidad en bodega: 15, Cantidad m�nima: 20, Imagen: pan.png. <br>
     */
    public Tienda() {
        producto1 = new Producto("papeleria", "Lapiz", 550.0, 18, 5, "lapiz.png");
        producto2 = new Producto("drogueria", "Aspirina", 109.5, 25, 8, "aspirina.png");
        producto3 = new Producto("papeleria", "Borrador", 207.3, 30, 10, "borrador.png");
        producto4 = new Producto("supermercado", "Pan", 150.0, 15, 20, "pan.png");
        dineroEnCaja = 0;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el producto 1.
     *
     * @return Producto 1 de la tienda.
     */
    public Producto darPrimerProducto() {
        return producto1;
    }

    /**
     * Retorna el producto 2.
     *
     * @return Producto 2 de la tienda.
     */
    public Producto darSegundoProducto() {
        return producto2;
    }

    /**
     * Retorna el producto 3.
     *
     * @return Producto 3 de la tienda.
     */
    public Producto darTercerProducto() {
        return producto3;
    }

    /**
     * Retorna el producto 4.
     *
     * @return Producto 4 de la tienda.
     */
    public Producto darCuartoProducto() {
        return producto4;
    }

    /**
     * Retorna el dinero en caja.
     *
     * @return Dinero en caja.
     */
    public double darDineroEnCaja() {
        return dineroEnCaja;
    }

/**
 * Retorna el producto con el nombre dado por parámetro.
 *
 * @param pNombre Nombre del producto buscado. pNombre != null && pNombre != "".
 * @return Producto con el nombre dado por parámetro, null si no lo encuentra.
 */
public Producto darProducto(String pNombre) {
    // Verifica si el nombre del producto coincide con pNombre y retorna el producto correspondiente
    if (producto1.darNombre().equals(pNombre)) {
        return producto1;
    }
    if (producto2.darNombre().equals(pNombre)) {
        return producto2;
    }
    if (producto3.darNombre().equals(pNombre)) {
        return producto3;
    }
    if (producto4.darNombre().equals(pNombre)) {
        return producto4;
    }
    // Retorna null si no se encuentra el producto con el nombre dado
    return null;
}

    

/**
 * Retorna el promedio de las ventas.
 *
 * @return Dinero promedio obtenido por unidad de producto vendida.
 */
public double darPromedioVentas() {
    double totalVentas = 0.0;
    int totalUnidadesVendidas = 0;

    // Calcular el total de ventas y el total de unidades vendidas para cada producto
    totalVentas += producto1.darValorUnitario() * producto1.darCantidadUnidadesVendidas();
    totalUnidadesVendidas += producto1.darCantidadUnidadesVendidas();

    totalVentas += producto2.darValorUnitario() * producto2.darCantidadUnidadesVendidas();
    totalUnidadesVendidas += producto2.darCantidadUnidadesVendidas();

    totalVentas += producto3.darValorUnitario() * producto3.darCantidadUnidadesVendidas();
    totalUnidadesVendidas += producto3.darCantidadUnidadesVendidas();

    totalVentas += producto4.darValorUnitario() * producto4.darCantidadUnidadesVendidas();
    totalUnidadesVendidas += producto4.darCantidadUnidadesVendidas();

    // Calcular el promedio de ventas
    double promedioVentas = 0.0;
    if (totalUnidadesVendidas > 0) {
        promedioVentas = totalVentas / totalUnidadesVendidas;
    }

    return promedioVentas;
}



    /**
     * Retorna el producto con menos unidades vendidas.
     *
     * @return Producto con menos unidades vendidas. Null si ning�n producto tiene unidades vendidas.
     */
    public Producto darProductoMenosVendido() {
        Producto menosVendido = null;
        // TODO: Obtiene y retorna el prodcuto menos vendido


    int minUnidadesVendidas = Integer.MAX_VALUE;

    // Verificar la cantidad de unidades vendidas de cada producto individualmente
    if (producto1 != null && producto1.darCantidadUnidadesVendidas() < minUnidadesVendidas) {
        menosVendido = producto1;
        minUnidadesVendidas = producto1.darCantidadUnidadesVendidas();
    }

    if (producto2 != null && producto2.darCantidadUnidadesVendidas() < minUnidadesVendidas) {
        menosVendido = producto2;
        minUnidadesVendidas = producto2.darCantidadUnidadesVendidas();
    }

    if (producto3 != null && producto3.darCantidadUnidadesVendidas() < minUnidadesVendidas) {
        menosVendido = producto3;
        minUnidadesVendidas = producto3.darCantidadUnidadesVendidas();
    }

    if (producto4 != null && producto4.darCantidadUnidadesVendidas() < minUnidadesVendidas) {
        menosVendido = producto4;
        minUnidadesVendidas = producto4.darCantidadUnidadesVendidas();
    }

   return menosVendido;
}


      


  /**
 * Vende una cantidad de unidades de producto de la tienda, dado su nombre por parámetro.
 * <br><b>post: </b> Disminuyó la cantidad de unidades del producto dado
 * y se actualizó el dinero de la caja a partir de la cantidad real vendida multiplicada
 * por el precio final (con IVA) del producto vendido.
 *
 * @param pNombreProducto Nombre del producto a vender.
 * @param pCantidad       Cantidad de unidades del producto a vender. pCantidad > 0.
 * @return Cantidad que fue efectivamente vendida.
 */
public int venderProducto(String pNombreProducto, int pCantidad) {
    Producto productoAVender = null;

    // Encontrar el producto con el nombre dado
    if (producto1 != null && producto1.darNombre().equals(pNombreProducto)) {
        productoAVender = producto1;
    } else if (producto2 != null && producto2.darNombre().equals(pNombreProducto)) {
        productoAVender = producto2;
    } else if (producto3 != null && producto3.darNombre().equals(pNombreProducto)) {
        productoAVender = producto3;
    } else if (producto4 != null && producto4.darNombre().equals(pNombreProducto)) {
        productoAVender = producto4;
    }

    // Si no se encuentra el producto, retornar 0
    if (productoAVender == null) {
        return 0;
    }

    // Obtener la cantidad real que se puede vender
    int cantidadRealVendida = Math.min(pCantidad, productoAVender.darCantidadBodega());

    // Actualizar la cantidad de unidades vendidas del producto
    productoAVender.vender(cantidadRealVendida);

    // Actualizar el dinero de la caja
    double precioFinal = productoAVender.calcularPrecioFinal();
    double dineroVenta = cantidadRealVendida * precioFinal;
    dineroEnCaja += dineroVenta;

    return cantidadRealVendida;
}
/**
 * Abastece un producto dado su nombre, con la cantidad de unidades dadas.
 * <br><b>post: </b> Aumentó la cantidad de unidades en bodega del producto dado.
 *
 * @param pNombreProducto Nombre del producto a abastecer.
 * @param pCantidad       La cantidad de unidades a abastecer. cantidad >= 0.
 * @return Retorna true si se pudo efectuar el abastecimiento, false en caso contrario.
 */
public boolean abastecerProducto(String pNombreProducto, int pCantidad) {
    Producto productoAAbastecer = null;

    // Encontrar el producto con el nombre dado
    if (producto1 != null && producto1.darNombre().equals(pNombreProducto)) {
        productoAAbastecer = producto1;
    } else if (producto2 != null && producto2.darNombre().equals(pNombreProducto)) {
        productoAAbastecer = producto2;
    } else if (producto3 != null && producto3.darNombre().equals(pNombreProducto)) {
        productoAAbastecer = producto3;
    } else if (producto4 != null && producto4.darNombre().equals(pNombreProducto)) {
        productoAAbastecer = producto4;
    }

    // Si no se encuentra el producto, retornar false
    if (productoAAbastecer == null) {
        return false;
    }

    // Abastecer el producto con la cantidad especificada
    productoAAbastecer.abastecer(pCantidad);

    return true;
}

/**
 * Cambia el producto que tiene el nombre actual con los nuevos valores dados por parámetro.
 * <br><b>post: </b> El nombre, tipo, valor unitario, cantidad en bodega y cantidad mínima fueron cambiados con los valores dados por parámetro.
 *
 * @param pNombreActual   Nombre actual del producto.
 * @param pNombreNuevo    Nuevo nombre del producto.
 * @param pTipo           Tipo del producto.
 * @param pValorUnitario  Valor unitario del producto
 * @param pCantidadBodega Cantidad en bodega del producto.
 * @param pCantidadMinima Cantidad mínima en bodega para hacer un pedido del producto.
 * @param pRutaImagen     Ruta de la imagen del producto.
 * @return Retorna true si cambió la información del producto,
 *         Retorna false si ya existía un producto con el nuevo nombre.
 */
public boolean cambiarProducto(String pNombreActual, String pNombreNuevo, String pTipo, double pValorUnitario, int pCantidadBodega, int pCantidadMinima, String pRutaImagen) {
    // Verificar si ya existe un producto con el nuevo nombre
    if (producto1 != null && producto1.darNombre().equals(pNombreNuevo)) {
        return false;
    }
    if (producto2 != null && producto2.darNombre().equals(pNombreNuevo)) {
        return false;
    }
    if (producto3 != null && producto3.darNombre().equals(pNombreNuevo)) {
        return false;
    }
    if (producto4 != null && producto4.darNombre().equals(pNombreNuevo)) {
        return false;
    }

    // Buscar el producto con el nombre actual
    Producto productoACambiar = null;
    if (producto1 != null && producto1.darNombre().equals(pNombreActual)) {
        productoACambiar = producto1;
    }
    if (producto2 != null && producto2.darNombre().equals(pNombreActual)) {
        productoACambiar = producto2;
    }
    if (producto3 != null && producto3.darNombre().equals(pNombreActual)) {
        productoACambiar = producto3;
    }
    if (producto4 != null && producto4.darNombre().equals(pNombreActual)) {
        productoACambiar = producto4;
    }

    // Si no se encuentra el producto con el nombre actual, retornar false
    if (productoACambiar == null) {
        return false;
    }

    // Cambiar la información del producto
    productoACambiar.cambiarNombre(pNombreNuevo);
    productoACambiar.cambiarTipo(pTipo);
    productoACambiar.cambiarValorUnitario(pValorUnitario);
    productoACambiar.cambiarCantidadBodega(pCantidadBodega);
    productoACambiar.cambiarCantidadMinima(pCantidadMinima);
    

    return true;
}
/**
 * Obtiene la cantidad de productos que tienen un precio inferior al promedio de los precios.
 *
 * @return Cantidad de productos con precio inferior al promedio.
 */
public int metodo1() {
    // Calcular el promedio de los precios de los productos
    double sumaPrecios = 0;
    int cantidadProductos = 0;
    for (int i = 1; i <= 4; i++) {
        Producto producto = obtenerProducto(i);
        if (producto != null) {
            sumaPrecios += producto.darValorUnitario();
            cantidadProductos++;
        }
    }
    double promedioPrecios = sumaPrecios / cantidadProductos;

    // Contar la cantidad de productos con precio inferior al promedio
    int cantidadProductosInferiores = 0;
    for (int i = 1; i <= 4; i++) {
        Producto producto = obtenerProducto(i);
        if (producto != null && producto.darValorUnitario() < promedioPrecios) {
            cantidadProductosInferiores++;
        }
    }

    return cantidadProductosInferiores;
}

/**
 * Retorna el producto correspondiente al índice dado.
 * 
 * @param indice El índice del producto.
 * @return El producto correspondiente al índice dado, o null si el índice es inválido.
 */
private Producto obtenerProducto(int indice) {
    switch (indice) {
        case 1:
            return producto1;
        case 2:
            return producto2;
        case 3:
            return producto3;
        case 4:
            return producto4;
        default:
            return null;
    }
}
/**
 * Obtiene el nombre del producto más barato de la tienda.
 *
 * @return El nombre del producto más barato.
 */
public String metodo2() {
    double precioMasBajo = Double.MAX_VALUE;
    String nombreProductoMasBarato = "";

    // Iterar sobre todos los productos de la tienda
    for (int i = 1; i <= 4; i++) {
        Producto producto = obtenerProducto(i);
        if (producto != null && producto.darValorUnitario() < precioMasBajo) {
            precioMasBajo = producto.darValorUnitario();
            nombreProductoMasBarato = producto.darNombre();
        }
    }

    return nombreProductoMasBarato;
}
