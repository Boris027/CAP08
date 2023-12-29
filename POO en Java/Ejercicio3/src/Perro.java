public class Perro extends Mamifero{
    

    public Perro(String a){
        super(a);
    }


    public void sonido(){
        System.out.println("Me gusta mucho hacer sonido guauuuuuu");
    }

    public void ladra(){
        System.out.println("Guauuuuuuu");
    }
    
    public void pelearcon(Animal a){

        if(!this.getClass().getName().equals(a.getClass().getName())){
            System.out.println("No eres un perro, como te acerques te pego con mi super ladrido");
        }else System.out.println("Holaaa, somos iguales *se pone junto a el*");

    }



}
