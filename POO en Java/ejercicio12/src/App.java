public class App {
    public static void main(String[] args) throws Exception {
        
        Libro libro1=new Libro("123456", "La Ruta Prohibida", 2007);
        Libro libro2=new Libro("112233", "Los otros", 2016);
        Libro libro3=new Libro("456789", "La rosa del mundo", 1995);
        Revista revista1=new Revista("444555", "Año Cero", 2019, 344);
        Revista revista2=new Revista("002244", "National Geographic", 2003, 255);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        libro2.presta();
        libro2.estaprestado();
        libro2.presta();
        libro2.devuelve();
        libro2.estaprestado();
        libro3.presta();
        System.out.println(libro2);
        System.out.println(libro3);

    }
}
