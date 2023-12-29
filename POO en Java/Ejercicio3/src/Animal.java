public abstract class Animal {
    
    private String Nombre;

    private int numeroAnimal;
    private static int animalestotales;

    public String GetNombre(){
        return this.Nombre;
    }

    public int numeroAnimal(){

        return this.numeroAnimal;
    }

    public static int animalestotales(){

        return animalestotales;
    }

    public Animal(String nombre){
        this.Nombre=nombre;
        animalestotales+=1;
        this.numeroAnimal=animalestotales;
    }


}
