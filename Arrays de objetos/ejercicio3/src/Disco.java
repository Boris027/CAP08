public class Disco {
    
    private String codigo="LIBRE",autor,titulo,genero;
    private int duracion;



    public String getcodigo(){
        return this.codigo;
    }

    public String getautor(){
        return this.autor;
    }

    public String gettitulo(){
        return this.titulo;
    }

    public String getgenero(){
        return this.genero;
    }

    public int getduracion(){
        return this.duracion;
    }


    public void setcodigo(String a){
        this.codigo=a;
    }

    public void setautor(String a){
        this.autor=a;
    }

    public void settitulo(String a){
        this.titulo=a;
    }

    public void settgenero(String a){
        this.genero=a;
    }

    public void settduracion(int a){
        this.duracion=a;
    }




    public String toString(){
        String cadena="\n----------------------------------------";
        cadena+="\n"+this.codigo;
        cadena+="\n"+this.autor;
        cadena+="\n"+this.titulo;
        cadena+="\n"+this.genero;
        cadena+="\n"+this.duracion;
        cadena+="\n----------------------------------------";
        return cadena;
    }





}
