
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;


public class Dates
{
    private static Connection connection;
    private static final ArrayList<Date> dates = new ArrayList<Date>(); // Array 'dates' contains the list of all dates
    private static PreparedStatement addDate;
    private static PreparedStatement getAllDates;
    private static ResultSet resultSet;
    
    static String sql = "insert into dates (date) values (?)";
   
    java.sql.Date availableDates;  //Property I (Primary Key)
   
    
    public static void addDate(Date availableDates)
    {
        connection = DBConnection.getConnection();
        try
        {
            addDate = connection.prepareStatement(sql);
            addDate.setDate(1, availableDates);
            addDate.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
    }
    

    public static ArrayList<Date> getAllDates()     //To load the comboBox
    {
        connection = DBConnection.getConnection();
        ArrayList<Date> dates = new ArrayList<Date>();
        
        try
        {
            getAllDates = connection.prepareStatement("select date from dates order by date");
            resultSet = getAllDates.executeQuery();
            
            while(resultSet.next())
            {
                dates.add(resultSet.getDate(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return dates;
        
    }
    
    
}
