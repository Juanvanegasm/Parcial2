import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Robot robot = new Robot();

        Hombre hombre1 = new Hombre("Juan");
        System.out.println( hombre1.getNombre() + " va a jugar con el robot:");
        jugarconrobot(teclado, robot);



        Hombre hombre2 = new Hombre("Pedroo");
        System.out.println( hombre2.getNombre() + " va a jugar con el robot:");

        if (robot.estaDormido()) {
            robot.despertar();
        }
        jugarconrobot(teclado, robot);

    }

    public static void jugarconrobot(Scanner scanner, Robot robot) {
        int opcion;

        do {

            System.out.println("""
                    Menu del robot
                    1. Avanzar
                    2. Retroceder
                    3. Ver cantidad de energia
                    4. Dormir al robot
                    5. Despertar al robot
                    6. recargar bateria
                    """);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("ingrese la cantidad de pasos que quiere avanzar: ");

                    int pasosAvanzar = scanner.nextInt();
                    robot.avanzar(pasosAvanzar);


                }



                case 2 -> {
                    System.out.print("ingrese la cantidad de pasos que quiere retroceder: ");

                    int pasosRetroceder = scanner.nextInt();

                    robot.retroceder(pasosRetroceder);

                }

                case 3 -> {
                    System.out.println("Tiene: " + robot.energiaActual() + " de bateria");
                }

                case 4 -> {
                    robot.dormir();
                }

                case 5 ->{
                    robot.despertar();
                }


                case 6->{
                    robot.recargar();
                }

            }

        } while (!robot.estaDormido());
    }





}
