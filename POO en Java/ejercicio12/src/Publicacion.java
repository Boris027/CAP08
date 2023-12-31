public abstract class Publicacion{

    private String ISBN, titulo;
    private int Año;


    public Publicacion(String a,String b,int c ){
        this.Año=c;
        this.titulo=b;
        this.ISBN=a;

    }


    public String toString(){

        return "ISBN: "+this.ISBN+", título: "+this.titulo+", año de publicación: "+this.Año;
    }


}