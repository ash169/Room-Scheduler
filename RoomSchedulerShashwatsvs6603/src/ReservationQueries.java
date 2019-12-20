
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.*;
import java.util.Calendar;


/*
So display the name of all faculty members that have a reservation on that particular date in the format 'FacultyName reserved RoomName', for every date
For a particular date, return name and seats and do this for all dates

This is not needed for this part for the difference is for cancelReservation it is done by the user that suppose they want to cancel a 
particular reservation so in that case, we remove that particular data from  our reservations table and then try to book that room for someone in the 
waitlist looking for the same room. In deleteReservation, it is  done after you drop a room for some reason, so not the user but you drop a room and 
then in that case, you will have to delete the reservations for that  room and then allott the faculty some different available room.*/



public class ReservationQueries  //getAllReservationsByDate  //getRoomsReservedByDtae  //addReservationEntry  //cancelReservation  //getAllReservationsByFaculty //deleteReservations
{
    
    private static Date date;
    private static Connection connection;
    private static ResultSet resultSet = null;
    
    
    private static PreparedStatement getAllReservationByDateStatement;
    private static PreparedStatement addReservationStatement;
    private static PreparedStatement deleteReservationStatement;
    private static PreparedStatement cancelReservationStatement;
    private static PreparedStatement getAllReservationByFacultyStatement;
    private static PreparedStatement getAllReservationByFacultyAndDateStatement;
    private static PreparedStatement getSeatsByNameAndDatesStatement;
    private static PreparedStatement getRoomNameByFacultyAndDateStatement; 
    private static PreparedStatement getRoomsDroppedStatement;
    
    private static ArrayList<ReservationEntry> reservationInfo = new ArrayList<ReservationEntry>(); 
    private static ArrayList<ReservationEntry> reservationInfoReturnedByFacultyAndDate = new ArrayList<ReservationEntry>();
    private static ArrayList<ReservationEntry> reservationInfoByFaculty = new ArrayList<ReservationEntry>(); 
    private static ArrayList<ReservationEntry> reservationsDropped = new ArrayList<ReservationEntry>(); 
    
    

    static String sql = "select * from reservations where date = ? order by timestamp";  // added order by timestamp
    static String sql1 = "insert into reservations (faculty,room,date,seats,timestamp) values (?,?,?,?,?) ";
    static String sql2 = "select * from reservations where faculty = ? and date = ?";
    static String sql3 = "delete from reservations where (faculty = ? and date = ? and timestamp = ?)";
    static String sql4 = "select seats from reservations where faculty  = ? and date = ?";
    static String sql5 = "select room from reservations where faculty = ? and date = ?";
    static String sql6 = "select * from reservations where faculty = ? ";
    static String sql7 = "select * from reservations where room = ? order by timestamp ";
  
    
    
    
    
    
    
    
    public static ArrayList<ReservationEntry> getAllReservationsByDate(Date date)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getAllReservationByDateStatement = connection.prepareStatement(sql);
            getAllReservationByDateStatement.setDate(1,date);
            resultSet = getAllReservationByDateStatement.executeQuery();
            
            //a reserved 201

            
            while(resultSet.next())
            {     
                
                ReservationEntry entry = new ReservationEntry(resultSet.getString("Faculty"),resultSet.getString("Room"),
                        resultSet.getDate("Date"),resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));
                
