public class Terminal{

    private String numero;
    private int tiempoconversacion;


    public Terminal(String a){
        this.numero=a;
    }

    public String getNumero() {
        return this.numero;
    }

    public int getTiempoconversacion() {
        return this.tiempoconversacion;
    }


    public void llama(Terminal a, int b){
        this.tiempoconversacion+=b;
        a.tiempoconversacion+=b;
    }




    public String toString(){
        return "Nº "+this.numero+" - "+this.tiempoconversacion+"s de conversación";
    }



}