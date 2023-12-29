public class Pinguino extends Ave{
    
    public Pinguino(String a, Ave.vuelaono b){
        super(a,b);
    }


    public void pelearcon(Animal a){

        if(!this.getClass().getName().equals(a.getClass().getName())){
            System.out.println("No eres un pinguino, como te acerques te pego con mi ala");
        }else System.out.println("Holaaa, somos iguales *se desliza*");

    }


    public void sonido(){
        System.out.println("Me gusta mucho hacer sonido papapapap aleteoo");
    }


}
