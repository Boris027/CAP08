public class App {

    public static void main(String[] args) throws Exception {
        

        Fraccion fracci=new Fraccion(11, 2);
        fracci.mostrar();

        System.out.println();
        Fraccion fracci2=new Fraccion(99, 2);
        fracci2.mostrar();
        
        System.out.println();
        Fraccion resultado=new Fraccion(0, 0);
        resultado=fracci.dividir(fracci2);
        resultado.mostrar();
        

        
        
    }
}
