package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
     public static Connection getConnection() {
         Connection connection = null;
         try {
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest", "root",
                     "asdfgqwerty123");
         }
         catch (SQLException e) {
             e.printStackTrace();
         }
         return connection;
//             (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest", "root",
//                     "asdfgqwerty123")){
//                 Connection con = connection;
//                 System.out.println("Успешное подключение");
//
//             } catch(SQLException e){
//                 throw new RuntimeException(e);
//             }
     }
}
