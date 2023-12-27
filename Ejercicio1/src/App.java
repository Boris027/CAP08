import java.util.Scanner;
public class App {

    public static void menu(){
        System.out.println("1. Ver a los Pilotos");
        System.out.println("2. Ha hecho una carrera");
        System.out.println("3. Ver totales");
        System.out.println("4. Salir");
    }


    public static Piloto[] CrearArray(int totalpilotos){

        Piloto[] piloto=new Piloto[totalpilotos];

        for(int i=0;i<=totalpilotos-1;i++){
            piloto[i]=new Piloto();
        }

        return piloto;
    }


    public static Piloto[] inicializar(Piloto[] piloto, Scanner sc){


        for(int i=0;i<=piloto.length-1;i++){
            System.out.printf("Piloto %d%n",i+1);
            String espacio=sc.nextLine();
            System.out.print("Introduce el nombre: ");

            piloto[i].Setnombre(sc.nextLine());


            System.out.print("Introduce los apellidos: ");
            piloto[i].Setapellidos(sc.nextLine());

            System.out.print("Introduce la nacionalidad: ");
            piloto[i].Setnacionalidad(sc.nextLine());

            System.out.print("Introduce la escuderia: ");
            piloto[i].Setescuderia(sc.nextLine());

            System.out.print("Introduce las carreras realizadas: ");
            piloto[i].hacecarreras(sc.nextInt());

            System.out.print("Introduce las carreras ganadas: ");
            piloto[i].Ganacarreras(sc.nextInt());
        }



        return piloto;
    }

    public static int pilotoscrear(Scanner sc){
        System.out.print("¿Cuantos pilotos quiers crear?: ");
        int totalpilotos=sc.nextInt();


        return totalpilotos;
    }


    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        boolean salir=false;

        int totalpilotos=pilotoscrear(sc);
        Piloto array[]=CrearArray(totalpilotos);
        array=inicializar(array,sc);





        while(salir!=true){

            menu();
            int eleccion=sc.nextInt();

            switch (eleccion) {
                case 1:
                    
                    for(int i=0;i<=array.length-1;i++){
                        System.out.println(array[i]);
                    }

                    break;
            
                case 2:
                    
                    System.out.println("¿Quien ha hecho la carrera?");

                    for(int i=0;i<=array.length-1;i++){
                        System.out.printf("%d. %s %s%n",i+1,array[i].Getnombre(),array[i].Getapellidos());
                    }

                    int eleccion2=sc.nextInt();

                    System.out.print("¿Cuantas carreras mas ha hecho?: ");

                    int carrerasmas=sc.nextInt();

                    array[eleccion2-1].hacecarreras(carrerasmas);

                    System.out.print("¿Cuantas ha ganado?: ");

                    carrerasmas=sc.nextInt();

                    array[eleccion2-1].Ganacarreras(carrerasmas);
                    
                    break; 

                case 3:
                    System.out.printf("En total se han hecho %d carreras%n",Piloto.Getcarrerastotales());
                    break; 

                case 4:
                    salir=true;

                    break; 

                default:
                    break;
            }



        }


        sc.close();
    }
}
