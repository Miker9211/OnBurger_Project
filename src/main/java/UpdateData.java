import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void editUser(UsersData id_user){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_conection()){
            PreparedStatement ps = null;

            try{
                String query = "UPDATE users SET contact_email = ? WHERE id_user = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, id_user.getContact_email());
                ps.setInt(2, id_user.getId_user());
                ps.executeUpdate();
                System.out.println("la información se actualizo correctamente.");


            }catch (SQLException ex){
                System.out.println(ex);
                System.out.println("No se pudo modificar la información ");
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
