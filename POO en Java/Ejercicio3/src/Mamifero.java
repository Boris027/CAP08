public abstract class Mamifero extends Animal {
   
    public Mamifero(String a){
        super(a);
    }


    public void diferencia(Animal a){
        
        if(!this.getClass().getSuperclass().getName().equals(a.getClass().getSuperclass().getName())){
            System.out.println("Tio, no eres de la misma raza que yo ._.");
        }else System.out.println("Somos Mamiferos, nos llevamos bien");
        

    }
    

}
