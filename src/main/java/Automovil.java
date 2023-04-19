public class Automovil { //clase de ejemplo de la clase
    String color;
    String marca;
    int velocidad;
    String orientacion;
    String año;

    public Automovil(String color, String marca, int velocidad, String orientacion, String año) {
        this.color = color;
        this.marca = marca;
        this.velocidad = velocidad;
        this.orientacion = orientacion;
        this.año = año;
    }
    public Automovil() {
        this.color = "";
        this.marca = "";
        this.velocidad = 0;
        this.orientacion = "";
        this.año = "";
    }

    public String getColor() {
        return color;
    }
    public void pintar(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void aumentarVelocidad (int mas) {
        this.velocidad = velocidad + mas;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                ", orientacion='" + orientacion + '\'' +
                ", año='" + año + '\'' +
                '}';
    }
}

