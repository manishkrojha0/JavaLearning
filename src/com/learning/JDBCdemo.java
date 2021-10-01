package com.learning;
import java.sql.*;
/// Java Database Connectivity
/*
1. import the package.
2. load and register the driver-->com.mys
3. Create Connection.
4. execute the query.
6. process the results.
7. close.
 */
public class JDBCdemo {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/world";
        String uname="root";
        String pass="Manish@2000";
        String query= "select * from persons";
        Class.forName("com.mysql.cj.jdbc.Driver"); // class forname works
        Connection con= DriverManager.getConnection(url,uname,pass);
        Statement st= con.createStatement();
        ResultSet rs= st.executeQuery(query);

        while(rs.next()) {

//            int f=rs.getRow();
//            System.out.println(f);
            SQLXML f=rs.getSQLXML(1);
//            System.out.println(SQLXML);
            int id = rs.getInt(1);
            String lastName= rs.getString(2);
            String firstName=rs.getString(3);
            String city= rs.getString(5);
            System.out.println(id+" "+lastName+" "+firstName+" "+city);


        }
        st.close();
        con.close();

    }
}
