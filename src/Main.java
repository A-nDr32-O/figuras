//Andrés Felipe Ortega Cárdenas
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        rectangulo rec1 = new rectangulo();
        rectangulo rec2 = new rectangulo();
        rectangulo rec3 = new rectangulo();

        triangulo tri1 = new triangulo();
        triangulo tri2 = new triangulo();
        triangulo tri3 = new triangulo();

        circulo ci1 = new circulo();
        circulo ci2 = new circulo();
        circulo ci3 = new circulo();


        Scanner teclado = new Scanner(System.in);


        System.out.println("Rectangulo");
        System.out.println("Triangulo");
        System.out.println("Circulo");
        System.out.print("Elige una figura:");
        int op = teclado.nextInt();


        switch (op){
            case 1:
                double rec_ba;
                double rec_al;
                double perim;
                System.out.print("Ingresa la base del rectangulo: ");
                rec_ba = teclado.nextDouble();
                rec1.setBase(rec_ba);
                System.out.print("Ingresa la altura del rectangulo: ");
                rec_al = teclado.nextDouble();
                rec1.setAltura(rec_al);

                rec1.cal_Area(rec1.getBase(), rec1.getAltura());
                rec1.cal_Perimetro(rec1.getBase(), rec1.getAltura());



                break;
        }


    }
}