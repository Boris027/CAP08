public class Linea {
    
    String apartado1="",apartado2="";

    public Linea(Punto a, Punto b){

        this.apartado1+=a.Getx();
        this.apartado1+=", "+a.GetY();
        this.apartado2+=b.Getx();
        this.apartado2+=", "+b.GetY();
        
    }


    public String toString(){


        return "La linea formada por los puntos ("+this.apartado1+") y ("+this.apartado2+")";
    }

}
