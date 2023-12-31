import java.text.DecimalFormat;

public class CuentaCorriente{

    private float saldo;
    private long codigo;


    public long numeroaleatorio(){


        long numero=0;


        for(int i=0;i<=9;i++){
            int random=(int) (Math.random()*10);
            
            if(i==0){
                numero=random;
            }else{
                numero=numero*10+random;
            }
        }
        
        return numero;
    }


    public CuentaCorriente(){
        this.saldo=0;
        this.codigo=numeroaleatorio();
    }

    public CuentaCorriente(float dinero){
        this.saldo=dinero;
        this.codigo=numeroaleatorio();
    }


    public void ingreso(float dinero){
        this.saldo+=dinero;
    }

    public void cargo(float dinero){
        this.saldo-=dinero;
    }

    public void transferencia(CuentaCorriente a, float dinero){
        this.saldo-=dinero;
        a.saldo+=dinero;
    }



    public String toString(){

        DecimalFormat formatosaldo=new DecimalFormat("#0.00");
        String saldoFormateado=formatosaldo.format(this.saldo);
        return "Número de cta: "+this.codigo+" Saldo: "+saldoFormateado+" $";
    }

}