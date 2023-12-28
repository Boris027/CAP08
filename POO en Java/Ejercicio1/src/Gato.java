public class Gato extends Animal implements Interfaz{
    
    private Raza raza;

    public enum Raza{
        mizo,miz,michi,morrongo;
    }

    public Gato(){
        this.raza=Raza.michi;
    }

    public Gato(Raza a){
        this.raza=a;
    }

    public Gato(Raza a, Animal.Sexo b){
        super(b);
        this.raza=a;
    }

    public Gato(Animal.Sexo b){
        super(b);
        this.raza=Raza.michi;
    }


    public Raza GetRaza(){
       return this.raza;
    }


    @Override
    public void sonido(){
        System.out.println("Miauuuuuu");
    }


    public String toString(){

        String devolver="Soy un: "+this.GetSexo()+" de la raza: "+this.GetRaza();

        return devolver;
    }


    public void pelearcon(Animal a){

        if(a.getClass().getName().equals("Perro")){
            System.out.println("Sal de mi territorio");
        }else if(a.getClass().getName().equals("Gato")){
            System.out.println("Puedes quedarte");
        }

    }

}
