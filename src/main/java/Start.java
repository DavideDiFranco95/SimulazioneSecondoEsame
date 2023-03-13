

import java.io.IOException;
import java.nio.file.Path;
import java.sql.*;


public class Start {

    public static void main(String[] args)throws NullPointerException, IOException {
        String fileIn = String.valueOf(Path.of("src/main/java/fileIn.txt"));
        String fileOut = String.valueOf(Path.of("src/main/java/fileOut.txt"));
        System.out.println("-------------------------------------------");
        Words_two wordsTwo = new Words_two();
        wordsTwo.inizialiParole(fileIn,fileOut);

        /*Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Irisviel95!");

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        Statement statement=null;
        ResultSet resultSet=null;
        try{
            statement = connection.createStatement();
            //resultSet = statement.executeQuery("SELECT nome,cognome FROM STUDENTE WHERE data_nascita < 1998-01-01");
            resultSet = statement.executeQuery("SELECT nome,cognome FROM PROFESSORE WHERE anni_esperienza>10");

            while (resultSet.next()){
                System.out.println(resultSet.getString("nome")+ " ");
                System.out.println(resultSet.getString("cognome"));
            }
        }catch (SQLException e){
            System.out.println("SQLException: "+ e.getMessage());
            System.out.println("SQLException: "+ e.getSQLState());
            System.out.println("SQLException: "+ e.getErrorCode());

        }

         */
    }
}
