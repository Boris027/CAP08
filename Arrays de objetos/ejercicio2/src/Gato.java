public class Gato extends Animal{
    
    private String color;


    public Gato(Sexo a, String b, String c){
        super(a,b);
        this.color=c;
    }

    public Gato(String b, String c){
        super(b);
        this.color=c;
    }

    public Gato(){
        
    }

    public Gato(String nombre){
        super(nombre);
    }

    public void setcolor(String color){
        this.color=color;
    }

    


    public String toString(){



        return "Hola, me llamo: "+this.Getnombre()+" soy un: "+this.getClass().getName()+" ,"+this.GetSexo()+" de color: "+this.color;
    }



}
