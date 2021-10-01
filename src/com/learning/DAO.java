package com.learning;
import java.sql.*;
class tabahi
{
    int roll;
    String name;
    public tabahi(int roll) {
        this.roll=roll;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Manish@2000");
            String Query = "select FullName from Student where roll=" + roll;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);
            rs.next();
            String nam = rs.getString("FullName");
            name = nam;
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
//    public void show()
//    {
//        System.out.println(roll+" "+name);
//    }
}

public class DAO {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        tabahi obj=new tabahi(10);
        System.out.println(obj.roll+" "+obj.name);
       // obj.show();


//        String url="jdbc:mysql://localhost:3306/test";
//        String uname="root";
//        String pass="Manish@2000";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        String Query= "select distinct * from student order by roll";
//        Connection con= DriverManager.getConnection(url,uname,pass);
//        Statement st= con.createStatement();
//        ResultSet rs=st.executeQuery(Query);
//        while(rs.next())
//        {
//            String val=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5);
//            System.out.println(val);
//        }
//        st.close();
//        con.close();

    }
}
