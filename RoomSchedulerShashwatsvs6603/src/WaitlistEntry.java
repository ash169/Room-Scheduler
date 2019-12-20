

import java.sql.Date;
import java.sql.Timestamp;


public class WaitlistEntry 
{
    private String facultyNameWaitlisted;  //Property I (Public Key)
    private Date dateWaitlisted; //Property II (Public Key)
    public int seatCapacityWaitlisted; //Property III
    public Timestamp timeStampWaitlisted; //Property IV
    
    
    
    
    
    public WaitlistEntry() //Constructor
    {
        
    }
    
    public WaitlistEntry(String facultyNameWaitlisted, Date dateWaitlisted, int seatCapacityWaitlisted, Timestamp timeStampWaitlisted)   // General Constructor

    {
        setFacultyNameWaitlisted (facultyNameWaitlisted);
        setDateWaitlisted (dateWaitlisted);
        setSeatCapacityWaitlisted (seatCapacityWaitlisted);
        setTimeStampWaitlisted (timeStampWaitlisted);
            
    }
    
    
   
    
    public void setFacultyNameWaitlisted(String facultyNameWaitlisted)  //Setter for facultyNameWaitlisted
    {
        this.facultyNameWaitlisted = facultyNameWaitlisted;
    }
    
    
    public void setDateWaitlisted(Date dateWaitlisted)  // Setter for dateWaitlisted
    {
        this.dateWaitlisted = dateWaitlisted;
    }
    
    public void setSeatCapacityWaitlisted(int seatCapacityWaitlisted)  // Setter for seatCapacityWaitlisted
    {
        this.seatCapacityWaitlisted = seatCapacityWaitlisted;
    }
    
    public void setTimeStampWaitlisted(Timestamp timeStampWaitlisted)  // Setter for timeStampWaitlisted
    {
        this.timeStampWaitlisted = timeStampWaitlisted;
    }
    
    
    
    
    
    
    public String getFacultyNameWaitlisted()  //Getter for facultyNameWaitlisted
    {
       return facultyNameWaitlisted;
    }
    
    public Date getDateWaitlisted()  // Getter for dateWaitlisted
    {
        return dateWaitlisted;
    }
    
    public int getSeatCapacityWaitlisted()  // Getter for seatCapacityWaitlisted
    {
        return seatCapacityWaitlisted;
    }
    
    public Timestamp getTimeStampWaitlisted()  // Getter for timeStampWaitlisted
    {
        return timeStampWaitlisted;
    }
    
    
}
