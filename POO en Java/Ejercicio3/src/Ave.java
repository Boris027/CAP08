public abstract class Ave extends Animal{
    
    private vuelaono volar;

    public Ave(String a, vuelaono b){
        super(a);
        this.volar=b;
    }

    public Ave(String a){
        super(a);
        this.volar=vuelaono.Novuela;
    }

    public enum vuelaono{
        Vuela,Novuela;
    }

    public vuelaono vuela(){
        return this.volar;
    }


    public void volar(){

        if(this.volar.equals(vuelaono.Novuela)){
            System.out.println("Bro, que no puedo volar, ere tonto=");
        }else System.out.println("A volaaaaar");

    }


    public void diferencia(Animal a){
        
        if(!this.getClass().getSuperclass().getName().equals(a.getClass().getSuperclass().getName())){
            System.out.println("Tio, no eres de la misma raza que yo ._.");
        }else System.out.println("Somos aves, nos llevamos bien");
        

    }


}
