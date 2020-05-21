# Room Scheduler Java Application

### Disclaimer: This work is strictly for my personal use. If you are a CMPSC 221 student, you are solely responsible for any kind of plagiarism.

## Introduction

You have been asked to develop a RoomScheduling application for Tiny College. This college has only one building in which to schedule rooms.  The Tiny College can reserveone room per Dateper faculty, for each Datethe rooms are available. The rooms are reserved by Faculty name. Faculty can request a room reservation for a specific Date based on the number of seats they require. The room will be assigned by the program, faculty do not get to request a specific room. Each Date is just a specific Date. Faculty are identified by a single name. This application should have a very nice GUI interface and will be a database driven application. The database used will be Derby. This application must use good Object-OrientedDesign and Programming. The database must use good Object-Oriented Design and Programming. There is a very close correlation between Object-Oriented Design and Database Design. Your application design should include at least four classes besides the main GUI class, e.g. Facultyclass, Roomclass, Dateclass, Reservationsclass,etc. Your database accesses should be in the classes thatcorrelate with the database tables.

## GUI Guidelines

The user should be required to enter only unknown data. Drop down lists of known data such as Faculty, Rooms or Dates should be displayed for the user to select from. Combo Boxes should be used to categorize data on the form. When information is requested to be displayed e.g. for aStatus command, all of the requested information must be displayed. When a command is performed, the results of that command should be displayed to the useron the same display without the user needing to check Status to see what was done.


## Features

### Add: Faculty

A faculty member is added to the database. The faculty member is identified by only one name

### Reserve: Faculty,Date,Seats

The faculty memberwill be assigned aroomfor the requested Date, if there are seats available. The rooms will be assigned in a best fit manner. The faculty membershould be assigned the smallest room that has enough seats for their request. If there are no rooms available or no rooms with enough seats available, the faculty member will be put on th wait list for that Date. The waiting list must be maintained in the order the faculty members tried to reserve their rooms 

### Status: Reservations by Date

The Status command by Date will display the faculty members that have rooms reserved on that Date

### Status: Waiting List 

The Status command for the Waitlist will display all the Faculty members waiting for rooms. It will be displayed in Date order and then in the order of when the reservation was requested

### Add: Room,Seats 

Add a new Room to the system. The Room name is a string and Seats is the number of seats in the Room. When a room is added, the wait list must be searched for any faculty waiting for a roomfor all Dates that rooms are reserved and reserve the room for them and remove them from the waiting list.

### Add: Date

Add a new Date that rooms can be reserved tothe system.

### Cancel Reservation: Faculty,Date 

The reservationfor that Faculty memberand Datemust be removed from the Room’s reservations or the waiting list. If the reservation is removed from a room, the waiting list must be checked to determine if another Faculty membercan be booked for that room for that Date, checking the number of seats requirement, of course.

### Status: Faculty Member 

The Status command for a Faculty memberwill display the Roomand Date for each roomthe Faculty memberhas reservedand/or is waitlisted for.

### Drop Room

The Drop command must remove a room from the application. Any faculty members that had this room reserved for any Date will get another room reserved for that Date if possible,in priority sequence,and the new reservation reported to the user. If the faculty member cannot get a new room reserved, the user is informed that the faculty member could not get a new room reserved and that they have been placed on the waitlist.
