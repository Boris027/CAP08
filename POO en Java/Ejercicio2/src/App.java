import java.util.Scanner;
public class App {



    public static void menu(){

        System.out.println("Vehiculos");
        System.out.println("-------------");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Ver vehiculos totales creados");
        System.out.println("9. Salir");
        System.out.print("Elección: ");

        
    }

    public static int andar(Scanner sc){

        System.out.print("¿Cuantos km has recorrido?");

        return sc.nextInt();


    }






    public static void main(String[] args) throws Exception {
        
        boolean salir=false;
        Scanner sc=new Scanner(System.in);

        bicicleta bici=new bicicleta();
        Coche coche=new Coche();
        int resultado=0;

        while(salir!=true){

            menu();
            int respuesta=sc.nextInt();

            switch (respuesta) {
                case 1:

                    resultado=andar(sc);

                    bici.Andarbici(resultado);

                    break;
            
                case 2:
                    bici.HacerCaballito();
                    break;

                case 3:
                    resultado=andar(sc);
                    coche.andarcoche(resultado);
                    
                    break;


                case 4:
                    coche.Quemarueda();
                    break;

                case 5: 
                    System.out.println(bici.GetKilometros());

                    break;

                case 6:
                    System.out.println(coche.GetKilometros());
                    break;

                case 7:
                    System.out.println(Vehiculo.kilometrostotales());
                    break;

                case 8:
                    System.out.println(Vehiculo.GetVehiculostotales());
                    break;
                case 9:

                    salir=true;
                    break;
                default:
                    break;
            }




        }




    }
}
