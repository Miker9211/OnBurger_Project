import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public static void viewAllUser(){
        CreateUser.viewUsers();
    }

    public static void signIn(){

        var option = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su usuario.");
        String user_name = sc.nextLine();
        CreateUser.logIn(user_name);
            do {

                System.out.println("Bienvenido: "+ user_name);
                System.out.println("1. Editar Datos");
                System.out.println("2. Pedidos");
                System.out.println("3. Direcciones");
                System.out.println("4. Cambiar correo");

                option = sc.nextInt();

                switch (option){
                    case 1:
                        editUser();
                        break;
                    case 2:

                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }

            }while(option != 0);

        }

        public static void deleteUser(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el id del usuario que desea eliminar.");
        int id_user = sc.nextInt();
        DeleteUser.deleteUser(id_user);
        }

        public static void editUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el nuevo correo electronico.");
        String new_email = sc.nextLine();


        System.out.println("Indique el id que desea modificar.");
        int id_user = sc.nextInt();
        UsersData actualizacion = new UsersData();
        actualizacion.setId_user(id_user);
        actualizacion.setContact_email(new_email);
        UpdateData.editUser(actualizacion);

        }
    }

