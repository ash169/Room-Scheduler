
import java.sql.Date;
import java.awt.*;
import javax.swing.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.*;
import java.sql.*;


import java.text.DateFormat;
import java.text.SimpleDateFormat;


            


public class RoomSchedulerFrame extends javax.swing.JFrame
{


    
    /**
     * Creates new form RoomSchedulerFrame
     */
    
    public RoomSchedulerFrame()
    {
        initComponents();
        
        // Load the combo boxes with the updated data.
        rebuildFacultyComboBoxes();
        rebuildDateComboBoxes();
        rebuildReservationsDateComboBoxes();
        rebuildRoomNamesComboBoxes();
        
    }
    
    
    public void rebuildFacultyComboBoxes()
    {
        reserveFacultyNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getAllFacultyList().toArray()));
        cancelReservationFacultyNameJComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getAllFacultyList().toArray())); 
        viewStatusFacultyNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getAllFacultyList().toArray()));
    }
    
    public void rebuildDateComboBoxes()
    {
        reserveDateComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDates().toArray())); 
    }
    
    public void rebuildReservationsDateComboBoxes()
    {
        findReservationsByDateComboBox.setModel(reserveDateComboBox.getModel());
        deletingReservationDateJComboBox.setModel(reserveDateComboBox.getModel());
    }
    
    public void rebuildRoomNamesComboBoxes()
    {
        roomNameDropJComboBox.setModel(new javax.swing.DefaultComboBoxModel(RoomQueries.getAllRooms().toArray()));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        roomSchedulerPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addFacultyTextField = new javax.swing.JTextField();
        addFacultyNameButton = new javax.swing.JButton();
        addFacultyStatusLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        reserveFacultyNameComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        reserveDateComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        reserveSeatsTextField = new javax.swing.JTextField();
        reserveReserveRoomButton = new javax.swing.JButton();
        reserveStatusLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addFacultyStatusLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        findReservationsByDateComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservationsByDateTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        addFacultyStatusLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        waitlistEntriesTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        newRoomNameAddTextField = new javax.swing.JTextField();
        addNewRoomButton = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        addNewRoomSeatsTextField = new javax.swing.JTextField();
        addRoomStatusDisplayJPanel = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        waitlistStatusJTextArea = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dropNewRoomButton = new javax.swing.JButton();
        roomDroppedDisplayedJLabel = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        roomNameDropJComboBox = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        movedInformationJTextArea = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        addedToWaitlistJTextArea = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cancelReservationJButton = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        displayStatusJLabel = new javax.swing.JLabel();
        deletingReservationDateJComboBox = new javax.swing.JComboBox<>();
        nameNotExisitingJLabel = new javax.swing.JLabel();
        movedToReservationJLabel = new javax.swing.JLabel();
        cancelReservationFacultyNameJComboBox = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        addNewDateJButton = new javax.swing.JButton();
        dateAddedJLabel = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        dateAddedDisplayJLabel = new javax.swing.JLabel();
        dateEntryByUserJSpinner = new javax.swing.JSpinner();
        jPanel15 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        viewCompleteStatusJButton = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        completeReservationStatusEntriesTextArea = new javax.swing.JTextArea();
        viewStatusFacultyNameComboBox = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        completeWaitlistStatusEntriesTextArea = new javax.swing.JTextArea();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room Scheduler");

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("DIN Condensed", 1, 50)); // NOI18N
        jLabel1.setText("Room Scheduler");

        roomSchedulerPanel.setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Enter Faculty Name: ");

        addFacultyTextField.setColumns(20);

        addFacultyNameButton.setText("Add Faculty");
        addFacultyNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultyNameButtonActionPerformed(evt);
            }
        });

        addFacultyStatusLabel.setText("    ");

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(addFacultyStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(addFacultyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(addFacultyNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(469, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addFacultyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(addFacultyNameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(addFacultyStatusLabel)
                .addGap(43, 43, 43)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        roomSchedulerPanel.addTab("Add Faculty", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setText("Faculty Name: ");

        jLabel5.setText("Date: ");

        jLabel6.setText("Seats Required: ");

        reserveSeatsTextField.setColumns(3);

        reserveReserveRoomButton.setText("Reserve Room");
        reserveReserveRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveReserveRoomButtonActionPerformed(evt);
            }
        });

        reserveStatusLabel.setText("   ");

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reserveSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reserveFacultyNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reserveDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(reserveStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(reserveReserveRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserveFacultyNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(reserveDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(reserveSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(reserveReserveRoomButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(reserveStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        roomSchedulerPanel.addTab("Reserve Room", jPanel2);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Choose Date:");

        addFacultyStatusLabel1.setText("    ");

        jPanel8.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        findReservationsByDateComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                findReservationsByDateComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        reservationsByDateTextArea.setColumns(20);
        reservationsByDateTextArea.setRows(5);
        jScrollPane2.setViewportView(reservationsByDateTextArea);

        jLabel8.setBackground(new java.awt.Color(204, 255, 255));
        jLabel8.setFont(new java.awt.Font("Seravek", 0, 18)); // NOI18N
        jLabel8.setText("Select Date to View Reservations");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(findReservationsByDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(501, 501, 501))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addFacultyStatusLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addFacultyStatusLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findReservationsByDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 806, Short.MAX_VALUE)
        );

        roomSchedulerPanel.addTab("View Status By Date", jPanel5);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addFacultyStatusLabel2.setText("    ");

        jPanel10.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1162, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        waitlistEntriesTextArea.setColumns(20);
        waitlistEntriesTextArea.setRows(5);
        jScrollPane3.setViewportView(waitlistEntriesTextArea);

        jButton1.setText("View Waitlist Entries");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addFacultyStatusLabel2))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addFacultyStatusLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(487, 487, 487)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        roomSchedulerPanel.addTab("View All Waitlists", jPanel6);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Room Name: ");

        newRoomNameAddTextField.setColumns(20);

        addNewRoomButton.setText("Add Room");
        addNewRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewRoomButtonActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        jLabel13.setText("Number of Seats: ");

        addNewRoomSeatsTextField.setColumns(20);

        waitlistStatusJTextArea.setColumns(20);
        waitlistStatusJTextArea.setRows(5);
        jScrollPane8.setViewportView(waitlistStatusJTextArea);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addNewRoomSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newRoomNameAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addComponent(addNewRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(addRoomStatusDisplayJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(newRoomNameAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(addNewRoomSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(addNewRoomButton)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(addRoomStatusDisplayJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        roomSchedulerPanel.addTab("Add New Room", jPanel11);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Select Room to Drop:");

        dropNewRoomButton.setText("Drop Room");
        dropNewRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropNewRoomButtonActionPerformed(evt);
            }
        });

        roomDroppedDisplayedJLabel.setText("    ");

        jPanel19.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        movedInformationJTextArea.setColumns(20);
        movedInformationJTextArea.setRows(5);
        jScrollPane6.setViewportView(movedInformationJTextArea);

        addedToWaitlistJTextArea.setColumns(20);
        addedToWaitlistJTextArea.setRows(5);
        jScrollPane7.setViewportView(addedToWaitlistJTextArea);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(roomNameDropJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(dropNewRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roomDroppedDisplayedJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(roomNameDropJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(dropNewRoomButton)
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)))
                .addComponent(roomDroppedDisplayedJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roomSchedulerPanel.addTab("Drop Existing Room", jPanel12);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Faculty Name: ");

        cancelReservationJButton.setText("Cancel Reservation");
        cancelReservationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationJButtonActionPerformed(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        jLabel15.setText("Date of Reservation: ");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deletingReservationDateJComboBox, 0, 135, Short.MAX_VALUE)
                            .addComponent(cancelReservationFacultyNameJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(cancelReservationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(566, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(displayStatusJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(movedToReservationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameNotExisitingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cancelReservationFacultyNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(deletingReservationDateJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(cancelReservationJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayStatusJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movedToReservationJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(nameNotExisitingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roomSchedulerPanel.addTab("Cancel Reservation By Date", jPanel13);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Enter New Date:");

        addNewDateJButton.setText("Add Date");
        addNewDateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewDateJButtonActionPerformed(evt);
            }
        });

        dateAddedJLabel.setText("    ");

        jPanel23.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        dateEntryByUserJSpinner.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel11)
                        .addGap(27, 27, 27)
                        .addComponent(dateEntryByUserJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(dateAddedDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(addNewDateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(dateAddedJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(531, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(dateEntryByUserJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(addNewDateJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(dateAddedDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(dateAddedJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roomSchedulerPanel.addTab("Add New Date", jPanel14);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Choose Faculty Name: ");

        viewCompleteStatusJButton.setText("View Complete Status");
        viewCompleteStatusJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCompleteStatusJButtonActionPerformed(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1246, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        completeReservationStatusEntriesTextArea.setColumns(20);
        completeReservationStatusEntriesTextArea.setRows(5);
        jScrollPane1.setViewportView(completeReservationStatusEntriesTextArea);

        completeWaitlistStatusEntriesTextArea.setColumns(20);
        completeWaitlistStatusEntriesTextArea.setRows(5);
        jScrollPane5.setViewportView(completeWaitlistStatusEntriesTextArea);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewStatusFacultyNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(viewCompleteStatusJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(viewStatusFacultyNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viewCompleteStatusJButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        roomSchedulerPanel.addTab("View Status By Faculty", jPanel15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roomSchedulerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1269, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomSchedulerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Button clicked to view Waitlist

        ArrayList <WaitlistEntry> returnedWaitlistEntry = new ArrayList<WaitlistEntry>();
        returnedWaitlistEntry = WaitlistQueries.getAllWaitlists();

        waitlistEntriesTextArea.append(null);
        waitlistEntriesTextArea.setText("Faculty\tDate\tSeat Capacity Requested \n");
        
        if (returnedWaitlistEntry.size() == 0)
        {
            waitlistEntriesTextArea.append(null);
            waitlistEntriesTextArea.setText("\tWaitlist is empty");
            
        }
        
        else
        {
            for(int i=0;i<returnedWaitlistEntry.size();i++)
            {
                waitlistEntriesTextArea.append(returnedWaitlistEntry.get(i).getFacultyNameWaitlisted()+"\t"+returnedWaitlistEntry.get(i).getDateWaitlisted()+
                    "\t"+returnedWaitlistEntry.get(i).getSeatCapacityWaitlisted()+"\n");
                //waitlistEntriesTextArea is the variable name of the text field where waitlist has to be displayed
            }   
        }
       
        returnedWaitlistEntry.clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void findReservationsByDateComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_findReservationsByDateComboBoxPopupMenuWillBecomeInvisible
        //Fetching data after clicking on a particular date in comboBox

        Date temp = (Date)findReservationsByDateComboBox.getSelectedItem();  //findReservationsByDateComboBox is the name of the date comboBox

        ArrayList <ReservationEntry> returnedEntry = new ArrayList<ReservationEntry>();
        returnedEntry = ReservationQueries.getAllReservationsByDate(temp);

        reservationsByDateTextArea.setText(null);

        for(int i=0;i<returnedEntry.size();i++)
        {
            reservationsByDateTextArea.append(returnedEntry.get(i).getFacultyNameRequested()+" has reserved room "+returnedEntry.get(i).getRoomNameRequested()+"\n");
            //reservationsByDateTextArea is the variable name of the text field

        }

        returnedEntry.clear();
    }//GEN-LAST:event_findReservationsByDateComboBoxPopupMenuWillBecomeInvisible


    
    
    
    
    
    
    
    
    
    private void reserveReserveRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveReserveRoomButtonActionPerformed
        // The reserve room button that upon clicking completes the reservation or waitlists the reservation in the best fit manner
        //Should display the message that 'FacultyName' reserves Room XX for 'Date' '
        //In case, the required room is already reserved, display 'FacultyName' gets waitlisted' and update the combo box and
        //that addition should be using timestamp order

        String facultyName = (String) reserveFacultyNameComboBox.getSelectedItem();
        java.sql.Date reservationDate = (java.sql.Date) reserveDateComboBox.getSelectedItem();
        int seatsRequired = Integer.parseInt(reserveSeatsTextField.getText());

        ArrayList<RoomEntry> roomEntryReturned = RoomQueries.getAllPossibleRoomsbySeats(seatsRequired);
        //returns a RoomEntry type array containing the name and seats of all the rooms which  have seats>= the number of seats passed in the parameter

        ArrayList<ReservationEntry> reservationEntryReturned = ReservationQueries.getAllReservationsByDate(reservationDate);
        //returns a ReservationEntry type array containing the 5 properties rooms that are reserved on the date passed as parameter
        
        ArrayList<ReservationEntry> duplicateReservationEntryReturned = ReservationQueries.getAllReservationsByFacultyAndDate (facultyName,reservationDate);
        ArrayList<WaitlistEntry> duplicateWaitlistEntryReturned = WaitlistQueries.getAllWaitlistsByFacultyAndDate (facultyName,reservationDate);
        
        
        if (duplicateReservationEntryReturned.size() != 0)
        {
            reserveStatusLabel.setText("Duplicate entries! "+facultyName+" already reserves a room on date "+reservationDate);
        }
        
        else if (duplicateWaitlistEntryReturned.size() != 0)
        {
            reserveStatusLabel.setText("Duplicate entries! "+facultyName+" already is already waitlisted for a room on date "+reservationDate);       
        }
        
        else if(duplicateReservationEntryReturned.size() == 0 && duplicateWaitlistEntryReturned.size() == 0)
        {
            String room=null;
            boolean found=false;
        
            if (roomEntryReturned.size() == 0)
            {
                WaitlistQueries.addWaitlistEntry(facultyName, reservationDate, seatsRequired);
                reserveStatusLabel.setText(facultyName+" gets waitlisted");
                
            }


            else
            {
                for(int i=0;i<roomEntryReturned.size();i++)  //These are the possible rooms that can be reserved based on the seat requirements
                    {
                        found=false;

                        for(int j=0;j<reservationEntryReturned.size();j++)
                        {
                            //These are the rooms that have already been reserved, so these are being used to check if a particular possible room from above is already reserved or not
                            // If yes, add in the waitlist else add the reservationEntry

                            if(roomEntryReturned.get(i).getRoomName().equals(reservationEntryReturned.get(j).getRoomNameRequested()))
                            {
                                found=true;
                                break;
                            }

                        }

                        if(found==false)
                        {
                            room=roomEntryReturned.get(i).getRoomName();
                            break;  // So that the best-fit is satisfied since we have returned the roomEntryReturned ordered by seats
                        }

                    }




                if(found==true)
                {

                    WaitlistQueries.addWaitlistEntry(facultyName, reservationDate, seatsRequired);
                    reserveStatusLabel.setText(facultyName+" gets waitlisted");

                }

                else
                {
                    ReservationQueries.addReservationEntry(facultyName, room, reservationDate, seatsRequired);
                    reserveStatusLabel.setText(facultyName+" reserves room "+room);
                }



            }

        }
        
        
        roomEntryReturned.clear();
        reservationEntryReturned.clear();
        duplicateReservationEntryReturned.clear();
        duplicateWaitlistEntryReturned.clear();
        

        // Instead of moving d to waitlist, it shows d already reserves a room on that date
        
        
        // ** If the user enters a room not in the database, display a suitable message for that **
    }//GEN-LAST:event_reserveReserveRoomButtonActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void addFacultyNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacultyNameButtonActionPerformed
        // Add button to add the name of faculty entered by the user
        
        // Check for duplicate faculty entries
        addFacultyStatusLabel.setText("");
        String name = addFacultyTextField.getText();
        
        ArrayList <String> returnedFaculty  = new ArrayList <String>();
        returnedFaculty = Faculty.getAllFacultyListByName(name);
        
        
        if (returnedFaculty.size()==0)
        {
            Faculty.addFaculty(name);
            addFacultyStatusLabel.setText(name+" has been added to the Faculty ");
        }
        
        
        else
        {
            addFacultyStatusLabel.setText(name+" already exists in the Faculty database");
        }
           


        // Rebuild the reservation faculty combo box using the updated data.
        rebuildFacultyComboBoxes();
        returnedFaculty.clear();
    }//GEN-LAST:event_addFacultyNameButtonActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    private void addNewRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewRoomButtonActionPerformed
     
        // First of all, put the room in the rooms table 
        String addRoomName = (String) newRoomNameAddTextField.getText();
        int addRoomSeats = Integer.parseInt(addNewRoomSeatsTextField.getText());
        
        ArrayList<Date> dateEntriesReturned = Dates.getAllDates();
        ArrayList<RoomEntry> roomEntriesReturned = RoomQueries.getAllPossibleRoomsbyNameAndSeats(addRoomName, addRoomSeats);
 
 
        if (roomEntriesReturned.size() != 0)
        {
            addRoomStatusDisplayJPanel.setText("Duplicate entries! This room already exists in the system");

        }
        
        
        
        else
        {
            RoomQueries.addRoom(addRoomName, addRoomSeats);
            addRoomStatusDisplayJPanel.setText("Room "+addRoomName+" with "+ Integer.toString(addRoomSeats)+" seats has been added to the system");
            
        

        
        
        // Second, When a room is added, the wait list must be searched for any faculty 
            for (int i =0 ; i<dateEntriesReturned.size();i++)
            {
                ArrayList<WaitlistEntry> waitlistsEntriesReturnedByDateAndSeats = WaitlistQueries.getAllWaitlistsByDateAndSeats(dateEntriesReturned.get(i),addRoomSeats);

                for(int j=0;j<waitlistsEntriesReturnedByDateAndSeats.size();j++) 
                {



                    ReservationQueries.addReservationEntry(waitlistsEntriesReturnedByDateAndSeats.get(j).getFacultyNameWaitlisted(), addRoomName,dateEntriesReturned.get(i), 
                            addRoomSeats);

                    WaitlistQueries.deleteWaitlistEntry(waitlistsEntriesReturnedByDateAndSeats.get(j).getFacultyNameWaitlisted(),dateEntriesReturned.get(i),waitlistsEntriesReturnedByDateAndSeats.get(j).getTimeStampWaitlisted());

                    waitlistStatusJTextArea.append(waitlistsEntriesReturnedByDateAndSeats.get(j).getFacultyNameWaitlisted()+" is removed from waitlist and reserves room "
                            +addRoomName+" for date "+waitlistsEntriesReturnedByDateAndSeats.get(j).getDateWaitlisted().toString()+"\n");
                    break;

                }

                waitlistsEntriesReturnedByDateAndSeats.clear();

            }
   
            
        }
        
        // waiting for a room for all Dates that rooms are reserved and reserve the room for them and remove them from the waiting list
        // That means, for every date someone is waitlisted, check if they can be allotted this new room added or not in the best fit manner
        // In the end, if allotted, remove them from the waitlist 
        // Display that the room has been added to the system and then also display if someone is now reserved and removed from waitlist

        
        /// Check for duplicate
        
        rebuildRoomNamesComboBoxes();
        roomEntriesReturned.clear();
        dateEntriesReturned.clear();
        
    }//GEN-LAST:event_addNewRoomButtonActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void dropNewRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropNewRoomButtonActionPerformed
        
        String roomDrop = (String)roomNameDropJComboBox.getSelectedItem();
        
        movedInformationJTextArea.setText("");
        addedToWaitlistJTextArea.setText("");
       // roomNameDropJComboBox.removeAllItems();
       
     
        
        // Delete the room from the table and display that it was removed
        RoomQueries.dropRoom(roomDrop);
        roomDroppedDisplayedJLabel.setText("Room "+roomDrop+" has been dropped from the system! ");
        
        
 
        
        ArrayList <ReservationEntry> droppedReservationsList = ReservationQueries.getDroppedRooms(roomDrop); // Array List of all dropped rooms ordered by timestamp
        
        
        // Think about how it will work better if you delete the reservations first
        String room =null;
        boolean found = false;
        
        // Also update the combo box
        for (int i = 0; i<droppedReservationsList.size();i++)
        {
            
            ReservationQueries.cancelReservationEntry(droppedReservationsList.get(i).getFacultyNameRequested(), 
                        droppedReservationsList.get(i).getDateRequested(), droppedReservationsList.get(i).getTimeStampRequested());
            

            
            
            ArrayList <ReservationEntry> reservationsByDate = ReservationQueries.getAllReservationsByDate(droppedReservationsList.get(i).getDateRequested());
            ArrayList <RoomEntry> roomsBySeats = RoomQueries.getAllPossibleRoomsbySeats(droppedReservationsList.get(i).getSeatCapacityRequested());
            
            
            
            
            for(int j=0;j<roomsBySeats.size();j++)  //These are the possible rooms that can be reserved based on the seat requirements
            {
                found=false;

               
                
                
                
                for(int k=0;k<reservationsByDate.size();k++)
                {
                    //These are the rooms that have already been reserved, so these are being used to check if a particular possible room from above is already reserved or not
                    // If yes, add in the waitlist else add the reservationEntry

                    if(roomsBySeats.get(j).getRoomName().equals(reservationsByDate.get(k).getRoomNameRequested()))
                    {
                        found=true;
                        break;
                    }

                }

                
                
                // Accomodate the case when you delete the room with msx seat capacity. That should go in waitlist
                
                
                if(found==false)
                {
                    room = roomsBySeats.get(j).getRoomName();  // room is assuming null value
                    break;  // So that the best-fit is satisfied since we have returned the roomEntryReturned ordered by seats
                }

            
            }




            if(found==true || room == null)
            {
                
                        
                WaitlistQueries.addWaitlistEntry(droppedReservationsList.get(i).getFacultyNameRequested(), droppedReservationsList.get(i).getDateRequested(), 
                        droppedReservationsList.get(i).getSeatCapacityRequested());
                
                movedInformationJTextArea.append("Reservation for "+droppedReservationsList.get(i).getFacultyNameRequested()+
                        " was cancelled and is now moved to waitlist for date "+ droppedReservationsList.get(i).getDateRequested().toString()+"\n");

            }

            
            
            
            
            else
            {
 
                ReservationQueries.addReservationEntry(droppedReservationsList.get(i).getFacultyNameRequested(), room, 
                        droppedReservationsList.get(i).getDateRequested(), droppedReservationsList.get(i).getSeatCapacityRequested());
                
                
                addedToWaitlistJTextArea.append(droppedReservationsList.get(i).getFacultyNameRequested()+" no longer reserves room "+roomDrop
                        +" and is moved to room "+room+ " for date "+droppedReservationsList.get(i).getDateRequested().toString()+"\n");  // working right
            }
            
            
            reservationsByDate.clear();
            roomsBySeats.clear();

        }
        
        // Clear the array list
        
        rebuildRoomNamesComboBoxes();
        droppedReservationsList.clear();
        
        
        // Now just pluck each one and try your best to reserve them a room on the same date, if not they stay in the waitlist. But if possible, 
        // remove them from waitlist first and then add to reservations and display all this. This function has already been done once, check.
        
        // In the end, display what rooms were cancelled that is moved to waitlists finally and what rooms were allotted a new room. 
      
 
        // TIMESTAMP is not yet covered
        
        
        // Treat them as normal waitlists, loop through them and now see if you can book them in any of the empty rooms timestamp wise
        // Display whatever happens as it happens, like if you move someone from waitlist to reservation in the end of looping, display that as well 
        
    }//GEN-LAST:event_dropNewRoomButtonActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void cancelReservationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservationJButtonActionPerformed
        
        nameNotExisitingJLabel.setText("");
        displayStatusJLabel.setText("");
        movedToReservationJLabel.setText("");
        
        
        String facultyName = (String) cancelReservationFacultyNameJComboBox.getSelectedItem();
        java.sql.Date deleteReservationDate = (java.sql.Date) deletingReservationDateJComboBox.getSelectedItem();
        
        int seats = ReservationQueries.getSeatsByNameAndDate (facultyName, deleteReservationDate); 
        String room = ReservationQueries.getRoomNameByFacultyAndDate(facultyName, deleteReservationDate);
  
        
        ArrayList<WaitlistEntry> waitlistEntriesReturnedByFacultyAndDate = WaitlistQueries.getAllWaitlistsByFacultyAndDate(facultyName,deleteReservationDate);
        ArrayList<ReservationEntry> reservationEntriesReturnedByFacultyAndDate = ReservationQueries.getAllReservationsByFacultyAndDate(facultyName,deleteReservationDate);
        
       
        
        
        if(reservationEntriesReturnedByFacultyAndDate.size() == 0 && waitlistEntriesReturnedByFacultyAndDate.size() == 0 )
        {
            nameNotExisitingJLabel.setText("No such reservations or wailists exist, which can be cancelled!");
            
        }
        
        
        
        
        
        
        
        
        
        
        
        if(reservationEntriesReturnedByFacultyAndDate.size() == 0)
        {
            for (int i=0; i<waitlistEntriesReturnedByFacultyAndDate.size();i++)
             {
                WaitlistQueries.deleteWaitlistEntry(facultyName, deleteReservationDate, waitlistEntriesReturnedByFacultyAndDate.get(i).getTimeStampWaitlisted());
                nameNotExisitingJLabel.setText(facultyName+ " gets cancelled from waitlist for date "+waitlistEntriesReturnedByFacultyAndDate.get(i).getDateWaitlisted());    
                //If the entry is only in waitlist, it gets cancelled and the message is displayed
                break;
            }        
        }

        
        
        
        
        
        
        
        
        
          
        
        
        if(waitlistEntriesReturnedByFacultyAndDate.size() == 0) // However, if the entry exists in reservations, first it is  cancelled from the reservations
        {
            

        
            for (int i=0; i<reservationEntriesReturnedByFacultyAndDate.size();i++)
            {
                ReservationQueries.cancelReservationEntry(facultyName, deleteReservationDate, reservationEntriesReturnedByFacultyAndDate.get(i).getTimeStampRequested());
                displayStatusJLabel.setText(facultyName+ " gets cancelled from reservations for date "+ deleteReservationDate.toString());
                break;
                
            }
            
            //cancellation works only in the first run. After that even faculty not in either is getting cancelled from reservations and no waitlists left...
            // also for entries in the reservations, cancellation won't work like shows it is cancelled but is still there in reservations
            
            ArrayList<WaitlistEntry> allWaitlistEntriesReturned = WaitlistQueries.getAllWaitlists();

        
        
            if(allWaitlistEntriesReturned.size() == 0)
            {
                movedToReservationJLabel.setText("No waitlists found to accomodate! ");
            }
            
            // Then the waitlist is checked if they can be allotted the now empty room and if yes, it is removed from waitlist and added to reservations
            
            
            
            else
            {
                ArrayList<WaitlistEntry> waitlistEntriesReturnedBySeats = WaitlistQueries.getAllWaitlistsBySeats(seats);


                for(int i=0; i<waitlistEntriesReturnedBySeats.size();i++)
                {


                    WaitlistQueries.deleteWaitlistEntry(waitlistEntriesReturnedBySeats.get(i).getFacultyNameWaitlisted(), 
                            waitlistEntriesReturnedBySeats.get(i).getDateWaitlisted(), waitlistEntriesReturnedBySeats.get(i).getTimeStampWaitlisted());
                    
                    
                    ReservationQueries.addReservationEntry(waitlistEntriesReturnedBySeats.get(i).getFacultyNameWaitlisted(),
                            room,deleteReservationDate, waitlistEntriesReturnedBySeats.get(i).getSeatCapacityWaitlisted());


                    String nameReserved = waitlistEntriesReturnedBySeats.get(i).getFacultyNameWaitlisted();
                    movedToReservationJLabel.setText(nameReserved+ " is moved from waitlist and now reserves room "+room);
                    break;

                }

                
            }

            allWaitlistEntriesReturned.clear();
            
        }
        
        
        waitlistEntriesReturnedByFacultyAndDate.clear();
        reservationEntriesReturnedByFacultyAndDate.clear();

        
        
      // If it is it allowed for a faculty to reserve 2 different rooms on the same day. I am not sure since one room gets 
      //reserved completely for a day right so I don't think it makes sense if a faculty can reserve 2 rooms on the same day both for the whole day 
      
      // If yes, when you cancel the reservation for a day you don't know which one will be cancelled since both on the same day. 
      
      // Also, you need to check that same room is not given to 2 different faculties on the same day
      
      // Also see how reservations are being added with null value in the room
    }//GEN-LAST:event_cancelReservationJButtonActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void addNewDateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewDateJButtonActionPerformed
        
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd"); 
        String spinnerValue = formater.format(dateEntryByUserJSpinner.getValue());
        Date dayEntered = Date.valueOf(spinnerValue);
  
        Dates.addDate(dayEntered);
        
        dateAddedDisplayJLabel.setText(spinnerValue+" has been added to the system");
        
        rebuildDateComboBoxes();
        rebuildReservationsDateComboBoxes();
        
        
        // Simply add a new date to the Dates table in the format YYYY-MM-DD
        // Display that it was added in the system
    }//GEN-LAST:event_addNewDateJButtonActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    private void viewCompleteStatusJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCompleteStatusJButtonActionPerformed
        
        String faculty = (String) viewStatusFacultyNameComboBox.getSelectedItem();
        
        

   
        
        
        
        ArrayList <WaitlistEntry> waitlistsReturnedByFaculty = WaitlistQueries.getWaitlistByFaculty(faculty);   
        completeWaitlistStatusEntriesTextArea.append(null);
        completeWaitlistStatusEntriesTextArea.setText("\t\tWAITLISTS \n \n");
        
        if (waitlistsReturnedByFaculty.size() == 0)
        {
            completeWaitlistStatusEntriesTextArea.append("\t\tNo waitlists found!");   
        }
        
        
        
        else
        {
            for(int i=0;i<waitlistsReturnedByFaculty.size();i++)
            {
                completeWaitlistStatusEntriesTextArea.append("Waitisted for date " + waitlistsReturnedByFaculty.get(i).getDateWaitlisted()+" and requested "+
                    waitlistsReturnedByFaculty.get(i).getSeatCapacityWaitlisted()+" seats"+"\n");

            }
            waitlistsReturnedByFaculty.clear();
            
        }
        
        

        
        
        
        
        
        
        
        
        ArrayList <ReservationEntry> reservationsReturnedByFaculty= ReservationQueries.getAllReservationsByFaculty(faculty);        
        completeReservationStatusEntriesTextArea.append(null);
        completeReservationStatusEntriesTextArea.setText("\t\tRESERVATIONS \n \n");
        
        
        if(reservationsReturnedByFaculty.size() == 0)
        {
            completeReservationStatusEntriesTextArea.append("\t\tNo reservations found!");
            
        }
        
        
        else
        {
            for(int i=0;i<reservationsReturnedByFaculty.size();i++)
            {
                completeReservationStatusEntriesTextArea.append(reservationsReturnedByFaculty.get(i).getRoomNameRequested()+" reserved for date "
              +reservationsReturnedByFaculty.get(i).getDateRequested()+"\n");

            }
            reservationsReturnedByFaculty.clear();
            
        }


        
        
        

        
        
        // Just display on a panel that all the reservations and waitlists under that particular faculty member in the format
        // RoomName reserved for date Date1 and so on
        // RoomName waitlisted for date Date2 and so on
    }//GEN-LAST:event_viewCompleteStatusJButtonActionPerformed

    
    
    
    
    
    
    
                             
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RoomSchedulerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RoomSchedulerFrame().setVisible(true);
            }
        });
    }

    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFacultyNameButton;
    private javax.swing.JLabel addFacultyStatusLabel;
    private javax.swing.JLabel addFacultyStatusLabel1;
    private javax.swing.JLabel addFacultyStatusLabel2;
    private javax.swing.JTextField addFacultyTextField;
    private javax.swing.JButton addNewDateJButton;
    private javax.swing.JButton addNewRoomButton;
    private javax.swing.JTextField addNewRoomSeatsTextField;
    private javax.swing.JLabel addRoomStatusDisplayJPanel;
    private javax.swing.JTextArea addedToWaitlistJTextArea;
    private javax.swing.JComboBox<String> cancelReservationFacultyNameJComboBox;
    private javax.swing.JButton cancelReservationJButton;
    private javax.swing.JTextArea completeReservationStatusEntriesTextArea;
    private javax.swing.JTextArea completeWaitlistStatusEntriesTextArea;
    private javax.swing.JLabel dateAddedDisplayJLabel;
    private javax.swing.JLabel dateAddedJLabel;
    private javax.swing.JSpinner dateEntryByUserJSpinner;
    private javax.swing.JComboBox<String> deletingReservationDateJComboBox;
    private javax.swing.JLabel displayStatusJLabel;
    private javax.swing.JButton dropNewRoomButton;
    private javax.swing.JComboBox<String> findReservationsByDateComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea movedInformationJTextArea;
    private javax.swing.JLabel movedToReservationJLabel;
    private javax.swing.JLabel nameNotExisitingJLabel;
    private javax.swing.JTextField newRoomNameAddTextField;
    private javax.swing.JTextArea reservationsByDateTextArea;
    private javax.swing.JComboBox<String> reserveDateComboBox;
    private javax.swing.JComboBox<String> reserveFacultyNameComboBox;
    private javax.swing.JButton reserveReserveRoomButton;
    private javax.swing.JTextField reserveSeatsTextField;
    private javax.swing.JLabel reserveStatusLabel;
    private javax.swing.JLabel roomDroppedDisplayedJLabel;
    private javax.swing.JComboBox<String> roomNameDropJComboBox;
    private javax.swing.JTabbedPane roomSchedulerPanel;
    private javax.swing.JButton viewCompleteStatusJButton;
    private javax.swing.JComboBox<String> viewStatusFacultyNameComboBox;
    private javax.swing.JTextArea waitlistEntriesTextArea;
    private javax.swing.JTextArea waitlistStatusJTextArea;
    // End of variables declaration//GEN-END:variables
}





