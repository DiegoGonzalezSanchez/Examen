package modelo;

/**
 *
 * @author Diego Clase modelo: Donde se declaran las variables a utilizar.
 */
public class Modelo {

    public final int productoA;
    public final int productoB;
    public final int productoC;
    int arreglo[];
    String nombre;
    int tamañoArreglo;
    int moneda;

    // Metodo Constructor por default
    public Modelo() {
        productoA = 270;
        productoB = 340;
        productoC = 390;
        tamañoArreglo = 0;
        nombre = "";
        moneda = 0;
    }

    // Metodo Constructor Sobrecargado
    public Modelo(int productoA, int productoB, int productoC, int[] arreglo, String nombre, int tamañoArreglo, int moneda) {
        this.productoA = productoA;
        this.productoB = productoB;
        this.productoC = productoC;
        this.arreglo = arreglo;
        this.nombre = nombre;
        this.tamañoArreglo = tamañoArreglo;
        this.moneda = moneda;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamañoArreglo() {
        return tamañoArreglo;
    }

    public void setTamañoArreglo(int tamañoArreglo) {
        this.tamañoArreglo = tamañoArreglo;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

}
