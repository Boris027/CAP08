public abstract class Animal {
    
    private Sexo sexo;


    public enum Sexo{
        MACHO,HEMBRA;
    }

    public Animal(){
        this.sexo=Sexo.MACHO;
    }

    public Animal(Sexo a){
        this.sexo=a;
    }

    public Sexo GetSexo(){
        return this.sexo;
    }


    



    



    


}
