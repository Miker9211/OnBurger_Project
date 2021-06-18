import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do{
            System.out.println("Seleccione una opcion");
            System.out.println("1. Registrese.");
            System.out.println("2. Iniciar Sesion");
            System.out.println("0. Salir");

            option = sc.nextInt();

            switch (option){
                case 1:
                    UserService.signUp();
                    break;
                case 2:
                    UserService.signIn();
                    break;
                default:
                    break;
            }

        }while(option != 0);
    }
}
