public class Fraccion {
    
    private int numerador,denominador;

    public Fraccion(int a, int b){
        this.numerador=a;
        this.denominador=b;
    }

    public int Getnumerador(){
        return this.numerador;
    }

    public int GetDenominador(){
        return this.denominador;
    }

    

    public void invertir(){

        int cambio=this.numerador;
        this.numerador=this.denominador;
        this.denominador=cambio;
    }

    public void simplificar(){

        int grande=0;

        if(this.numerador>this.denominador){
            grande=this.numerador;
        }else grande=this.denominador;

        for(int i=grande;i>=1;i--){


            if(this.numerador%i==0 && this.denominador%i==0){
                this.denominador=this.denominador/i;
                this.numerador=this.numerador/i;
            }


        }






    }


    public Fraccion multiplica(Fraccion a){
        int numeradora=0;
        int denominadora=0;
        
            
            numeradora=this.numerador*a.numerador;
            
            denominadora=this.denominador*a.denominador;
        

        Fraccion resultado=new Fraccion(numeradora, denominadora);

        return resultado;
    }


    public Fraccion dividir(Fraccion a){
        int numeradora=0;
        int denominadora=0;
        
        
            numeradora=this.numerador*a.denominador;
            denominadora=this.denominador*a.numerador;
        

        Fraccion resultado=new Fraccion(numeradora, denominadora);

        return resultado;
    }



    public void imprimirdoble(Fraccion a, Fraccion b){

        int largo=0;




        System.out.printf(" %d   %d%n",a.numerador, b.numerador);
        System.out.println("--- ---");
        System.out.printf(" %d   %d%n",a.denominador, b.denominador);

    }

    public void mostrar(){

        int grande=0;

        if(grande<this.numerador){
            grande=this.numerador;
        }

        if(grande<this.denominador){
            grande=this.denominador;
        }

        System.out.println(this.numerador+"/"+this.denominador);
    }



}
