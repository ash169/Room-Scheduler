
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.*;
import java.sql.*;



public class RoomQueries   //getAllPossibleRooms    //addRoom    //dropRoom         
{
    private static Connection connection;
    private static ArrayList<RoomEntry> roomInfo = new ArrayList<RoomEntry>(); // Array 'roomInfo' of type RoomEntry contains the list of all rooms (name+capacity) 

    private static PreparedStatement addRoomStatement;
    private static PreparedStatement dropRoomStatement;  
    private static Statement getAllPossibleRoomsStatement;
    private static PreparedStatement getAllPossibleRoomsBySeatsStatement;
    private static PreparedStatement getAllPossibleRoomsByNameAndSeatsStatement;
   
    
    private static ResultSet resultSet = null;
    
    
    static String sql = "select * from rooms";
    static String sql1 = "select * from rooms where seats>=(?) order by seats";
    static String sql2 = "insert into rooms (name,seats) values (?,?)";
    static String sql3 = "delete from rooms where name = ? ";
    static String sql4 = "select * from rooms where name = ? and seats = ?";
    

    public static void addRoom(String addRoomName, int addRoomSeats) 
    {
        //When a room is added, the wait list must be searched for any faculty waiting for 
        //a room for all Dates that rooms are reserved and reserve the room for them and remove them from the waiting list
        
        
        connection = DBConnection.getConnection();
        try
        {
            addRoomStatement = connection.prepareStatement(sql2);
            addRoomStatement.setString(1, addRoomName);
            addRoomStatement.setInt(2,addRoomSeats);
            addRoomStatement.executeUpdate();
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
    }

   
    public static void dropRoom(String dropRoomName)              
    // We take in a roomNumber and remove it from all of our reservations and waitlists

    {
        connection = DBConnection.getConnection();
        
        try
        {
            dropRoomStatement = connection.prepareStatement(sql3);
            dropRoomStatement.setString(1,dropRoomName);
  
            
            dropRoomStatement.executeUpdate();
        }
        
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
    }
        

    
    public static ArrayList <String> getAllRooms()   
 
    {
        ArrayList<String> roomNames = new ArrayList<String>();   //If this declaration was outside and since  we are not clearing the list anywhere
                                                                 // we must  declare  it inside  the function, so that it's only locally present
        connection = DBConnection.getConnection(); 
        
        try
        {
            getAllPossibleRoomsStatement = connection.createStatement();
            resultSet = getAllPossibleRoomsStatement.executeQuery("select name from rooms order by name");

            
            while(resultSet.next())
            {
                roomNames.add(resultSet.getString(1));
            }
        }
        
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return roomNames;
        
    }

    
    public static ArrayList<RoomEntry> getAllPossibleRoomsbySeats(int seats)       
  
    {
        connection = DBConnection.getConnection(); 
        
        try
        {
            getAllPossibleRoomsBySeatsStatement = connection.prepareStatement(sql1);
            getAllPossibleRoomsBySeatsStatement.setInt(1,seats);
            resultSet = getAllPossibleRoomsBySeatsStatement.executeQuery();
            

            
            while(resultSet.next())
            {
                RoomEntry entry = new RoomEntry(resultSet.getString("Name"),resultSet.getInt("Seats"));
                
                roomInfo.add(entry);
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return roomInfo;
        
    }
 
    
    
    public static ArrayList<RoomEntry> getAllPossibleRoomsbyNameAndSeats(String name, int seats)       
  
    {
        connection = DBConnection.getConnection(); 
        
        try
        {
            getAllPossibleRoomsByNameAndSeatsStatement = connection.prepareStatement(sql4);
            
            getAllPossibleRoomsByNameAndSeatsStatement.setString(1,name);
            getAllPossibleRoomsByNameAndSeatsStatement.setInt(2, seats);

            resultSet = getAllPossibleRoomsByNameAndSeatsStatement.executeQuery();
            

            
            while(resultSet.next())
            {
                RoomEntry entry = new RoomEntry(resultSet.getString("Name"),resultSet.getInt("Seats"));
                
                roomInfo.add(entry);
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return roomInfo;
        
    }
    
    
    
}
