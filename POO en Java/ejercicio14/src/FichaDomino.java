public class FichaDomino{


    private int ladoizquierdo,ladoderecho;


    public FichaDomino(int ladoizquierdo, int ladoderecho){
        this.ladoizquierdo=ladoizquierdo;
        this.ladoderecho=ladoderecho;
    }


    public FichaDomino voltear(){

        //int guardar=this.ladoizquierdo;
        //this.ladoizquierdo=this.ladoderecho;
        //this.ladoderecho=guardar;

        return new FichaDomino(this.ladoderecho, this.ladoizquierdo);
    }



    public boolean encajar(FichaDomino a){
        boolean resultado=false;
        if(a.ladoizquierdo==this.ladoizquierdo || a.ladoizquierdo==this.ladoderecho || a.ladoderecho==this.ladoizquierdo || a.ladoderecho==this.ladoderecho){
            resultado=true;
        }else resultado=false;


        return resultado;
    }



    public String toString(){

        String parte1="";
        String parte2="";

        if(this.ladoizquierdo==0){
            parte1=" ";
        }else parte1=Integer.toString(this.ladoizquierdo);

        if(this.ladoderecho==0){
            parte2=" ";
        }else parte2=Integer.toString(this.ladoderecho);

        return "["+parte1+"|"+parte2+"]";
    }


}