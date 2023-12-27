public class Piloto  {

    private String nombre,apellidos,nacionalidad,escuderia;
    private int carrerasganadas,carreras;
    private static int carrerastotales;

    public void Setnombre(String c){
        this.nombre=c;
    }

    public String Getnombre(){
        return this.nombre;
    }

    public void Setapellidos(String c){
        this.apellidos=c;
    }

    public String Getapellidos(){
        return this.apellidos;
    }

    public void Setnacionalidad(String c){
        this.nacionalidad=c;
    }

    public String Getnacionalidad(){
        return this.nacionalidad;
    }

    public void Setescuderia(String c){
        this.escuderia=c;
    }

    public String Getescuderia(){
        return this.escuderia;
    }


    public void Ganacarreras(int c){
        this.carrerasganadas+=c;
    }

    public int GetCarrerasGanadas(){
        return this.carrerasganadas;
    }

    public void hacecarreras(int c){
        this.carreras+=c;
        carrerastotales+=c;
    }

    public int Getcarreras(){
        return this.carreras;
    }

    public static int Getcarrerastotales(){
        return carrerastotales;
    }


    public String toString(){
        String devolver="";

        devolver+="Hola, me llamo: "+this.Getnombre()+" "+this.Getapellidos()+" mi nacionalidad es: "+this.Getnacionalidad()+" "+"pertenezco a la escuderia: "+this.Getescuderia()+" he hecho: "+this.Getcarreras()+" carreras y he ganado: "+this.GetCarrerasGanadas();

        return devolver;
    }



}
