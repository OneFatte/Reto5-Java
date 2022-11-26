package POO;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int brk=1, figura=0;
        String repetir;

        while (brk==1){

            System.out.println(" Que area desea calcular \n 1) Cuadrado\n 2)Triangulo\n 3)Rectangulo\n 4)Circulo\n");
            figura=leer.nextInt();

            switch (figura){
                case 1:
                    Cuadrado c1=new Cuadrado();
                    System.out.println("Ingrese el valor del lado");
                    c1.setLado(leer.nextFloat());
                    c1.calcularArea();
                    break;

                case 2:
                    Triangulo t1=new Triangulo();
                    System.out.println("Ingrese el valor de la base");
                    t1.setBase(leer.nextFloat());
                    System.out.println("Ingrese el valor de la altura");
                    t1.setAltura(leer.nextFloat());
                    t1.calcularArea();
                    break;

                case 3:
                    Rectangulo r1=new Rectangulo();
                    System.out.println("Ingrese el valor de la base");
                    r1.setBase(leer.nextFloat());
                    System.out.println("Ingrese el valor de la altura");
                    r1.setAltura(leer.nextFloat());
                    r1.calcularArea();
                    break;

                case 4:
                    Circulo c2=new Circulo();
                    System.out.println("Ingrese el valor del radio");
                    c2.setRadio(leer.nextFloat());
                    c2.calcularArea();
                    break;

                default:
                    System.out.println("El valor ingresado es incorrecto");
                    break;

            }

            leer.nextLine();
            System.out.println("Desea calcular otra area ?\n 1)Si\n 2)No");
            repetir=leer.nextLine();

            if(repetir.equals("2") || repetir.equals("No") || repetir.equals("no") || repetir.equals("n")|| repetir.equals("N")){
                brk=0;
            }
        }
        System.out.println("Gracias");
        leer.close();
    }
}
