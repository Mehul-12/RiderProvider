package vehler;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class MyRides extends javax.swing.JFrame {

    /**
     * Creates new form MyRides
     */
    private String username,pname;
    public MyRides()
    {
        
    }
    public MyRides(String username,String pname) {
        initComponents();
       
         this.username=username;
         this.pname=pname;
        ResultSet rst;
        try{
            Passenger p = new Passenger();
            
        rst=p.PassengerRide(username);
        myRidesTable.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Passenger CheckOut Error");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        bookRideButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removeVehicleButton = new javax.swing.JPanel();
        addVehicleButton5 = new javax.swing.JPanel();
        myRidesButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        busRidesButton = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myRidesTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        xpanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ypanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("RiderProvider");

        bookRideButton.setBackground(new java.awt.Color(51, 0, 102));
        bookRideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookRideButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookRideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookRideButtonMouseExited(evt);
            }
        });
        bookRideButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Book Ride");
        bookRideButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Add_Key_25px.png"))); // NOI18N
        bookRideButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        removeVehicleButton.setBackground(new java.awt.Color(51, 0, 102));
        removeVehicleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeVehicleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeVehicleButtonMouseExited(evt);
            }
        });
        removeVehicleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addVehicleButton5.setBackground(new java.awt.Color(51, 0, 102));
        addVehicleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addVehicleButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addVehicleButton5MouseExited(evt);
            }
        });
        addVehicleButton5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        removeVehicleButton.add(addVehicleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        myRidesButton.setBackground(new java.awt.Color(51, 0, 102));
        myRidesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myRidesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myRidesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myRidesButtonMouseExited(evt);
            }
        });
        myRidesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("My Rides");
        myRidesButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Present_25px_1.png"))); // NOI18N
        myRidesButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        busRidesButton.setBackground(new java.awt.Color(51, 0, 102));
        busRidesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busRidesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                busRidesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                busRidesButtonMouseExited(evt);
            }
        });
        busRidesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Bus Rides");
        busRidesButton.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Bus_25px.png"))); // NOI18N
        busRidesButton.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        logOutButton.setBackground(new java.awt.Color(51, 0, 102));
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
            }
        });
        logOutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Log Out");
        logOutButton.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Logout_Rounded_Up_25px.png"))); // NOI18N
        logOutButton.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookRideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(removeVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(busRidesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(myRidesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(bookRideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(myRidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(busRidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 646));

        myRidesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "DriverUsername", "DriverName", "Contact", "VehiclePlateNo", "VehicleName", "From", "To", "StartTime", "EndTime", "RideStatus", "BillStatus", "Bill"
            }
        ));
        myRidesTable.setSelectionBackground(new java.awt.Color(51, 0, 102));
        jScrollPane1.setViewportView(myRidesTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 1130, 310));

        jPanel4.setOpaque(false);

        xpanel.setBackground(new java.awt.Color(255, 255, 255));
        xpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xpanelMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("X");

        javax.swing.GroupLayout xpanelLayout = new javax.swing.GroupLayout(xpanel);
        xpanel.setLayout(xpanelLayout);
        xpanelLayout.setHorizontalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        xpanelLayout.setVerticalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ypanel.setBackground(new java.awt.Color(255, 255, 255));
        ypanel.setForeground(new java.awt.Color(255, 255, 255));
        ypanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ypanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ypanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ypanelMouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("-");

        javax.swing.GroupLayout ypanelLayout = new javax.swing.GroupLayout(ypanel);
        ypanel.setLayout(ypanelLayout);
        ypanelLayout.setHorizontalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        ypanelLayout.setVerticalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(ypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 102));
        jLabel11.setText("Here's list of our Rides");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 122, 330, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1567, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1567, 645));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        // TODO add your handling code here:
        logOutButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_logOutButtonMouseExited

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        // TODO add your handling code here:
        logOutButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        // TODO add your handling code here:
        LoginMain lm=new LoginMain();
        this.setVisible(false);
        lm.setVisible(true);
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void busRidesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busRidesButtonMouseExited
        // TODO add your handling code here:
        busRidesButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_busRidesButtonMouseExited

    private void busRidesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busRidesButtonMouseEntered
        // TODO add your handling code here:
        busRidesButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_busRidesButtonMouseEntered

    private void busRidesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busRidesButtonMouseClicked
        // TODO add your handling code here:
        PassengerBusRides pbr=new PassengerBusRides(username,pname);
        this.setVisible(false);
        pbr.setVisible(true);
    }//GEN-LAST:event_busRidesButtonMouseClicked

    private void myRidesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRidesButtonMouseExited
        // TODO add your handling code here:
        myRidesButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_myRidesButtonMouseExited

    private void myRidesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRidesButtonMouseEntered
        // TODO add your handling code here:
        myRidesButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_myRidesButtonMouseEntered

    private void myRidesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRidesButtonMouseClicked
        // TODO add your handling code here:
//        MyRides mr=new MyRides(username);
//        this.setVisible(false);
//        mr.setVisible(true);
    }//GEN-LAST:event_myRidesButtonMouseClicked

    private void removeVehicleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButtonMouseExited
        // TODO add your handling code here:
        removeVehicleButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_removeVehicleButtonMouseExited

    private void removeVehicleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButtonMouseEntered
        // TODO add your handling code here:
        removeVehicleButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_removeVehicleButtonMouseEntered

    private void addVehicleButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton5MouseExited

    private void addVehicleButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton5MouseEntered

    private void bookRideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRideButtonMouseExited
        // TODO add your handling code here:
        bookRideButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_bookRideButtonMouseExited

    private void bookRideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRideButtonMouseEntered
        // TODO add your handling code here:
        bookRideButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_bookRideButtonMouseEntered

    private void bookRideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRideButtonMouseClicked
        // TODO add your handling code here:
                BookRide br=new BookRide(username,pname);
                this.setVisible(false);
                br.setVisible(true);
    }//GEN-LAST:event_bookRideButtonMouseClicked

    private void xpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_xpanelMouseClicked

    private void xpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseEntered
        // TODO add your handling code here:
        xpanel.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_xpanelMouseEntered

    private void xpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseExited
        // TODO add your handling code here:
        xpanel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_xpanelMouseExited

    private void ypanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseClicked
        // TODO add your handling code here:
        setState(MyRides.ICONIFIED);
    }//GEN-LAST:event_ypanelMouseClicked

    private void ypanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseEntered
        // TODO add your handling code here:
        ypanel.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_ypanelMouseEntered

    private void ypanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseExited
        // TODO add your handling code here:
        ypanel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_ypanelMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyRides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyRides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyRides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyRides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyRides().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addVehicleButton5;
    private javax.swing.JPanel bookRideButton;
    private javax.swing.JPanel busRidesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JPanel myRidesButton;
    private javax.swing.JTable myRidesTable;
    private javax.swing.JPanel removeVehicleButton;
    private javax.swing.JPanel xpanel;
    private javax.swing.JPanel ypanel;
    // End of variables declaration//GEN-END:variables
}
