public abstract class Animal{

    private Sexo sexo;
    private String nombre;

    public enum Sexo{
        MACHO,HEMBRA;
    }

    public Animal(Sexo a, String nombre){
        this.sexo=a;
        this.nombre=nombre;
    }

    public Animal(String nombre){
        this.sexo=Sexo.MACHO;
        this.nombre=nombre;
    }


    public String Getnombre(){
        return this.nombre;
    }

    public Sexo GetSexo(){
        return this.sexo;
    }
}