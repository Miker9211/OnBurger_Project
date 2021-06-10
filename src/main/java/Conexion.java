import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_conection(){
        Connection conection = null;

        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onburger_db","root","*Camilo90*");
            if(conection != null){
                System.out.println("Succesfull Connection");
            }
        }catch (SQLException e){
            System.out.println(e);
        }

        return conection;
    }
}
