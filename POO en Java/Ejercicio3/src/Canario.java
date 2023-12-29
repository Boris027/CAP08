public class Canario extends Ave {
    

    public Canario(String a, Ave.vuelaono b){
        super(a,b);
    }

    public Canario(String a){
        super(a);
    }

    public void sonido(){
        System.out.println("Me gusta mucho hacer sonido pipopiiiii");
    }


    public void pelearcon(Animal a){

        if(!this.getClass().getName().equals(a.getClass().getName())){
            System.out.println("No eres un canario, como te acerques te pego con mi ala");
        }else System.out.println("Holaaa, somos iguales piopio");

    }

    public void bailoteo(){
        System.out.println("Ba-Ba-Bailoteoooooo");
    }


}
