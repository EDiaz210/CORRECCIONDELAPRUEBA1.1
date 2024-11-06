import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Objeto inicializados sin valores
        Cuadrado c1 = new Cuadrado(0);

        //Setear los parametros del objeto con valores ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("CUADRADO");
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        double lado = sc.nextDouble();
        Cuadrado c2 = new Cuadrado();
        c2.setLado(lado);


        //Cuadrado
        System.out.println("CUADRADO");
        System.out.println("El lado del cuadrado mide: "+c2.getLado());

        //Triangulo
        System.out.println("TRIANGULO");
        Triangulo t1 = new Triangulo();
        t1.setB(6.70);
        t1.setC(6.80);
        t1.setH(5.20);
        System.out.println("La altura del triangulo es: "+t1.getH());
        System.out.println("La base del triangulo es: "+t1.getB());
        System.out.println("La hipotenusa del triangulo es: "+t1.getC());
        //Rectangulo
        System.out.println("RECTANGULO");
        Rectangulo r1 = new Rectangulo();
        r1.setBase(2.60);
        r1.setAltura(5.30);
        System.out.println("La base del rectangulo es: "+r1.getBase());
        System.out.println("La altura del rectangulo es: "+r1.getAltura());
        //Circulo
        System.out.println("CIRCULO");
        Circulo cir1 = new Circulo();
        cir1.setRadio(4.50);
        System.out.println("El radio del circulo es: "+cir1.getRadio());

        //Perimetro y area de cada figura
        //Circulo
        System.out.println("PERIMETROS Y AREAS");
        System.out.println("CIRCULO");
        System.out.println("El perimetro del circulo es: "+cir1.getPerimetro());
        System.out.println("El area del circulo es: "+cir1.getArea());
        //Cuadrado
        System.out.println("CUADRADO");
        System.out.println("El perimetro del cuadrado es: "+c2.calcularPerimetroCua());
        System.out.println("El area del cuadrado es: "+c2.calcularAreaCua());
        //Rectangulo
        System.out.println("RECTANGULO");
        System.out.println("El perimetro del rectangulo es: "+r1.calcularPerimetroRec());
        System.out.println("El area del rectangulo es: "+r1.calcularAreaRec());
        //Triangulo
        System.out.println("TRIANGULO");
        System.out.println("El perimetro del triangulo es: "+t1.getPerimetro());
        System.out.println("El area del triangulo es: "+t1.getArea());

        //Sumatoria de Todas las areas de las figuras

        double Sumatoria = t1.getArea() + c1.calcularAreaCua() + cir1.getArea() + r1.calcularAreaRec();
        System.out.println("SUMATORIA TOTAL");
        System.out.println("El Sumatoria de todas las areas de las figura es: "+Sumatoria);

        //hOLA
    }
}