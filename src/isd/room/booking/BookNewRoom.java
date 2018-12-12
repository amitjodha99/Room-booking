/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isd.room.booking;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class BookNewRoom extends javax.swing.JFrame {
    private User user = null;
    private DbHelper db = null;
    private Search s = null;
    private DefaultTableModel model = null;
    
    /**
     * Creates new form BookNewRoom
     */
    public BookNewRoom() {
        initComponents();
    }
    
    public BookNewRoom(User u) {
        initComponents();
        this.model = (DefaultTableModel) avail.getModel();
        getContentPane().setBackground(new java.awt.Color( 102 , 204 , 0 ));
        this.user = u;
        db = new DbHelper();
        showRooms();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtype = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        datepick = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        avail = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cap = new javax.swing.JSpinner();
        fromhh = new javax.swing.JSpinner();
        frommm = new javax.swing.JSpinner();
        tohh = new javax.swing.JSpinner();
        tomm = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        notice1 = new javax.swing.JLabel();
        notice2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LTs", "Acadamic", "Non-Acadamic" }));
        rtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtypeActionPerformed(evt);
            }
        });

        jLabel1.setText("Select room type");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Book a Room");

        jLabel3.setText("Capacity required");

        jLabel4.setText("Date ");

        datepick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datepickActionPerformed(evt);
            }
        });

        jLabel5.setText("Time");

        jLabel6.setText("To");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        avail.setBackground(new java.awt.Color(102, 204, 0));
        avail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room Name", "Capacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(avail);

        jButton2.setText("Confirm Booking");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cap.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 25));

        fromhh.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        frommm.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 5));

        tohh.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        tomm.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 5));

        jLabel7.setText(":");

        jLabel8.setText(":");

        notice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        notice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(datepick, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(rtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel3)
                                        .addGap(43, 43, 43)
                                        .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(fromhh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(48, 48, 48))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(frommm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(26, 26, 26)))
                                .addComponent(tohh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tomm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(notice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton3)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(datepick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(fromhh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frommm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tohh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tomm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(notice1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(notice2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rtypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        model.setRowCount(0);
        String msg1 = null;
        String type = (String) rtype.getSelectedItem();
        int capacity = (int) cap.getValue();
        SimpleDateFormat formatter = null;
        String date = null;
        Date d = null;
        Calendar c = Calendar.getInstance();
        int dayofweek;

        try {
            d = datepick.getDate();
            formatter = new SimpleDateFormat("yyyy/MM/dd");            
            date = formatter.format(d);
            Date cd = new Date();
            String curDate = formatter.format(cd);
            c.setTime(d);
            dayofweek = c.get(Calendar.DAY_OF_WEEK);

            if(d.compareTo(cd) <= 0) {
                msg1 = "Please select a date after " + formatter.format(cd);
                notice1.setText(msg1);
                return;
            } 
        }
        catch (NullPointerException ex) {
            msg1 = "Input date is invalid";
            notice1.setText(msg1);
            return;
        }
        
        int fhh = (int) fromhh.getValue();
        int fmm = (int) frommm.getValue();
        int thh = (int) tohh.getValue();
        int tmm = (int) tomm.getValue();
        String sfhh, sfmm, sthh, stmm;
        
        if(fhh < 10)
            sfhh = "0" + fhh;
        else
            sfhh = "" + fhh;
        
        if(fmm < 10)
            sfmm = "0" + fmm;
        else
            sfmm = "" + fmm;
        
        if(thh < 10)
            sthh = "0" + thh;
        else
            sthh = "" + thh;
        
        if(tmm < 10)
            stmm = "0" + tmm;
        else
            stmm = "" + tmm;
                
        String from_time = sfhh + ":" + sfmm + ":00";
        String to_time = sthh + ":" + stmm + ":00";
        
        if(capacity <= 0) {
            msg1 = "Capacity must be greater than zero";
        }
        else if(fhh<0 || fhh>23 || fmm<0 || fmm>59 || thh<0 || thh>23 || tmm<0 || tmm>59) {
            msg1 = "Input time is incorrect";
        }
        else if(fhh > thh || (fhh == thh && fmm >= tmm)) {
            msg1 = "Input time is incorrect";
        }
        else if(((rtype.getSelectedIndex()==0 || rtype.getSelectedIndex()==1) && (dayofweek >1 && dayofweek<7)) && (fhh < 18 && thh >= 8)) {
            // Time must not inlude 8:00AM to 6:00PM for Acadamic and LTs on weekdays
            
            msg1 = "This is class timing. you may not book now";
            
        }
        else {
            s = new Search(type, capacity, date, from_time, to_time);
            msg1 = showRooms(s);
        }
        
        notice1.setText(msg1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StudentWelcome st = null;
        try {
            st = new StudentWelcome(user);
        } catch (SQLException ex) {
            Logger.getLogger(BookNewRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        st.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = avail.getSelectedRow();
        Booking b = null;
        String msg2 = null;
        
        if(i == -1) {
            msg2 = "Please select the room you want to book";
        }
        else if(s == null) {
            msg2 = "Please search for a room first";
        }
        else {
            try {
                int req_id = db.lastRequest();
                String room_id = (String) avail.getValueAt(i, 0);
                b = new Booking(req_id, room_id, user.getUid(), s.date, s.from_time, s.to_time);
                
                db.addBooking(b);
                msg2 = "Room booked successfully";
                showRooms();
            }
            catch (SQLException ex) {
                System.out.println("hello");
                Logger.getLogger(StudentWelcome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        notice2.setText(msg2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void datepickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datepickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datepickActionPerformed
    
    private String showRooms(Search s) {
        String msg1 = null;
        
        try {
            ResultSet rs = db.searchRoom(s);
            rs.last();
            
            if(rs.getRow() == 0) {
                msg1 = "No rooms available! Try changing input";
            }
            else {
                rs.beforeFirst();
                
                while(rs.next())
                    model.addRow(new Object[]{rs.getString("room_id"), rs.getString("name"), rs.getInt("capacity")});
                msg1 = "Please selct a room from the below list and click Confirm Booking";
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return msg1;
    }

    private void showRooms() {
        DefaultTableModel model = (DefaultTableModel) avail.getModel();
        avail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        model.setRowCount(0);
    }
    
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
            java.util.logging.Logger.getLogger(BookNewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookNewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookNewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookNewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookNewRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable avail;
    private javax.swing.JSpinner cap;
    private org.jdesktop.swingx.JXDatePicker datepick;
    private javax.swing.JSpinner fromhh;
    private javax.swing.JSpinner frommm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel notice1;
    private javax.swing.JLabel notice2;
    private javax.swing.JComboBox<String> rtype;
    private javax.swing.JSpinner tohh;
    private javax.swing.JSpinner tomm;
    // End of variables declaration//GEN-END:variables

}
