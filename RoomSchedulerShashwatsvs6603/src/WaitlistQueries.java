
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;


public class WaitlistQueries  //getWaitlistByDate   //getWaitlistByFaculty   //addWaitlistEntry    //cancelWaitlistEntry     //deleteWaitlistEntry  //getAllWaitlists
{
    
    private static Connection connection;
    private static ResultSet resultSet = null;
    
    
    
    private static PreparedStatement getAllStatement;
    private static PreparedStatement deleteEntryStatement;
    private static PreparedStatement getAllByDateAndSeatsStatement;
    private static PreparedStatement addWaitlistStatement;
    private static PreparedStatement getWaitlistByDateStatement;
    private static PreparedStatement getWaitlistByFacultyStatement;
    private static PreparedStatement cancelEntryStatement;
    private static PreparedStatement getEntriesByFacultyAndDate;
    private static PreparedStatement getAllWaitlistsBySeatsStatement;
    private static PreparedStatement addNewWaitlistStatement;    
    
    
    private static ArrayList<WaitlistEntry> waitlistInfo = new ArrayList<WaitlistEntry>();
    private static ArrayList<WaitlistEntry> waitlistInfoByDateAndSeats = new ArrayList<WaitlistEntry>();
    private static ArrayList<WaitlistEntry> waitlistInfoByFacultyAndDates = new ArrayList<WaitlistEntry>();
    private static ArrayList<WaitlistEntry> waitlistInfoBySeats  = new ArrayList<WaitlistEntry>();
    private static ArrayList<WaitlistEntry> waitlistInfoByFaculty  = new ArrayList<WaitlistEntry>();
    private static ArrayList<WaitlistEntry> newWaitlistByTimestamp  = new ArrayList<WaitlistEntry>();
    
    
    
    static String sql = "select * from waitlist";
    static String sql1 = "insert into waitlist (faculty,date,seats,timestamp) values (?,?,?,?) ";
    static String sql2 = "select * from waitlist where date = ? and seats <= ? order by timestamp";
    static String sql3 = "delete from waitlist where (faculty = ? and date = ? and timestamp = ?)";
    static String sql4 = "select * from waitlist where faculty = ? and date = ?";
    static String sql5 = "select * from waitlist where seats <= ? order by timestamp";
    static String sql6 = "select * from waitlist where faculty = ? ";
    static String sql7 = "select * from waitlist order by timestamp ";
  
    
    
    
    
    
    
    
    
    
    public static ArrayList<WaitlistEntry> getAllWaitlists()
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getAllStatement = connection.prepareStatement(sql);
            resultSet = getAllStatement.executeQuery();
            
            while(resultSet.next())
            {     
                
                WaitlistEntry entry = new WaitlistEntry(resultSet.getString("Faculty"),resultSet.getDate("Date"),
                        resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));
                
                waitlistInfo.add(entry);
                
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return waitlistInfo;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static ArrayList<WaitlistEntry> getAllWaitlistsByDateAndSeats(Date date, int seats)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getAllByDateAndSeatsStatement = connection.prepareStatement(sql2);
            getAllByDateAndSeatsStatement.setDate(1,date);
            getAllByDateAndSeatsStatement.setInt(2,seats);
           
            resultSet = getAllByDateAndSeatsStatement.executeQuery();

            
            while(resultSet.next())
            {     
                
                WaitlistEntry entry = new WaitlistEntry(resultSet.getString("Faculty"),resultSet.getDate("Date"),
                        resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));
                
