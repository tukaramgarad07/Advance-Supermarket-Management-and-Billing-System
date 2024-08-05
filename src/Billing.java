
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Billing extends javax.swing.JFrame {

    public int finalTotal = 0;
    Connection con;

    
    public Billing() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (Exception ex) {
        }
        initComponents();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
        LocalDateTime now = LocalDateTime.now();
        jLabel6.setText(dtf.format(now));
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jLabel4.setText(dtf1.format(now));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 150));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing frame.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Billing ani.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 11, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Time :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 60, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 59, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Buyer Deatils :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 1144, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 168, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 165, 148, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Contact No :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 168, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 165, 148, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Email :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 168, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 165, 180, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Address :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 165, 221, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1144, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Product Details :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Product ID :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 272, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 272, 70, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Product Name :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 272, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 272, 154, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Rate :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 272, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 272, 100, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Description :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 272, -1, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 272, 150, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Enter Quantity :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 272, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 272, 70, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 349, 1144, 10));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Rate", "Quantity", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, 683, 180));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Calculation Details :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 365, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Total :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Paid Amount :");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Return Amount :");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 149, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 149, -1));

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 149, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 460, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 510, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 200, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 0, 0));
        jLabel23.setText("1001");
        jLabel23.setToolTipText("1001");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing background.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String name = jTextField1.getText();
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from buyer where Name like '" + name + "%'");
            if (rs.next()) {
                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
            } else {
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String id = jTextField5.getText();
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product where p_id='" + id + "'");
            if (rs.next()) {
                jTextField5.setText(rs.getString(1));
                jTextField6.setText(rs.getString(2));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText(rs.getString(4));

            } else {
                JOptionPane.showMessageDialog(null, "Product not exists..!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        jTextField9.requestFocus();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int price = Integer.parseInt(jTextField7.getText());
        int quantity = Integer.parseInt(jTextField9.getText());
        int total = price * quantity;
        String id = jTextField5.getText();
        String t_quantity;
        String t_quantity1;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select quantity from product where p_id='" + id + "'");
            if (rs.next()) {
                t_quantity = rs.getString(1);
                int q = Integer.parseInt(t_quantity) - quantity;
                t_quantity1 = String.valueOf(q);
                PreparedStatement st1 = con.prepareStatement("Update product set quantity=? where p_id=?");
                st1.setString(1, t_quantity1);
                st1.setString(2, id);
                int i = st1.executeUpdate();
                System.out.print(i);
            }

        } catch (Exception e) {
            System.out.print(e);
        }
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        model1.addRow(new Object[]{jTextField6.getText(), jTextField8.getText(), price, quantity, total});
        finalTotal = finalTotal + total;
        //String finalTotal1=String.valueOf(finalTotal);
        jTextField10.setText(String.valueOf(finalTotal));
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
        String paidamount = jTextField11.getText();
        int a = Integer.parseInt(paidamount);
        finalTotal = a - finalTotal;
        String finalTotal1 = String.valueOf(finalTotal);
        jTextField12.setText(finalTotal1);
        jTextField12.setEditable(false);

    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Billing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String name = jTextField1.getText();
        String ph_no = jTextField2.getText();
        String email = jTextField3.getText();
        String address = jTextField4.getText();

        try {
            /*Connection */
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
            PreparedStatement st = con.prepareStatement("insert into buyer values(?,?,?,?)");

            st.setString(1, name);
            st.setString(2, ph_no);
            st.setString(3, email);
            st.setString(4, address);

            int i = st.executeUpdate();
            if (i > 0) {
                System.out.println("Insertion successful...!");
            } else {
                System.out.println("Insertion unsuccessful...!");
            }
            JOptionPane.showMessageDialog(null, "BUYER Added");

        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
           jTextField2.requestFocus();

        }


    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jTextField4.requestFocus();

        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jTextField2.requestFocus();

        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jTextField5.requestFocus();

        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jTextField3.requestFocus();

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = jTextField1.getText();
            String ph_no = jTextField2.getText();
            
            String email = jTextField3.getText();
            String address = jTextField4.getText();

            try {
                /*Connection */
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
                PreparedStatement st = con.prepareStatement("insert into buyer values(?,?,?,?)");

                st.setString(1, name);
                st.setString(2, ph_no);
                st.setString(3, email);
                st.setString(4, address);

                int i = st.executeUpdate();
                if (i > 0) {
                    System.out.println("Insertion successful...!");
                } else {
                    System.out.println("Insertion unsuccessful...!");
                }
                JOptionPane.showMessageDialog(null, "BUYER Added");

            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }

        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_formKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m = (DefaultTableModel) jTable2.getModel();
        String quantity1;
        int dbquantity;
        try {
            int s = jTable2.getSelectedRow();
            String n = m.getValueAt(s, 0).toString();
            quantity1 = m.getValueAt(s, 3).toString();
            int price = Integer.parseInt(m.getValueAt(s, 2).toString());
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select quantity from product where p_name='" + n + "'");
            if (rs.next()) {
                dbquantity = Integer.parseInt(rs.getString(1));
            } else {
                dbquantity = 0;
            }
            dbquantity = dbquantity + Integer.parseInt(quantity1);
            int i = st.executeUpdate("update product set quantity=" + dbquantity + " where p_name='" + n + "'");
            System.out.print(dbquantity);
            finalTotal = Integer.parseInt(jTextField10.getText()) - (price * Integer.parseInt(quantity1));
            jTextField10.setText(String.valueOf(finalTotal));
            m.removeRow(s);
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String time, date, b_name, ph_no, email, total, billid;
        billid = jLabel23.getText();
        time = jLabel6.getText();
        date = jLabel4.getText();
        b_name = jTextField1.getText();
        ph_no = jTextField2.getText();
        System.out.print(ph_no);
        email = jTextField3.getText();
        total = jTextField10.getText();

        Object[][] tabledata = getTabledata(jTable2);
        new bill(billid, time, date, b_name, ph_no, email, total, tabledata).setVisible(true);
        setVisible(false);
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
            PreparedStatement st = con.prepareStatement("Insert into sales values(?,?,?,?,?)");

            st.setString(1, billid);
            st.setString(2, b_name);
            st.setString(3, ph_no);
            st.setString(4, total);
            st.setString(5, date);
            int i = st.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Bill Successfully Saved..!");
            } else {
                JOptionPane.showMessageDialog(null, "An error occured while saving bill..!");
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
            PreparedStatement st = con.prepareStatement("Select max(bill_id) from sales");
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                int bilid = rs.getInt(1);
                System.out.print(bilid);
                bilid = bilid + 1;
                String str = String.valueOf(bilid);
                jLabel23.setText(str);
            } else {
                jLabel23.setText("1001");
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }//GEN-LAST:event_formComponentShown

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int price = Integer.parseInt(jTextField7.getText());
            int quantity = Integer.parseInt(jTextField9.getText());
            int total = price * quantity;
            String id = jTextField5.getText();
            String t_quantity;
            String t_quantity1;
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/billing?zeroDateTimeBehavior=convertToNull", "root", "");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select quantity from product where p_id='" + id + "'");
                if (rs.next()) {
                    t_quantity = rs.getString(1);
                    int q = Integer.parseInt(t_quantity) - quantity;
                    t_quantity1 = String.valueOf(q);
                    PreparedStatement st1 = con.prepareStatement("Update product set quantity=? where p_id=?");
                    st1.setString(1, t_quantity1);
                    st1.setString(2, id);
                    int i = st1.executeUpdate();
                    System.out.print(i);
                }

            } catch (Exception e) {
                System.out.print(e);
            }
            DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
            model1.addRow(new Object[]{jTextField6.getText(), jTextField8.getText(), price, quantity, total});
            finalTotal = finalTotal + total;
            //String finalTotal1=String.valueOf(finalTotal);
            jTextField10.setText(String.valueOf(finalTotal));
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
        }

    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jTextField3.requestFocus();

        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jTextField1.requestFocus();

        }
    }//GEN-LAST:event_jTextField2KeyPressed
    public Object[][] getTabledata(JTable table) {
        TableModel dtm = table.getModel();
        int nrow = dtm.getRowCount();
        int ncol = dtm.getColumnCount();
        Object[][] tabledata = new Object[nrow][ncol];
        for (int i = 0; i < nrow; i++) {
            for (int j = 0; j < ncol; j++) {
                tabledata[i][j] = dtm.getValueAt(i, j);
            }
        }
        return tabledata;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
