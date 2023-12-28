public class Coche extends Vehiculo{
    
    private int kilometros;

    public void andarcoche(int a){
        kilometros+=a;
        Vehiculo.kilometrostotales+=a;
    }

    public int GetKilometros(){
        return this.kilometros;
    }

    public void Quemarueda(){
        System.out.println("Esto esta que arte, quemando las ruedasss");
    }


}
