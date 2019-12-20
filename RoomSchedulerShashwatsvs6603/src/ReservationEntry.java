

import java.sql.Date;
import java.sql.Timestamp;



public class ReservationEntry 
{
    
    private String facultyNameRequested;  //Property I (Public Key)
    private String roomNameRequested; //Property II (Public Key)
    private Date dateRequested; //Property III (Public Key)
    public int seatCapacityRequested; //Property IV
    public Timestamp timeStampRequested; //Property V
    
    
    
    
    
    public ReservationEntry() //Constructor
    {
        
    }
    
    public ReservationEntry(String facultyNameRequested, String roomNameRequested, 
            Date dateRequested, int seatCapacityRequested, Timestamp timeStampRequested)   // General Constructor

    {
        setFacultyNameRequested (facultyNameRequested);
        setRoomNameRequested (roomNameRequested); 
        setDateRequested (dateRequested);
        setSeatCapacityRequested (seatCapacityRequested);
        setTimeStampRequested (timeStampRequested);
            
    }
    
    
   
    
    public void setFacultyNameRequested(String facultyNameRequested)  //Setter for facultyNameRequested
    {
        this.facultyNameRequested = facultyNameRequested;
    }
    
    public void setRoomNameRequested(String roomNameRequested)  // Setter for roomNameRequested
    {
        this.roomNameRequested = roomNameRequested;
    }
    
    public void setDateRequested(Date dateRequested)  // Setter for dateRequested
    {
        this.dateRequested = dateRequested;
    }
    
    public void setSeatCapacityRequested(int seatCapacityRequested)  // Setter for seatCapacityRequested
    {
        this.seatCapacityRequested = seatCapacityRequested;
    }
    
    public void setTimeStampRequested(Timestamp timeStampRequested)  // Setter for timeStampRequested
    {
        this.timeStampRequested = timeStampRequested;
    }
    
    
    
    
    
    
    public String getFacultyNameRequested()  //Getter for facultyNameRequested
    {
       return facultyNameRequested;
    }
    
    public String getRoomNameRequested()  // Getter for roomNameRequested
    {
        return roomNameRequested;
    }
    
    public Date getDateRequested()  // Getter for dateRequested
    {
        return dateRequested;
    }
    
    public int getSeatCapacityRequested()  // Getter for seatCapacityRequested
    {
        return seatCapacityRequested;
    }
    
    public Timestamp getTimeStampRequested()  // Getter for timeStampRequested
    {
        return timeStampRequested;
    }
    
    
}

    