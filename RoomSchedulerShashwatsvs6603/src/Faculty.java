
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Faculty
{
    private static Connection connection;
    private static ArrayList<String> faculty = new ArrayList<String>(); // Array 'faculty' contains the list of latest faculty names
    
    
    
    private static PreparedStatement addFaculty;
    private static PreparedStatement getAllFacultyList;
    private static PreparedStatement getAllFacultyListByName;
    
    private static ResultSet resultSet = null;
    
    String name = null;  //Property I (Public Key)

    
    public static void addFaculty(String name)
    {
        connection = DBConnection.getConnection();
        try
        {
            addFaculty = connection.prepareStatement("insert into faculty (name) values (?)");
            addFaculty.setString(1,name);
            addFaculty.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
    }
    
    
    public static ArrayList<String> getAllFacultyList()
    {
        connection = DBConnection.getConnection();
        ArrayList<String> faculty = new ArrayList<String>();
        
        try
        {
            getAllFacultyList = connection.prepareStatement("select name from faculty order by name");
            resultSet = getAllFacultyList.executeQuery();
            
            while(resultSet.next())
            {
                faculty.add(resultSet.getString(1));
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return faculty;
        
    }

    
    public static ArrayList<String> getAllFacultyListByName(String name)
    {
        connection = DBConnection.getConnection();
        ArrayList<String> faculty = new ArrayList<String>();
        
        try
        {
            getAllFacultyListByName = connection.prepareStatement("select name from faculty where name = ?");
            getAllFacultyListByName.setString(1,name);
            
            resultSet = getAllFacultyListByName.executeQuery();
            
            while(resultSet.next())
            {
                faculty.add(resultSet.getString("Name"));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        
        return faculty;
        
    }
    
    
}
