package Banco_de_Dados;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class conexao {
    public static Connection conectaMySql() {
        Connection conn = null;
        try {
           // Class.forName("com.mysql.jdbc.Driver");

            Properties props =  new Properties();
            props.load(new FileInputStream("db.properties"));
            String url = props.getProperty("url");











            conn = DriverManager.getConnection(
                  //props.getProperty("url")
                    url,
                    props);

                    //conn.setAutoCommit(false); --tira auto-commit

      //   } catch (ClassNotFoundException e) {
      //     e.printStackTrace(); 
      
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
         catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
