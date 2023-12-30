public class Zona{

    private Parte parte;

    private static int EntradaPrincipal=1000,Compra_Venta=200,Vip=25;

    public enum Parte{
        Principal,Compra_Venta,Vip;
    }


    public static void VenderEntrada(Parte a, int b){
        boolean mensajito=false;
        if(a.equals(Parte.Principal)){


            if(b>EntradaPrincipal){
                mensajito=true;

            }else EntradaPrincipal-=b;

            
        }else if(a.equals(Parte.Compra_Venta)){

            if(b>Compra_Venta){
                mensajito=true;
            }else Compra_Venta-=b;

            
        }else if(a.equals(Parte.Vip)){

            if(b>Vip){
                mensajito=true;
            }else Vip-=b;

            
        }

        if(mensajito==true){
            System.out.println("Lo siento, no tenemos tantas entradas");
            System.out.println("Solo nos quedan las siguientes entradas: ");

            if(EntradaPrincipal>0){
                System.out.println("-De Principal: "+EntradaPrincipal);
            }

            if(Compra_Venta>0){
                System.out.println("-De Compra_Venta: "+Compra_Venta);
            }

            if(Vip>0){
                System.out.println("-De Vip: "+Vip);
            }
            


        }else System.out.printf("Aqui tiene sus %d entradas, gracias%n",b);

    }



    public static void Entradaslibre(){
        System.out.printf("Entradas %s: %d%n",Parte.Principal,EntradaPrincipal);
        System.out.printf("Entradas %s: %d%n",Parte.Compra_Venta,Compra_Venta);
        System.out.printf("Entradas %s: %d%n",Parte.Vip,Vip);
    }





}