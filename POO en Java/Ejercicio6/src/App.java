public class App {

    public static void main(String[] args) throws Exception {
        
        Tiempo t=new Tiempo(10, 9, 1);


        System.out.println(t);
        t.suma(0, 30, 40);
        System.out.println(t);

        
        t.suma(5, 30, 0);
        System.out.println(t);

        


        float numero=5.2f;
        String hola=String.format("%s%.2f%s","(",numero,")" );
        System.out.println(hola);
    }

    
}
