package Daviplata;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class metods {

    //ATRIBUTOS

    private String nombre;
    private String apellido;
    private String operador;
    private int cel;
    private int doc;
    private int password;
    private int saldo;
    private int saca;
    private int total;
    private int recarga;
    private int rta;

    //METODOS

    public void login() {
        Scanner leer=new Scanner(System.in);

        System.out.println("DIVIPLATA");
        System.out.println("Ingrese el numero");
        cel=leer.nextInt();

        System.out.println("Ingrese su clave");
        password=leer.nextInt();
    }

    public void meterPlata() {
        Scanner leer=new Scanner(System.in);

        System.out.println("Mete plata");

        System.out.println("igrese el nombre de el usuario");
        nombre=leer.next();

        System.out.println("ingrese el apellido de el usuario");
        apellido=leer.next();

        System.out.println("ingrese el numero al que meter plata");
        cel=leer.nextInt();

        System.out.println("Ingrese el monto");
        total=leer.nextInt();

        leer.close();
    }

    public void consultarSaldo() {
        Scanner leer=new Scanner(System.in);

        System.out.println("Consultar saldo");
        System.out.println("Su saldo es de:"+total);

        leer.close();
    }

    public void sacarPlata() {
        Scanner leer=new Scanner(System.in);
        

        System.out.println("Sacar plata");
        System.out.println("De que manera quiere sacar el dinero");
        System.out.println("1= Punto fisico");
        System.out.println("2= Cajero");
        System.out.println("3= Corresponsal");
        rta=leer.nextInt();


        switch (rta) {
            case 1:{
                System.out.println("Ingrese el monto a sacar");
                saca=leer.nextInt();

                saldo=saca-total;

                break;
            }
                
                
            case 2:{
                System.out.println("Ingrese el monto a sacar");
                saca=leer.nextInt();

                saldo=saca-total;

                System.out.println("Anote o guarde el siguiente codigo");

                break;
            }
            case 3:{
                System.out.println("Ingrese el monto a sacar");
            saca=leer.nextInt();

            System.out.println("Anote o guarde el siguiente codigo");
                break;
            }
            default:
                break;
        }
    }

    public void recargar() {
        Scanner leer=new Scanner(System.in);

        int valor;
        
        System.out.println("Recargar");
        System.out.println("Ingrese el numero al que se le realizara la recarga");
        cel=leer.nextInt();

        System.out.println("Ingrese el operador");
        operador=leer.next();

        System.out.println("Ingrese el valor de la recarga");
        valor=leer.nextInt();

        leer.close();
    }
}
