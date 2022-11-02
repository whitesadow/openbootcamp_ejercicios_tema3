import java.awt.*;

public class Coche {
    String marca;
    String modelo;
    String color;
    int diaCompra;
    int mesCompra;
    int anyocompra;
    String marcaNeumaticos;

    public int numeroDePuertas = 5;

    public void sumarPuertas(){

        this.numeroDePuertas++;
    }

    public Coche(){
        marca = "Ferrarri";
        modelo = "SF90 Stralade";
        int anyocompra = 2021;
        int diaCompra = 17;
        int mesCompra = 6;
    }

    public Coche(String marca, String modelo, String color, int diaCompra, int mesCompra, int anyopCompra){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.diaCompra = diaCompra;
        this.mesCompra = mesCompra;
        this.anyocompra = anyopCompra;
        this.marcaNeumaticos = "michelin";
    }
}
