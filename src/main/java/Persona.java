public class Persona {
    String nombre;
    String apellido;
    int edad;
    String estado;

    public Persona(String nombre, String apellido, int edad, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = estado;
    }
    public Persona () {
    }


    public int getEdad() {
        return edad;
    }

    public void crecer1añoEdad() {
        this.edad = edad +1;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", estado='" + estado + '\'' +
                '}';
    }
}

