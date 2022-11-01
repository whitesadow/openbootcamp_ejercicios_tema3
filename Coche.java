import java.awt.*;

public class Coche {
    String marca;
    String modelo;
    String color;
    int diaCompra;
    int mesCompra;
    int anyocompra;
    String marcaNeumaticos;

    public Coche(){
        marca = "";
        modelo = "";
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
