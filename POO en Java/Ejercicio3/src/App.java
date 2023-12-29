

public class App {
    public static void main(String[] args) throws Exception {
        

        Canario paquillo=new Canario("Paquillo");
        Canario Manuela=new Canario("Manuela");
        System.out.println(paquillo.GetNombre());
        Manuela.sonido();
        paquillo.bailoteo();
        paquillo.pelearcon(Manuela);

        Pinguino pingu= new Pinguino("Pingu",Ave.vuelaono.Novuela);
        Pinguino pinga= new Pinguino("Pinga",Ave.vuelaono.Novuela);
        System.out.println(pingu.GetNombre());
        System.out.println(pingu.vuela());
        pingu.sonido();
        pingu.pelearcon(pinga);
        pingu.pelearcon(paquillo);
        

        Gato gardfield=new Gato("gardfield");
        Gato miau=new Gato("miau", Gato.Color.Rosa);
        gardfield.sonido();
        System.out.println(gardfield.GetNombre());
        System.out.println(gardfield.GetColor());
        gardfield.pelearcon(miau);
        gardfield.pelearcon(pingu);
        gardfield.pelearcon(paquillo);


        Perro laika=new Perro("laika");
        laika.ladra();
        laika.sonido();
        Perro nala=new Perro("nala");
        laika.pelearcon(nala);
        laika.pelearcon(pingu);



        Lagarto repti=new Lagarto("repti");
        Lagarto lagar=new Lagarto("lagar", Reptil.Radiactivo.Si);
        lagar.cuello();
        lagar.sonido();
        lagar.pelearcon(repti);
        lagar.pelearcon(pingu);


        System.out.println();
        lagar.diferencia(pinga);
        pingu.diferencia(gardfield);
        pingu.diferencia(pinga);
        laika.diferencia(lagar);
        laika.diferencia(nala);
        repti.diferencia(lagar);
        
        System.out.println(laika.numeroAnimal());
        System.out.println(Animal.animalestotales());
    }
}
