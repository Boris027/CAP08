import java.text.DecimalFormat;

public class Movil extends Terminal {
    
    private Tarifa tarifa;
    private float precio;

    public enum Tarifa{
        rata,mono,bisonte;
    }

    public Movil(String a, Tarifa b){
        super(a);
        this.tarifa=b;
    }

    public void llama(Movil a, int b){

        

            super.llama(a,b);
            int minutos=b/60;

            /* 
            if(a.tarifa==Tarifa.bisonte){


                a.precio+=minutos*0.30f;

            }else if(a.tarifa==Tarifa.mono){
                a.precio+=minutos*0.12f;
            }else if(a.tarifa==Tarifa.rata){
                a.precio+=minutos*0.06f;
            }
            */


            if(this.tarifa==Tarifa.bisonte){


                this.precio+=minutos*0.30f;

            }else if(this.tarifa==Tarifa.mono){
                this.precio+=minutos*0.12f;
            }else if(this.tarifa==Tarifa.rata){
                this.precio+=minutos*0.06f;
            }


        


    }

    
    public String toString(){
        return super.toString()+" - tarificados "+Math.round(precio*100)/100d+" euros";
    }

}
