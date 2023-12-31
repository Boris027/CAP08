public class App {
    public static void main(String[] args) throws Exception {
       
        FichaDomino[] lista=new FichaDomino[8];
        int randomanterior=0;
        int contador=1;
        for(int i=0;i<=lista.length-1;i++){
            int random=(int) (Math.random()*7);
            int random2=(int) (Math.random()*7);
            
            if(i==0){
                lista[i]=new FichaDomino(random, random2);
            }else{

                lista[i]=new FichaDomino(lista[i-1].getderecha(), random2);

            }

            
        }


        for(int i=0;i<=lista.length-1;i++){
            System.out.print(lista[i]+" ");
        }

    }
}
