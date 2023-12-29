public class App {
    public static void main(String[] args) throws Exception {
       
        Pizza p1=new Pizza(Pizza.Tipo.margarita, Pizza.Tamaño.Mediana);
        Pizza p2=new Pizza(Pizza.Tipo.funghi,Pizza.Tamaño.Familiar);
        p2.sirve();
        Pizza p3=new Pizza(Pizza.Tipo.cuatroquesos, Pizza.Tamaño.Mediana);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("Pedidas: "+Pizza.GetTotalpedidas());
        System.out.println("Servidas: "+Pizza.GetTotalservidas());

        


    }
}
