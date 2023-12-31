public class Ameba {

    private int peso;

    public Ameba(){
        peso=3;
    }


    public void come(int a){
        this.peso+=a;
        this.peso+=-1;
    }


    public void come(Ameba a){

        this.peso+=a.peso;
        this.peso+=-1;

        a.peso=0;

    }




    public String toString(){
        return "Soy una "+this.getClass().getName()+" y peso "+this.peso+" microgramos";
    }


}
