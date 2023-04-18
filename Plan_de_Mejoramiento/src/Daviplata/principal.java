package Daviplata;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int rta;

        metods user=new metods();

        user.login();
        
        System.out.println("------------------------------------------------------------");

        user.meterPlata();
        
        System.out.println("------------------------------------------------------------");

        user.consultarSaldo();
        
        System.out.println("------------------------------------------------------------");

        user.sacarPlata();
        
        System.out.println("------------------------------------------------------------");
        user.recargar();
    }
}
