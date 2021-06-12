import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateUser {

    public static void createUser(UsersData usersData){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_conection()){
            PreparedStatement ps = null;
            try{
                String query = "insert into users (user_name, contact_firstname, contact_lastname, contact_phone, contact_email) values (?,?,?,?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, usersData.getUser_name());
                ps.setString(2, usersData.getContact_firstname());
                ps.setString(3, usersData.getContact_lastname());
                ps.setString(4, usersData.getContact_phone());
                ps.setString(5, usersData.getContact_email());
                ps.executeUpdate();
                System.out.println("The user has been created correctly");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void logIn(){
        Conexion db_connect = new Conexion() ;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection conexion = db_connect.get_conection()){
            String query = "Select * From onburger_db.users";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID: "+rs.getInt("id_user"));
                System.out.println("user_name: "+rs.getString("user_name"));
                System.out.println("First name: "+ rs.getString("contact_firstname"));
                System.out.println("Last name: "+rs.getString("contact_lastname"));
                System.out.println("Phone: "+rs.getString("contact_phone"));
                System.out.println("Email: "+rs.getString("contact_email"));
            }

        }catch(SQLException e){
            System.out.println("No pudo adquirir datos");
            System.out.println(e);
        }
    }
}
