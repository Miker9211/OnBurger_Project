import java.util.Scanner;

public class UserService {

    public static void signUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario");
        String user_name = sc.nextLine();

        System.out.println("Nombre(s)");
        String contact_firstname = sc.nextLine();

        System.out.println("Apellido(s)");
        String contact_lastname = sc.nextLine();

        System.out.println("Número de Telefono");
        String contact_phone = sc.nextLine();

        System.out.println("Correo Electronico");
        String contact_email = sc.nextLine();

        UsersData row = new UsersData();
        row.setUser_name(user_name);
        row.setContact_firstname(contact_firstname);
        row.setContact_lastname(contact_lastname);
        row.setContact_phone(contact_phone);
        row.setContact_email(contact_email);
        CreateUser.createUser(row);
    }

    public static void signIn(){
        CreateUser.logIn();
    }
}
