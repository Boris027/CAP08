public class Lagarto extends Reptil {
    

    public Lagarto(String a, Radiactivo b){
        super(a,b);
    }

    public Lagarto(String a){
        super(a);
    }



    public void pelearcon(Animal a){

        if(!this.getClass().getName().equals(a.getClass().getName())){
            
            if(this.GetRadiactivo().equals(Radiactivo.Si)){
                System.out.println(this.GetNombre() +" ha matado a "+a.GetNombre()+" a manos de su radioactividad");
            }else System.out.println("Menudo golpe te pegaba chaval");


        }else System.out.println("Holaaa, somos iguales frog frog");

    }

    public void sonido(){
        System.out.println("Me gusta mucho hacer sonido froggg");
    }

    public void cuello(){
        System.out.println("Tengo un cuello corto");
    }

}
