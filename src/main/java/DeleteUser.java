import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUser {

    public static void deleteUser(int id_user){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_conection()){

            PreparedStatement ps = null;

            try{
                String query = "Delete from users where id_user = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_user);
                ps.executeUpdate();
                System.out.println("El Usuario fue eliminado con exito");

            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se pudo eliminar el usuario.");

            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
