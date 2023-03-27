import java.util.Scanner;

public class DrivermaquinaCafe {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Maquina maquina = new Maquina();
        maquina.ingrendietes();
        boolean salir = false;
        while (!salir && maquina.vasos > 0 && (maquina.agua >= 180 && maquina.crema >= 70)) {
            System.out.println("--------------------------------");
            System.out.println("Indique que tipo de cafe quiere" );
            System.out.println("--------------------------------");
            System.out.println("Opcion 1 : Cafe Americano");
            System.out.println("Opcion 2 : Cafe Expreso");
            System.out.println("Opcion 3 : Cafe Capuchino");
            System.out.println("Salir ");
            System.out.println("---------------------------------");
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    maquina.Americano();
                    break;
                case 2:
                    maquina.expreso();
                    break;
                case 3:
                    maquina.capuchino();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Vuelva prontoooooo.... ");
                    break;
            }
            maquina.ingrendietes();
                if (!salir) {
                    maquina.ingrendietes();
                    if (maquina.vasos == 0 && (maquina.agua == 0 && maquina.crema == 0)) {
                        System.out.println("No hay ingredientes vuelva pronto... .");
                        salir = true;
                    }
                }

        }
    }
}

