public class Rectangulo {
    private int ancho, alto;
    private static int creados;

    public Rectangulo(int a, int b){
        this.ancho=a;
        this.alto=b;
        creados+=1;
    }

    public static int Getrectanguloscreados(){
        return creados;
    }


    public String toString(){

        String devolver="";


        for(int i=0;i<=this.alto-1;i++){

            for(int j=0;j<=this.ancho-1;j++){
                devolver+="*";
            }

            devolver+="\n";
        }





        return devolver;
    }



}