                reservationInfo.add(entry);
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return reservationInfo;
        
    }
    
    
    
    
    
    public static ArrayList<ReservationEntry> getAllReservationsByFacultyAndDate(String faculty, Date date)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getAllReservationByFacultyAndDateStatement = connection.prepareStatement(sql2);
            
            
            getAllReservationByFacultyAndDateStatement.setString(1,faculty);
            getAllReservationByFacultyAndDateStatement.setDate(2,date);

            
            resultSet = getAllReservationByFacultyAndDateStatement.executeQuery();
            
            
            while(resultSet.next())
            {     
                
                ReservationEntry entry = new ReservationEntry(resultSet.getString("Faculty"),resultSet.getString("Room"),
                        resultSet.getDate("Date"),resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));
                
                reservationInfoReturnedByFacultyAndDate.add(entry);
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return reservationInfoReturnedByFacultyAndDate;
        
    }
    
    
    
    
    
    
        
    public static String getRoomNameByFacultyAndDate(String faculty, Date date)
    {
        connection = DBConnection.getConnection();
        String roomName = null;
        
        
        
        try
        {
            getRoomNameByFacultyAndDateStatement = connection.prepareStatement(sql2);
            
            
            getRoomNameByFacultyAndDateStatement.setString(1,faculty);
            getRoomNameByFacultyAndDateStatement.setDate(2, date);

            
            resultSet = getRoomNameByFacultyAndDateStatement.executeQuery();
            
            
            while(resultSet.next())
            {    
               
                roomName = resultSet.getString("room"); 
 
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return roomName;
        
    }
    
    
  
    

    
    
    
    
      
    
    
    
    
    
        
    public static void cancelReservationEntry(String faculty, Date date, java.sql.Timestamp time)  
    {
        connection = DBConnection.getConnection();
        
        try
        {
            cancelReservationStatement = connection.prepareStatement(sql3);
            
            
            cancelReservationStatement.setString(1,faculty);
            cancelReservationStatement.setDate(2,date);
            cancelReservationStatement.setTimestamp(3,time);
            
            
            
            cancelReservationStatement.executeUpdate();

 
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
 
        
    }
    
    
    
    
    
    
    
    
    
    
    public static int getSeatsByNameAndDate(String  name, Date date)
    {
        connection = DBConnection.getConnection();
        int seat = 0;
        
        try
        {
            getSeatsByNameAndDatesStatement = connection.prepareStatement(sql4);
            
            
            getSeatsByNameAndDatesStatement.setString(1,name);
            getSeatsByNameAndDatesStatement.setDate(2, date);
            
            resultSet = getSeatsByNameAndDatesStatement.executeQuery();
            
            
            
            
            while(resultSet.next())
            {
                
                seat = resultSet.getInt("Seats");
                
            }
            
            
        }
        
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return seat;
      
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static ArrayList<ReservationEntry> getAllReservationsByFaculty(String faculty)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getAllReservationByFacultyStatement = connection.prepareStatement(sql6);
            getAllReservationByFacultyStatement.setString(1,faculty);
            resultSet = getAllReservationByFacultyStatement.executeQuery();
            


            
            while(resultSet.next())
            {     
                
                ReservationEntry entry = new ReservationEntry(resultSet.getString("Faculty"),resultSet.getString("Room"),
                        resultSet.getDate("Date"),resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));
                
                reservationInfoByFaculty.add(entry);
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return reservationInfoByFaculty;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
     public static ArrayList<ReservationEntry> getDroppedRooms(String roomDrop)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            getRoomsDroppedStatement = connection.prepareStatement(sql7);
            getRoomsDroppedStatement.setString(1,roomDrop);
            resultSet = getRoomsDroppedStatement.executeQuery();
            
       

            
            while(resultSet.next())
            {     
                
                ReservationEntry entry = new ReservationEntry(resultSet.getString("Faculty"),resultSet.getString("Room"),
                        resultSet.getDate("Date"),resultSet.getInt("Seats"),resultSet.getTimestamp("Timestamp"));
                
                reservationsDropped.add(entry);
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return reservationsDropped;
        
    }
        
        
        
        
        
        
        
        
        
        
        

    
    
    
    
    
    
    
    
    
    public static void addReservationEntry(String faculty, String room, Date date, int seats)
    {
        connection = DBConnection.getConnection();
        
        try
        {
            addReservationStatement = connection.prepareStatement(sql1);
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            
            
            
            addReservationStatement.setString(1,faculty);
            addReservationStatement.setString(2,room);
            addReservationStatement.setDate(3,date);
            addReservationStatement.setInt(4,seats);
            addReservationStatement.setTimestamp(5,currentTimestamp);
            
            addReservationStatement.executeUpdate();
            
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        

        
    }
    
    
    
}
        
        