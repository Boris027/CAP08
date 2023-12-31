public class Libro extends Publicacion implements Prestable{
    
    private boolean prestado;

    public Libro(String a, String b, int c){
        super(a,b,c);
        this.prestado=false;
    }

    public void estaprestado(){

        if(this.prestado){
            System.out.println("El libro esta prestado");
        }else System.out.println("El libro no esta prestado");

    }

    public void presta(){

        if(this.prestado){
            System.out.println("Lo siento, ese libro ya esta prestado");
        }else this.prestado=true;


    }

    public void devuelve(){
        if(!this.prestado){
            System.out.println("Lo siento, ese libro ya esta devuelto");
        }else this.prestado=false;
    }


    public String toString(){
        String salida="";
        if(this.prestado){
            salida=" (prestado)";
        }else salida=" ( no prestado )";
            


        return super.toString()+salida;
    }

}
