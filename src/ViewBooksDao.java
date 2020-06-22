/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
import java.sql.*;
import java.util.Arrays;

public class ViewBooksDao {
    public static boolean checkBook(String bookcallno){
	boolean status=false;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from bookss where callno=?");
		ps.setString(1,bookcallno);
	        ResultSet rs=ps.executeQuery();
		status=rs.next();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static Object[] retrieve(String bookcallno){
//	int status=0;
	int quantity=0,issued=0;
        String name = null,author = null,publisher = null;
	try{
		Connection con=DB.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from bookss where callno=?");
		ps.setString(1,bookcallno);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
                          name=rs.getString("name");
                          author=rs.getString("author");
                          publisher=rs.getString("publisher");
			quantity=rs.getInt("quantity");
			issued=rs.getInt("issued");
		}
//               System.out.println(publisher +  name + author);
                 
//		if(quantity>0){
//		PreparedStatement ps2=con.prepareStatement("update bookss set quantity=?,issued=? where callno=?");
//		ps2.setInt(1,quantity-1);
//		ps2.setInt(2,issued+1);
//		ps2.setString(3,bookcallno);
//		
//		status=ps2.executeUpdate();
//		}
//		con.close();
	}catch(Exception e){System.out.println(e);}
//	return status;
        return new Object[] {name, author, publisher, quantity, issued};
}
}


    

