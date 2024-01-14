public class App {

    public static void main(String[] args) throws Exception {
        

        Fraccion fracci=new Fraccion(10, 2);
        fracci.mostrar();
        
        fracci.simplificar();
        fracci.mostrar();

        System.out.println();
        Fraccion fracci2=new Fraccion(2450, 350);
        fracci2.mostrar();
        fracci2.simplificar();
        fracci2.mostrar();
        
        System.out.println();
        Fraccion resultado=new Fraccion(0, 0);
        resultado=fracci.dividir(fracci2);
        resultado.mostrar();
        

        
        
    }
}
