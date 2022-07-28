package controlador;

/**
 *
 * @author Diego Clase Controlador: Donde se realizan las operaciones
 * principales.
 */
import java.util.Collection;
import modelo.Modelo;

public class Control {

    String respuesta = "";
    Modelo m = new Modelo();

    //Método para validar que las monedas Ingresadas sean de 10 , 50 , 100
    public String validarMoneda(Integer moneda) {

        if (moneda == 10 || moneda == 50 || moneda == 100) {
            return respuesta = "si";
        } else {
            return respuesta = "no";
        }
    }

    //Método para visualizar el arreglo de las monedas ingresdas, de un cierto producto
    public void mostrarMonedas(Collection moneda) {
        System.out.println("********************************");
        System.out.println("Monedas Ingresadas");
        moneda.forEach(elemento -> {
            System.out.println("Moneda: " + elemento);
        });
    }

    //Método que realiza las operaciones correspondientes al calculo de las mnedas que se deben regresar, dependiendo
    // del costo del producto y el total de mnedas ingresadas.
    public void regresarCambio(int pago, int costo) {
        System.out.println("********************************");
        int cien = 0, cincuenta = 0, diez = 0;

        if (pago > costo) {
            int resultado = pago - costo;

            cien = resultado / 100;
            resultado = resultado - (cien * 100);

            cincuenta = resultado / 50;
            resultado = resultado - (cincuenta * 50);

            diez = resultado / 10;
            resultado = resultado - (diez * 10);

            if (cien > 0) {
                System.out.println("Monedas en Cambio: ");
                for (int j = 0; j < cien; j++) {
                    System.out.println(" $100");
                }
            }
            if (cincuenta > 0) {
                System.out.println("Monedas en Cambio: ");
                for (int j = 0; j < cincuenta; j++) {
                    System.out.println(" $50");
                }
            }
            if (diez > 0) {
                System.out.println("Monedas en Cambio: ");
                for (int j = 0; j < diez; j++) {
                    System.out.println(" $10");
                }
            }

        } else {
            System.out.println("PAGO INSUFICIENTE. Volver a realizar el proceso");

        }

    }

}
