import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Milos", 30,"quieta");
        Persona persona3 = new Persona();
        System.out.println(persona1);
        persona3 = operacionesPersona(persona1);
        System.out.println(persona3);

    }
    public static Persona operacionesPersona (Persona persona1) {
        System.out.println("edad de "+persona1.getNombre()+", "+persona1.getApellido()+" es: "+persona1.getEdad());
        persona1.crecer1añoEdad();
        System.out.println("ahora su edad es: "+persona1.getEdad());
        System.out.println("la persona esta: "+persona1.getEstado());
        persona1.cambiarEstado("bailando");
        System.out.println("la persona esta: "+persona1.getEstado());
        return persona1;
    }
    public static void operacionesAuto () {
        Automovil auto = new Automovil("azul", "ferrari", 30, "derecha", "2012");
        estadoDelAuto(auto);
        System.out.println("la velocidad del  auto: "+auto.getVelocidad());
        auto.aumentarVelocidad(25);
        System.out.println("la nueva velocidad del  auto: "+auto.getVelocidad());
        System.out.println("color del auto es: "+ auto.getColor());
        auto.pintar("blanco");
        System.out.println("ahora el nuevo color es: "+ auto.getColor());
        System.out.println(auto.toString());
        Automovil auto1 = crearAuto();
    } // ejemplos de operaciones con la clase-objeto
    public static void estadoDelAuto (Automovil automovil){
        System.out.println(automovil.toString());
    }
    public static Automovil crearAuto () {
        Scanner sc = new Scanner(System.in);
        Automovil auto = new Automovil();
        auto = new Automovil(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine(), sc.nextLine());
        return auto;
    }
}

