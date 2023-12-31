public class Incidencia{

    private int puesto, numeroincidencia;
    private String razon="",resolucion="", estado;

    private static int numero,resueltas;
    
    public Incidencia(int puesto, String resolucion){
        this.puesto=puesto;
        this.resolucion=resolucion;
        this.estado="Pendiente";
        numero+=1;
        this.numeroincidencia=numero;
    }

    public void resuelve(String resolucion){
        this.razon+=" - ";
        this.razon+=resolucion;
        this.estado="Resuelta";
        resueltas+=1;
    }

    public static int getpendientes(){
        return numero-resueltas;
    }

    public String toString(){


        return "Incidencia "+this.numeroincidencia+" - Puesto: "+this.puesto+" - "+this.resolucion+" - "+this.estado+this.razon;
    }




}