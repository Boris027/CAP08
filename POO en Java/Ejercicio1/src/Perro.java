public class Perro extends Animal implements Interfaz{
    

    private Raza raza;

    public enum Raza{
        Golden,Chihuahua,Bulldog,Salchicha;
    }


    public Perro(){
        this.raza=Raza.Golden;
    }

    public Perro(Raza a){
        this.raza=a;
    }

    public Perro(Raza a, Sexo b){
        super(b);
        this.raza=a;
    }

    public Perro(Sexo b){
        super(b);
        this.raza=Raza.Golden;
    }

    
    public Raza GetRaza(){
        return this.raza;
    }


    @Override
    public String toString(){


        return "Soy: "+this.GetSexo()+" soy de la raza: "+this.GetRaza()+ " y soy un: "+this.getClass().getName();
    }


    public void sonido(){
        System.out.println("Guauuuu");
    }


    @Override
    public void pelearcon(Animal a){

        if(!this.getClass().getName().equals(a.getClass().getName())){
            System.out.println("Tu no eres un perro, fuera de mi territorio!!");
        }else System.out.println("Bienvenido!!");

    }

}
