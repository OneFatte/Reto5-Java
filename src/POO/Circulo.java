package POO;
import java.lang.Math;

public class Circulo extends Figura{

    //Atributos
    private float radio;

    //Metodos
    public Circulo(){

    }
    public Circulo(float radio){
        this.radio=radio;
    }
    public float getRadio(){
        return radio;
    }
    public void setRadio(float radio){
        this.radio=radio;
    }

    @Override
    public void calcularArea(){
        double area=(Math.pow(radio, 2)*Math.PI);
        System.out.println("El area de un circulo de radio "+radio+" es de: "+area);
   
    }
    
}
