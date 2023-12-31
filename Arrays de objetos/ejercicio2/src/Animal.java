public abstract class Animal{

    private Sexo sexo;
    private String nombre;

    public enum Sexo{
        MACHO,HEMBRA,NONE;
    }

    public Animal(Sexo a, String nombre){
        this.sexo=a;
        this.nombre=nombre;
    }

    public Animal(String nombre){
        this.sexo=Sexo.MACHO;
        this.nombre=nombre;
    }

    public Animal(){
        this.sexo=Sexo.NONE;
        this.nombre="null";
    }


    public void setsexo(){

        System.out.println("¿Que Sexo es?: ");
        System.out.println("1. Macho");
        System.out.println("2. Hembra");
        System.out.print("Eleccion: ");
        int eleccion=Integer.parseInt(System.console().readLine());  

        switch (eleccion) {
            case 1:
                this.sexo=Sexo.MACHO;
                break;
            case 2:
                this.sexo=Sexo.HEMBRA;
                break;
            default:
                break;
        }


    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    public String Getnombre(){
        return this.nombre;
    }

    public Sexo GetSexo(){
        return this.sexo;
    }
}