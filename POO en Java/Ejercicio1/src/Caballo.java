public class Caballo extends Animal implements Interfaz{
    
    private Raza raza;

    public enum Raza{
        Mustang,pinto,árabe,lusitano
    }


    public Caballo(){
        this.raza=Raza.Mustang;
    }


    public Caballo(Raza a){
        this.raza=a;
    }

    public Caballo(Sexo b){
        super(b);
        this.raza=Raza.Mustang;
    }

    public Caballo(Sexo b, Raza a){
        super(b);
        this.raza=a;
    }

    public void sonido(){
        System.out.println("bufffffff");
    }


    public Raza GetRaza(){
        return this.raza;
    }


    public String toString(){


        return "Soy un: "+this.GetSexo()+" de la raza: "+this.GetRaza()+" ademas de ser un: "+this.getClass().getName();
    }



    public void pelearcon(Animal a){

        if(!this.getClass().getName().equals(a.getClass().getName())){
            System.out.println("Fuera de aqui!!, no eres un caballo");
        }else System.out.println("Bienvenido ");


    }


}
