package POO;

public class Rectangulo extends Figura{
    //atributos
    private float base;
    private float altura;
    
    //Metodos
    public Rectangulo(){

    }
    public Rectangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    public float getBase(){
        return base;
    }
    public void setBase(float base){
        this.base=base;
    }

    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }

    @Override
    public void calcularArea(){
        float area=(base*altura);
        System.out.println("El area de un rectangulo de base "+base+" y altura: "+altura+" es de: "+area);
    }
}
