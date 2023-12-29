public class Pizza {
    
    private static int pedida,servida;

    private Tamaño tamaño;
    private Estado estado;
    private Tipo tipo;

    public enum Tamaño{
        Pequeña,Mediana,Familiar;
    }

    public enum Estado{
        Pedida,Servida;
    }

    public enum Tipo{
        margarita,cuatroquesos,funghi;
    }

    public Pizza(Tipo a, Tamaño b){
        this.tipo=a;
        this.tamaño=b;
        pedida+=1;
        this.estado=Estado.Pedida;
    }

    public Pizza(Tipo a){
        this.tipo=a;
        this.tamaño=Tamaño.Mediana;
        pedida+=1;
        this.estado=Estado.Pedida;
    }

    public static int GetTotalpedidas(){
        return pedida;
    }

    public static int GetTotalservidas(){
        return servida;
    }

    

    public void sirve(){

        if(this.estado==Estado.Servida){
            System.out.println("Esta pizza ya se ha servido");
        }else{
            System.out.println("Sirviendo la pizza");
            this.estado=Estado.Servida;
            
            servida+=1;
        }

    }


    public String toString(){



        return "pizza "+this.tipo+" "+this.tamaño+" ,"+this.estado;
    }


}
