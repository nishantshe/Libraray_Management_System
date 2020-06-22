import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
                String url = "jdbc:sqlserver://localhost:1433;databaseName=DB;integratedSecurity=true"; 
		try
                {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
                        con = DriverManager.getConnection(url);
		}
                catch(Exception e){System.out.println(e);}
		return con;
	}

}






  