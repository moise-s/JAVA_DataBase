// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class connectiontry {

//     public static void main(String[] args) {

//         // 1 - NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR! (Como demonstrado na parte 1 do curso)

//         // 2 - Definir parâmetros para se conectar ao banco de dados MySQL.
//         String driver = "mysql";
//         String dataBaseAddress = "127.0.0.1:3306";
//         String dataBaseName = "digital_innovation_one";
//         String user = "root";
//         String password = "password";

//         // 3 - Construção da string de conexão.
//         StringBuilder sb = new StringBuilder("jdbc:")
//                 .append(driver).append("://")
//                 .append(dataBaseAddress).append("/")
//                 .append(dataBaseName);

//         String connectionUrl = sb.toString(); //sb.toString() == "jdbc:mysql://localhost/digital_innovation_one"

//         //Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!!!)
//         // Class.forName("com.mysql.cj.jdbc.Driver");

//         // 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
//         try  {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection connection = DriverManager.getConnection(connectionUrl, user, password);
//             System.out.println("SUCESSO ao se conectar ao banco MySQL!");
//         } catch (SQLException e) {
//             System.out.println("FALHA ao se conectar ao banco MySQL!");
//             e.printStackTrace();
//         }

//     }
// }