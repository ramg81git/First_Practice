import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;  

public class H2jdbcReadDemo { 
   // JDBC driver name and database URL 
   static final String JDBC_DRIVER = "org.h2.Driver";   
   static final String DB_URL = "jdbc:h2:mem:rad"; 
   //static final String DB_URL = "jdbc:h2:~/rad"; 
   
   //static final String DB_URL = "jdbc:h2:mem:rad;;DB_CLOSE_DELAY=-1";
   
   //  Database credentials 
   static final String USER = "sa"; 
   static final String PASS = ""; 
   
   public static void main(String[] args) { 
      Connection conn = null; 
      Statement stmt = null; 
      try { 
         // STEP 1: Register JDBC driver 
         Class.forName(JDBC_DRIVER); 
         
         // STEP 2: Open a connection 
         System.out.println("Connecting to database..."); 
         conn = DriverManager.getConnection(DB_URL,USER,PASS);  
         
         // STEP 3: Execute a query 
         System.out.println("Connected database successfully..."); 
         stmt = conn.createStatement(); 
       String sql = "SELECT ITICKER, TPRICE, T52WH, T52WL FROM INFORMATION_SCHEMA.STOCK_TBL";
         String sql2="SELECT * FROM INFORMATION_SCHEMA.TABLES ";
        // ResultSet rs2 = stmt.executeQuery(sql2);
         ResultSet rs = stmt.executeQuery(sql2); 
   
         
         // STEP 4: Extract data from result set 
         while(rs.next()) { 
            // Retrieve by column name 
       //     String iticker  = rs.getString("iticker"); 
       //     float tprice = rs.getInt("tprice"); 
     //       float t52wh = rs.getInt("t52wh");
      //      float t52wl = rs.getInt("t52wl");
            
            
            // Display values 
            System.out.print("ITICKER: " + iticker); 
            System.out.print(", TPRICE: " + tprice); 
            System.out.print(", T52WH: " + t52wh); 
            System.out.println(", T52WL: " + t52wl); 
         } 
         // STEP 5: Clean-up environment 
         rs.close(); 
      } catch(SQLException se) { 
         // Handle errors for JDBC 
         se.printStackTrace(); 
      } catch(Exception e) { 
         // Handle errors for Class.forName 
         e.printStackTrace(); 
      } finally { 
         // finally block used to close resources 
         try { 
            if(stmt!=null) stmt.close();  
         } catch(SQLException se2) { 
         } // nothing we can do 
         try { 
            if(conn!=null) conn.close(); 
         } catch(SQLException se) { 
            se.printStackTrace(); 
         } // end finally try 
      } // end try 
      System.out.println("Goodbye!"); 
   } 
}