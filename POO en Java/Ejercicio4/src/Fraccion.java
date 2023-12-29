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

        boolean simpli=false;
        int contador=6;

        for(int i=5;i>=2;i--){
            contador=contador-1;
            

            if(this.numerador%i==0 && this.denominador%i==0){
                simpli=true;
                break;
            }
            
        }

        

        boolean salir=false;
        if(simpli==true){

            do {
                
                this.denominador=this.denominador/contador;
                this.numerador=this.numerador/contador;

                break;

            } while (salir==false);

        }    

    }



    public void simplificarmax(){
        for(int i=0;i<=99;i++){
            simplificar();
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

        System.out.println(" "+this.Getnumerador());
        
        System.out.print("-");
        for(int i=1;i<=Integer.toString(grande).length();i++){
            System.out.print("-");
        }
        System.out.println("-");
        System.out.println(" "+this.GetDenominador());
    }



}
