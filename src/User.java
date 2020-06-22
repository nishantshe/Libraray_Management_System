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
class User {
    private int id;
    private String name,address,contact;
    public User(int id,String name,String address,String contact)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.contact=contact;
        
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    
     public String getaddress(){
        return address;
    }
    public String getcontact(){
        return contact;
    }
     
    
}
