public abstract class Reptil extends Animal {
    

    private Radiactivo radiactivo;


    public Reptil(String a){
        super(a);
        this.radiactivo=Radiactivo.no;
    }

    public Reptil(String a, Radiactivo b){
        super(a);
        this.radiactivo=b;
    }


    public enum Radiactivo{
        Si,no;
    }


    public Radiactivo GetRadiactivo(){
        return this.radiactivo;
    }


    public void diferencia(Animal a){
        
        if(!this.getClass().getSuperclass().getName().equals(a.getClass().getSuperclass().getName())){
            System.out.println("Tio, no eres de la misma raza que yo ._.");
        }else System.out.println("Somos reptiles, nos llevamos bien");
        

    }




}
