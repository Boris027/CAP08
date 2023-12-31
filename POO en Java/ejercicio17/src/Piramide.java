public class Piramide {
    
    private int altura;
    private static int creados;

    public Piramide(int a){
        this.altura=a;
        creados+=1;
    }

    public static int Getpiramidescreadas(){
        return creados;
    }


    public String toString(){
        String resultado="";

        for(int i=1;i<=this.altura;i++){


            for(int j=1;j<=this.altura-i;j++){
                resultado+=" ";
            }

            for(int j=1;j<=i+i-1;j++){
                resultado+="*";
            }



            resultado+="\n";
        }





        return resultado;
    }


}
