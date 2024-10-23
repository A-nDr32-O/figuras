//Andrés Felipe Ortega Cárdenas

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List lista = new List();

        rectangulo rec1 = new rectangulo();

        triangulo tri1 = new triangulo();

        circulo ci1 = new circulo();


        Scanner teclado = new Scanner(System.in);
        int op;

        do {
            System.out.println("=======================");
            System.out.println("1.Rectangulo");
            System.out.println("2.Triangulo");
            System.out.println("3.Circulo");
            System.out.println("4.Lista de figuras");
            System.out.println("5.Salir");
            System.out.print("Elige una figura:");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    double rec_ba;
                    double rec_al;

                    System.out.println("=======================");

                    System.out.print("Ingresa la base del rectangulo: ");
                    rec_ba = teclado.nextDouble();
                    rec1.setBase(rec_ba);
                    System.out.print("Ingresa la altura del rectangulo: ");
                    rec_al = teclado.nextDouble();
                    rec1.setAltura(rec_al);
                    System.out.println("===========================");
                    rec1.cal_Area();
                    System.out.println("===========================");
                    rec1.cal_Perimetro();

                    break;
                case 2:
                    double tri_ba;
                    double tri_al;
                    double lad1;
                    double lad2;
                    double lad3;


                    System.out.println("=======================================");
                    System.out.println("Primero vamos a medir el area del triangulo ");

                    System.out.print("\nIngrese la altura del triangulo: ");
                    tri_al = teclado.nextDouble();
                    tri1.setAltura(tri_al);
                    System.out.print("Ingrese la base del triangulo:");
                    tri_ba = teclado.nextDouble();
                    tri1.setBase(tri_ba);

                    tri1.cal_Area();

                    System.out.println("\n================================");

                    System.out.println("\nAhora vamos a medir el perimetro ");


                    System.out.print("\nIngresa medida del lado 1 del triangulo: ");
                    lad1 = teclado.nextDouble();
                    tri1.setLad1(lad1);
                    System.out.print("Ingresa medida del lado 2 del triangulo: ");
                    lad2 = teclado.nextDouble();
                    tri1.setLad2(lad2);
                    System.out.print("Ingresa medida del lado 3 del triangulo: ");
                    lad3 = teclado.nextDouble();
                    tri1.setLad3(lad3);

                    tri1.cal_Perimetro();
                    break;
                case 3:
                    double radio;

                    System.out.print("Ingrese el radio del circulo: ");
                    radio = teclado.nextDouble();
                    ci1.setRadio(radio);

                    System.out.println("=======================");
                    ci1.cal_Area();
                    System.out.println("=======================");
                    ci1.cal_Perimetro();
                    break;
                case 4:
                    System.out.println("=======================");
                    System.out.println(rec1.toString());
                    System.out.println(tri1.toString());
                    System.out.println(ci1.toString());
                    break;
                case 5:

                    break;
            }
        }while (op!=5);
    }
}