public class Tiempo{

    private int Dia,Hora,minuto,Segundo;


    public Tiempo(int a,int b, int c){
        this.Hora=a;
        this.minuto=b;
        this.Segundo=c;
    }



    public void suma(int a, int b, int c){
        

        Segundo+=c;

        while(Segundo>=60){
            minuto+=1;
            Segundo-=60;
        }

        minuto+=b;

        while (minuto>=60) {
            Hora+=1;
            minuto-=60;
        }

        Hora+=a;

        while(Hora>=24){
            Dia+=1;
            Hora-=24;
        }



    }


    public String toString(){



        return this.Hora+"h "+this.minuto+"m "+this.Segundo+"s";
    }


}