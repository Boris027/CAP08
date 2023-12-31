public class App {

    public static Disco[] creardisco(int cantidad){

        return new Disco[cantidad];
    }

    public static Disco[] inicializar(Disco[] lista){

        for(int i=0;i<=lista.length-1;i++){
            lista[i]=new Disco();
        }

        return lista;
    }


    public static void main(String[] args) throws Exception {
        
        System.out.print("Cuantos discos vas a crear");
        int cuenta=Integer.parseInt(System.console().readLine());

        Disco[] lista=creardisco(cuenta);
        lista=inicializar(lista);



    }
}
