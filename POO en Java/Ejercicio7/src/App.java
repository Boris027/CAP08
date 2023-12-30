import java.util.Scanner;
public class App {

    public static void menu(){
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
    }

    public static void menu2(){
        System.out.println("1. Zona principal");
        System.out.println("2. Zona compraventa");
        System.out.println("3. Zona vip");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        boolean salir=false;

        while (salir!=true) {
            menu();
            System.out.print("Eleccion: ");
            int respuesta=sc.nextInt();
            switch (respuesta) {
                case 1:
                    Zona.Entradaslibre();
                    break;
                case 2:
                    menu2();
                    System.out.print("Eleccion: ");
                    respuesta=sc.nextInt();

                    System.out.println("¿Cuantas entradas quieres?");
                    System.out.print("Eleccion: ");
                    int numeroentradas=sc.nextInt();

                    switch (respuesta) {
                        case 1:
                            Zona.VenderEntrada(Zona.Parte.Principal, numeroentradas);
                            break;
                        case 2:
                            Zona.VenderEntrada(Zona.Parte.Compra_Venta, numeroentradas);
                            break;
                        case 3:
                            Zona.VenderEntrada(Zona.Parte.Vip, numeroentradas);
                            break;
                        default:
                            break;
                    }

                    break;

                    case 3:
                        salir=true;
                    break;

                default:
                    break;
            }



        }


        sc.close();
        
    }
}
