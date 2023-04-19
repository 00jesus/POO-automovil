import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