                waitlistInfoByDateAndSeats.add(entry);
                
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return waitlistInfoByDateAndSeats;
        
    }

    
    
    
    
    
    
    
    
    
    
    public static ArrayList<WaitlistEntry> getAllWaitlistsByFacultyAndDate(String faculty, Date date)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getEntriesByFacultyAndDate = connection.prepareStatement(sql4);
            getEntriesByFacultyAndDate.setString(1,faculty);
            getEntriesByFacultyAndDate.setDate(2,date);
           
            resultSet = getEntriesByFacultyAndDate.executeQuery();

            
            while(resultSet.next())
            {     
                
                WaitlistEntry entry = new WaitlistEntry(resultSet.getString("Faculty"),resultSet.getDate("Date"),
                        resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));
                
                waitlistInfoByFacultyAndDates.add(entry);
                
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return waitlistInfoByFacultyAndDates;
        
    }
    
    
    
    
    
    
    
    
    
        
    public static ArrayList<WaitlistEntry> getAllWaitlistsBySeats(int seats)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getAllWaitlistsBySeatsStatement = connection.prepareStatement(sql5);
            getAllWaitlistsBySeatsStatement.setInt(1,seats);

           
            resultSet = getAllWaitlistsBySeatsStatement.executeQuery();

            
            while(resultSet.next())
            {     
                
                WaitlistEntry entry = new WaitlistEntry(resultSet.getString("Faculty"),resultSet.getDate("Date"),
                        resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));
                
                waitlistInfoBySeats.add(entry);
                
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return waitlistInfoBySeats;
        
    }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void addWaitlistEntry(String faculty, Date date, int seats)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            addWaitlistStatement = connection.prepareStatement(sql1);
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            
            
            
            addWaitlistStatement.setString(1,faculty);
            addWaitlistStatement.setDate(2,date);
            addWaitlistStatement.setInt(3,seats);
            addWaitlistStatement.setTimestamp(4,currentTimestamp);
            
            addWaitlistStatement.executeUpdate();
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }    

    }
    
    
    
    
    
    
    
    
    
    
    public static void addNewWaitlistEntry(String faculty, Date date, int seats, java.sql.Timestamp time)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            addNewWaitlistStatement = connection.prepareStatement(sql1);
            

            addNewWaitlistStatement.setString(1,faculty);
            addNewWaitlistStatement.setDate(2,date);
            addNewWaitlistStatement.setInt(3,seats);
            addNewWaitlistStatement.setTimestamp(4,time);
            
            addWaitlistStatement.executeUpdate();
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }    

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void getWaitlistByDate(String faculty, Date date, int seats)  //TO BE EDITED
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getWaitlistByDateStatement = connection.prepareStatement(sql1);
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            
            
            
            getWaitlistByDateStatement.setString(1,faculty);
            getWaitlistByDateStatement.setDate(2,date);
            getWaitlistByDateStatement.setInt(3,seats);
            getWaitlistByDateStatement.setTimestamp(4,currentTimestamp);
            
            getWaitlistByDateStatement.executeUpdate();
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }    

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static ArrayList <WaitlistEntry> getWaitlistByFaculty(String faculty)  
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getWaitlistByFacultyStatement = connection.prepareStatement(sql6);
            getWaitlistByFacultyStatement.setString(1,faculty);
            resultSet = getWaitlistByFacultyStatement.executeQuery();
            
            
            while(resultSet.next())
            {
                WaitlistEntry entry = new WaitlistEntry(resultSet.getString("Faculty"),resultSet.getDate("Date"),
                        resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));
                
                waitlistInfoByFaculty.add(entry);
                
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return waitlistInfoByFaculty;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void cancelWaitlistEntry(String faculty, Date date, int seats)  //TO BE EDITED
    {
        connection = DBConnection.getConnection();
        
        try
        {
            cancelEntryStatement = connection.prepareStatement(sql1);
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            
            
            
            cancelEntryStatement.setString(1,faculty);
            cancelEntryStatement.setDate(2,date);
            cancelEntryStatement.setInt(3,seats);
            cancelEntryStatement.setTimestamp(4,currentTimestamp);
            
            cancelEntryStatement.executeUpdate();
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }    

    }
    
    
    
    
    
    
    
    
    public static void deleteWaitlistEntry(String faculty, Date date,java.sql.Timestamp time)  
    {
        connection = DBConnection.getConnection();
        
        try
        {
            deleteEntryStatement = connection.prepareStatement(sql3);


                            
                deleteEntryStatement.setString(1,faculty);
                deleteEntryStatement.setDate(2,date);
                deleteEntryStatement.setTimestamp(3,time);

                deleteEntryStatement.executeUpdate();
                

        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }    

    }
    
    
    
    
    public static ArrayList<WaitlistEntry> newWaitlistByTimestamp()
        {
            connection = DBConnection.getConnection();

            try
            {
                getAllStatement = connection.prepareStatement(sql);
                resultSet = getAllStatement.executeQuery();

                while(resultSet.next())
                {     

                    WaitlistEntry entry = new WaitlistEntry(resultSet.getString("Faculty"),resultSet.getDate("Date"),
                            resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));

                    newWaitlistByTimestamp.add(entry);

                }
            }

            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }

            return newWaitlistByTimestamp;

        }

    
}
