// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class Main {
//   public static void main(String args[]) {

//     String driver = "mysql";
//     String dataBaseAddress = "127.0.0.1:3306";
//     String dataBaseName = "digital_innovation_one";
//     String user = "root";
//     String password = "password";

//     StringBuilder sb = new StringBuilder("jdbc:")
//         .append(driver).append("://")
//         .append(dataBaseAddress).append("/")
//         .append(dataBaseName);

//     String url = sb.toString();

//     try {
//       Class.forName("com.mysql.cj.jdbc.Driver");
//       Connection connection = DriverManager.getConnection(url, user, password);
//       System.out.println("Connection is Successful to the database" + url);
//       System.out.println("Yesss");

//     } catch (ClassNotFoundException e) {
//       e.printStackTrace();
//     } catch (SQLException throwables) {
//       throwables.printStackTrace();
//     }
//   }
// }
