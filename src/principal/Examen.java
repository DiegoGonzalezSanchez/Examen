package principal;

/**
 *
 * @author Diego
 */
import controlador.Control;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Modelo;

public class Examen {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        //Declaración de variables
        String opcion = "", respuestaValidar = "";
        int pago = 0, contador = 0, moneda = 0, numeroDeMonedas = 0;
        char tipoP;

        Modelo modelo = new Modelo();
        Control control = new Control();

        System.out.println("Ingrese su Nombre porfavor");
        String nombre = sca.next();
        modelo.setNombre(nombre);
        
        //Estructura de control para Realizar las compras el numero de veces que desee el usuario
        do {
            pago = 0;
            System.out.println("Digíte la letra del producto: \nA) Producto A \nB) Producto B \nC) Producto C");
            tipoP = sca.next().toUpperCase().charAt(0);

            //Se lleva el control de cada Producto
            switch (tipoP) {
                
                //Se Ingresa por teclado, la cantidad de monedas y las monedas para el ProductoA
                case 'A':
                    System.out.println("-------------------------------------------");
                    System.out.println("PRODUCTO A \nTiene un costo de: $270");
                    System.out.println("¿Cuántas  monedas Ingresará? (Debe estar entre el rango de 3 a 10 monedas)");
                    numeroDeMonedas = sca.nextInt();
                    modelo.setTamañoArreglo(numeroDeMonedas);

                    //Se validan el rango de monedas que se debe ingresar
                    if (numeroDeMonedas > 2 && numeroDeMonedas < 10) {
                        System.out.println("Ingrese las monedas. Solo se aceptan de $10, $50 y $100");

                        ArrayList<Integer> arregloMonedas = new ArrayList<Integer>();
                        for (int i = 0; i < numeroDeMonedas; i++) {

                            moneda = sca.nextInt();
                            respuestaValidar = control.validarMoneda(moneda);
                            if (respuestaValidar == "si") {
                                pago += moneda;

                                arregloMonedas.add(moneda);

                            } else {
                                System.out.println("Porfavor Ingresar solo monedas de $10, $50 y $100");
                                moneda = sca.nextInt();
                                respuestaValidar = control.validarMoneda(moneda);
                                if (respuestaValidar == "si") {
                                    pago += moneda;
                                } else {
                                    System.out.println("VUELVA A INTENTARLO MAS TARDE");
                                    break;
                                }
                            }
                        }
                        control.mostrarMonedas(arregloMonedas);
                        System.out.println("");
                        control.regresarCambio(pago, modelo.productoA);

                    } else {
                        System.out.println("No se puede ingresar mas de 10 monedas");
                    }

                    break;
                    
                //Se Ingresa por teclado, la cantidad de monedas y las monedas para el ProductoB
                case 'B':
                    System.out.println("-------------------------------------------");
                    System.out.println("PRODUCTO B \nTiene un costo de: $340");
                    System.out.println("¿Cuántas  monedas Ingresará? (Debe estar entre el rango de 3 a 10 monedas)");
                    numeroDeMonedas = sca.nextInt();
                    modelo.setTamañoArreglo(numeroDeMonedas);

                    if (numeroDeMonedas > 2 && numeroDeMonedas < 10) {
                        System.out.println("Ingrese las monedas. Solo se aceptan de $10, $50 y $100");

                        ArrayList<Integer> arregloMonedas = new ArrayList<Integer>();
                        for (int i = 0; i < numeroDeMonedas; i++) {

                            moneda = sca.nextInt();
                            respuestaValidar = control.validarMoneda(moneda);
                            if (respuestaValidar == "si") {
                                pago += moneda;

                                arregloMonedas.add(moneda);

                            } else {
                                System.out.println("Por favor Ingresar solo monedas de $10, $50 y $100");
                                moneda = sca.nextInt();
                                respuestaValidar = control.validarMoneda(moneda);
                                if (respuestaValidar == "si") {
                                    pago += moneda;
                                } else {
                                    System.out.println("VUELVA A INTENTARLO MAS TARDE");
                                    break;
                                }
                            }
                        } 
                        control.mostrarMonedas(arregloMonedas);
                        System.out.println("");
                        control.regresarCambio(pago, modelo.productoB);

                    } else {
                        System.out.println("No se puede ingresar mas de 10 monedas");
                    }
                    break;

                //Se Ingresa por teclado, la cantidad de monedas y las monedas para el ProductoA
                case 'C':
                    System.out.println("-------------------------------------------");
                    System.out.println("PRODUCTO C \nTiene un costo de: $390");
                    System.out.println("¿Cuántas  monedas Ingresará? (Debe estar entre el rango de 3 a 10 monedas)");
                    numeroDeMonedas = sca.nextInt();
                    modelo.setTamañoArreglo(numeroDeMonedas);

                    if (numeroDeMonedas > 2 && numeroDeMonedas < 10) {
                        System.out.println("Ingrese las monedas. Solo se aceptan de $10, $50 y $100");

                        ArrayList<Integer> arregloMonedas = new ArrayList<Integer>();
                        for (int i = 0; i < numeroDeMonedas; i++) {

                            moneda = sca.nextInt();
                            respuestaValidar = control.validarMoneda(moneda);
                            if (respuestaValidar == "si") {
                                pago += moneda;

                                arregloMonedas.add(moneda);

                            } else {
                                System.out.println("Porfavor Ingresar solo monedas de $10, $50 y $100");
                                moneda = sca.nextInt();
                                respuestaValidar = control.validarMoneda(moneda);
                                if (respuestaValidar == "si") {
                                    pago += moneda;
                                } else {
                                    System.out.println("VUELVA A INTENTARLO MAS TARDE");
                                    break;
                                }
                            }
                        }
                        control.mostrarMonedas(arregloMonedas);
                        System.out.println("");
                        control.regresarCambio(pago, modelo.productoC);

                    } else {
                        System.out.println("No se puede ingresar mas de 10 monedas");
                    }
                    break;

                default:
                    System.out.println("¡¡Error!!. No Existe el producto " + tipoP);
            }

            contador++;

            System.out.println("\n¿Desea elegir otro Producto?. Digíte SI / NO");
            opcion = sca.next();

        } while (opcion.equalsIgnoreCase("SI"));

        System.out.println("Se realizaron " + contador + " compras");
        System.out.println("Gracias por tu Compra " + nombre);

    }
}
