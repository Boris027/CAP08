public abstract class Vehiculo {
    
    public static int vehiculosCreados,kilometrostotales;


    public void sumakilometrostotal(int a){
        kilometrostotales+=a;
    }

    public Vehiculo(){
        vehiculosCreados+=1;
    }

    public static int GetVehiculostotales(){
        return vehiculosCreados;
    }

    public static int kilometrostotales(){
        return kilometrostotales;
    }

}
