
public class RoomEntry 
{
    private String roomName;  //Property I (Public Key)
    private int seatCapacity;  //Property II
    
    
    
    
    public RoomEntry() //Constructor
    {
        
    }
    
    public RoomEntry(String roomName, int seatCapacity)  // General Constructor
    {
        setRoomName(roomName);
        setSeatCapacity(seatCapacity);    
        
    }
    
    
   
    
    public void setRoomName (String roomName)  //Setter for roomName
    {
        this.roomName = roomName;
    }
    
    public void setSeatCapacity(int seatCapacity)  // Setter for seatCapacity
    {
        this.seatCapacity = seatCapacity;
    }
    
    
    
    
    public String getRoomName()   //Getter for roomName
    {
        return roomName;
    }
    
    public int getSeatCapacity()   //Getter for seatCapacity
    {
        return seatCapacity;
    }
    
    
    
    
}
