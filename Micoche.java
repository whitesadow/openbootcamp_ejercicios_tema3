public class Micoche {
    public static void main(String[] args){

        String marca = "Ferrari", modelo = "SF90 Stralade";
        Coche Micoche = new Coche();

        suma(70, 60, 90);
        Micoche.sumarPuertas();
        Micoche.sumarPuertas();
        Micoche.sumarPuertas();
        System.out.println("El numero de puertas es:" + Micoche.numeroDePuertas);
    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
