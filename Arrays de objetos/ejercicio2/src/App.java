public class App {
    public static void main(String[] args) throws Exception {
        
        Gato[] lista=new Gato[4];

        for(int i=0;i<=lista.length-1;i++){

            System.out.print("¿Como se llama el gato?: ");
            String nombre=System.console().readLine();
            System.out.print("¿De que color es?: ");
            String color=System.console().readLine();
            System.out.println("¿Que Sexo es?: ");
            System.out.println("1. Macho");
            System.out.println("2. Hembra");
            System.out.print("Eleccion: ");
            int eleccion=Integer.parseInt(System.console().readLine());

            switch (eleccion) { 
                case 1:
                 lista[i]=new Gato(Animal.Sexo.MACHO,nombre, color);
                 break;
                case 2:
                 lista[i]=new Gato(Animal.Sexo.HEMBRA,nombre, color);
                 break;
               
                 
                default:
                 // Default secuencia de sentencias.
              }
            

        }


        for(int i=0;i<=lista.length-1;i++){
            System.out.println(lista[i]);
        }


    }
}
