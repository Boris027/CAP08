public class bicicleta extends Vehiculo {
    
    private int kilometros;

    public void HacerCaballito(){
        System.out.println("Haciendo caballito lets gooooo");
    }

    public void Andarbici(int a){
        kilometros+=a;
        Vehiculo.kilometrostotales+=a;
    }

    public int GetKilometros(){
        return this.kilometros;
    }




}
