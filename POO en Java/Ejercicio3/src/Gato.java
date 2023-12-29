public class Gato extends Mamifero{
    
    private Color color;

    public enum Color{
        Amarillo,Rosa,Rojo;
    }

    

    public Gato(String a){
        super(a);
        this.color=Color.Amarillo;
    }

    public Gato(String a, Color b){
        super(a);
        this.color=b;
    }

    public Color GetColor(){
        return this.color;
    }


    public void pelearcon(Animal a){

        if(!this.getClass().getName().equals(a.getClass().getName())){
            System.out.println("No eres un gatito, como te acerques te pego con mi pata");
        }else System.out.println("Holaaa, somos iguales Miauuuuu");

    }

    public void sonido(){
        System.out.println("Me gusta mucho hacer sonido miauuuu");
    }


}
