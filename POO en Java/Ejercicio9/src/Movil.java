import java.text.DecimalFormat;

public class Movil extends Terminal {
    
    private Tarifa tarifa;
    private float tarifado;
    private float precio;

    public enum Tarifa{
        rata,mono,bisonte;
    }

    public Movil(String a, Tarifa b){
        super(a);
        this.tarifa=b;
    }

    public void llama(Movil a, int b){
        super.llama(a, b);
        this.tarifado+=b;
    }

    public float GetDinero(){
        float dinero=0;
        if(this.tarifa==Tarifa.bisonte){
            dinero=(this.tarifado/60)*0.30f;
        }else if(this.tarifa==Tarifa.mono){
            dinero=(this.tarifado/60)*0.12f;
        }else if(this.tarifa==Tarifa.rata){
            dinero=(this.tarifado/60)*0.06f;
        }
        
        
        return dinero;
    }

    
    public String toString(){
        String si=String.format("%.2f",this.GetDinero());
        
        return super.toString()+" - tarificados "+si+" euros";
    }

}
