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

/**
 * Producto de la tienda.
 */
public class Producto {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre del producto.
     */
    private String nombre;

    /**
     * Tipo del producto.
     */
    private String tipo;

    /**
     * Valor unitario del producto.
     */
    private double valorUnitario;

    /**
     * Cantidad de unidades en la bodega del producto.
     */
    private int cantidadBodega;

    /**
     * Cantidad de unidades m�nima que debe haber en bodega para poder hacer un pedido.
     */
    private int cantidadMinima;

    /**
     * Cantidad de unidades vendidas del producto.
     */
    private int cantidadUnidadesVendidas;

    /**
     * Ruta de la imagen del producto.
     */
    private String rutaImagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un producto con los valores dados por par�metro. <br>
     * <b> post: </b> El tipo, nombre, valor unitario, cantidad en bodega, cantidad m�nima y ruta imagen fueron inicializados con los valores dado por par�metro.
     *
     * @param pTipo           Tipo del producto. pTipo != null.
     * @param pNombre         Nombre del producto. pNombre != null && pNombre != "".
     * @param pValorUnitario  Valor unitario del producto. pValorUnitario >= 0.
     * @param pCantidadBodega Cantidad inicial en la bodega. pCantidadBodega >= 0.
     * @param pCantidadMinima Cantidad m�nima que debe haber en bodega. pCantidadMinima >= 0.
     * @param pRutaImagen     Ruta de la imagen del producto. pRutaImagen != null && pRutaImagen != "".
     */
    public Producto(String pTipo, String pNombre, double pValorUnitario, int pCantidadBodega, int pCantidadMinima, String pRutaImagen) {
        tipo = pTipo.toLowerCase();
        nombre = pNombre;
        valorUnitario = pValorUnitario;
        cantidadBodega = pCantidadBodega;
        cantidadMinima = pCantidadMinima;
        rutaImagen = pRutaImagen;
        cantidadUnidadesVendidas = 0;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Retorna el tipo del producto.
     *
     * @return Tipo de producto.
     */
    public String darTipo() {
        return tipo.toLowerCase();
    }

    /**
     * Retorna el valor unitario del producto.
     *
     * @return Valor unitario del producto.
     */
    public double darValorUnitario() {
        return valorUnitario;
    }

    /**
     * Retorna la cantidad en bodega del producto.
     *
     * @return Cantidad en bodega del producto.
     */
    public int darCantidadBodega() {
        return cantidadBodega;
    }

    /**
     * Retorna la cantidad m�nima del producto.
     *
     * @return Cantidad m�nima del producto.
     */
    public int darCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * Retorna la cantidad total de unidades vendidas.
     *
     * @return Cantidad de unidades vendidas.
     */
    public int darCantidadUnidadesVendidas() {
        return cantidadUnidadesVendidas;
    }

    /**
     * Retorna la ruta de la imagen del producto.
     *
     * @return Ruta de la imagen del producto.
     */
    public String darRutaImagen() {
        return rutaImagen;
    }

    /**
     * Cambia el nombre del producto.
     *
     * @param nuevoNombre
     */
    public void cambiarNombre(String nuevoNombre) {

        nombre = nuevoNombre;
        // TODO: Cambiar el nombre del producto
    }

    /**
     * Cambia el tipo del producto
     */
    public void cambiarTipo(String nuevoTipo) {
        this.tipo = nuevoTipo.toLowerCase();
    }

    /**
     * Cambiar el valor unitario del producto
     */
    public void cambiarValorUnitario(double nuevoValorUnitario) {

     valorUnitario = nuevoValorUnitario;
        // TODO: Cambiar el valor unitario del producto
    }

    /**
     * Cambiar la nueva cantidad en bodega
     */
    public void cambiarCantidadBodega(int nuevaCantidadEnBodega) {

        cantidadBodega = nuevaCantidadEnBodega;
        // TODO: Cambiar la nueva cantidad en bodega
    }

    /**
     * Cambiar la cantidad m�nima en bodega del producto
     */
    public void cambiarCantidadMinima(int nuevaCantidadMinima) {

        cantidadMinima = nuevaCantidadMinima;
        // TODO: Cambiar la cantidad m�nima en bodega del producto
    }

    /**
     * Cambia la cantidad de unidades vendidas del producto
     */
    public void cambiardarCantidadUnidadesVendidas(int nuevaCantidadUnidadesVendidas) {

        cantidadUnidadesVendidas = nuevaCantidadUnidadesVendidas;
        // TODO: Cambia la cantidad de unidades vendidas del producto
    }

    /**
 /**
 * Calcula el valor final del producto, incluyendo los impuestos.
 *
 * @return Precio de venta de una unidad incluyendo el IVA.
 */
public double calcularPrecioFinal() {

    //TODO :
    double iva;
    // Calcula el IVA según el tipo de producto
    if (tipo.equals("supermercado")) {
        iva = 0.04;
    } else if (tipo.equals("droguería")) {
        iva = 0.12;
    } else if (tipo.equals("papelería")) {
        iva = 0.16;
    } else {
        throw new IllegalStateException("Tipo de producto no válido");
    }
    // Calcula el precio final con el IVA incluido
    return valorUnitario * (1 + iva);
}

/**
 * Retorna el IVA correspondiente al producto.
 *
 * @return IVA.
 */
public double darIVA() {
    // TODO:
    double iva;

    // Calcula el IVA según el tipo de producto
    if (tipo.equals("supermercado")) {
        iva = 0.04;
    } else if (tipo.equals("droguería")) {
        iva = 0.12;
    } else if (tipo.equals("papelería")) {
        iva = 0.16;
    } else {
        throw new IllegalStateException("Tipo de producto no válido");
    }

    return iva;
}

/**
 * Vende la cantidad de unidades dada por parámetro.
 * Es decir, disminuye la cantidad de unidades en bodega del producto.
 * Si la cantidad a vender es mayor que la cantidad en bodega se debe
 * dejar la cantidad en bodega en cero, y se debe retornar la cantidad
 * en bodega que había antes.
 * En cualquier otro caso, se disminuye la cantidad en bodega en la
 * cantidad a vender. Hay que retornar esa cantidad vendida.
 *
 * @param pCantidad Cantidad de unidades a vender. pCantidad > 0.
 * @return Cantidad que realmente fue vendida, según la disponibilidad en la bodega.
 */
public int vender(int pCantidad) {
    int cantidadVendida;

    // Verificar si hay suficiente cantidad en bodega para vender
    if (pCantidad <= cantidadBodega) {
        cantidadBodega -= pCantidad; // Reducir la cantidad en bodega
        cantidadUnidadesVendidas += pCantidad; // Actualizar la cantidad vendida
        cantidadVendida = pCantidad; // La cantidad vendida es igual a la cantidad solicitada
    } else {
        cantidadVendida = cantidadBodega; // Vender toda la cantidad en bodega
        cantidadUnidadesVendidas += cantidadBodega; // Actualizar la cantidad vendida
        cantidadBodega = 0; // Establecer la cantidad en bodega a cero
    }

    return cantidadVendida;
}
/**
 * Abastece la cantidad de unidades dada por parámetro.
 * Aumenta la cantidad de unidades en bodega del producto.
 *
 * @param pCantidad Cantidad de unidades para abastecer. pCantidad >= 0.
 */
public void abastecer(int pCantidad) {
    // TODO :
    // Verificar que la cantidad a abastecer sea válida
    if (pCantidad >= 0) {
        cantidadBodega += pCantidad; // Aumentar la cantidad en bodega
    } else {
        throw new IllegalArgumentException("La cantidad a abastecer debe ser mayor o igual a cero");
    }
}

  /**
 * Indica si se puede abastecer las unidades del producto.
 *
 * @return True si la cantidad en la bodega es menor que la mínima, false en caso contrario.
 */
public boolean puedeAbastecer() {

    // TODO :
    return cantidadBodega < cantidadMinima;
}
