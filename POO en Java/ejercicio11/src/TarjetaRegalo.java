import java.util.Locale;

public class TarjetaRegalo {
    

    private float valortarjeta;
    private String codigosecreto;


    public TarjetaRegalo(float valor){
        this.valortarjeta=valor;
        this.codigosecreto=asignarnumerosecreto();
    }



    public String asignarnumerosecreto(){

        String numero="";
        for(int i=0;i<=4;i++){


            int random=(int) (Math.random()*10);
            numero+=random;


        }

        return numero;
    }

    public void gasta(float dinero){

        if(this.valortarjeta<dinero){
            String saldoFormateado = String.format(Locale.US, "%.2f", dinero);
            System.out.println("No tiene tanto saldo para gastar "+saldoFormateado);
        }else this.valortarjeta+=-dinero;


    }


    public static TarjetaRegalo fusionar(TarjetaRegalo a, TarjetaRegalo b){

        

        float saldo=0;
        saldo+=a.valortarjeta+b.valortarjeta;
        a.valortarjeta=0;
        b.valortarjeta=0;

        return new TarjetaRegalo(saldo);
    }



    public String toString(){

        String saldoFormateado = String.format(Locale.US, "%.2f", this.valortarjeta);
        return "Tarjeta nº "+this.codigosecreto+" - Saldo "+saldoFormateado+"$";
    }

    


}
