package POO;

public class Cuadrado extends Figura{
    
    //atributos
    private float lado;

    //metodoss
    public Cuadrado(){

    }
    public Cuadrado(float lado){
        this.lado=lado;
    }
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public void calcularArea(){
        float area=lado*lado;
        System.out.println("El area de un cuadrado de lado "+lado+" es de: "+area);
    }

}
