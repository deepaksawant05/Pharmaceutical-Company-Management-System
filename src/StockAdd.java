import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Color;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class StockAdd extends javax.swing.JFrame {
    public void clear()
    {
        
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        
    }

    /**
     * Creates new form StockAdd
     */
    public StockAdd() {
        initComponents();
        autoid();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    Connection con;
   PreparedStatement pst;
   DefaultTableModel df;
   
    @SuppressWarnings("unchecked")
    
    public void autoid()
    {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/pcm","root","");
             Statement s=con.createStatement();
             
             ResultSet rs=s.executeQuery("Select Max(id) from AddItem");
             rs.next();
             
             rs.getString("Max(id)");
             
             if(rs.getString("Max(id)")==null)
             {
                 jTextField1.setText("I001");
                 
             }
             else
             {
                 Long id=Long.parseLong(rs.getString("Max(id)").substring(2,rs.getString("Max(id)").length()));
                 id++;
                 jTextField1.setText("I0" + String.format("%02d",id));
             }
             
             
        }
        catch(ClassNotFoundException ex)
        {
          
        }
        catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AddWorker.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 90));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Item Code");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 89, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 131, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Unit of Measuremnt");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 177, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 91, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Reorder Level");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 134, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField1.setToolTipText("Enter ID");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 86, 187, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Enter Name of Item");
        jTextField2.setToolTipText("Enter Name of item");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 131, 292, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("Enter Unit of Measurement");
        jTextField3.setToolTipText("Eg.Box");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 174, 292, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setText("Enter Quantity of Item");
        jTextField4.setToolTipText("Eg.10,20,50");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 88, 292, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        jTextField5.setText("Enter Reorder Level of Item");
        jTextField5.setToolTipText("Eg.10,30");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 131, 292, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setToolTipText("Search by Item Code");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 84, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 234, -1, 34));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update & delete worker.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 229, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 229, -1, 38));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close all jframe.png"))); // NOI18N
        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 11, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 229, -1, 39));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add ItemOrder.jpg"))); // NOI18N
        jLabel6.setText("Add New Stock");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 21, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item Code", "Name", "Unit of Measurement", "Quantity", "Re-Order Level"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 402, 1033, 166));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 1033, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Generate Report.png"))); // NOI18N
        jLabel7.setText("Details of Spare Parts");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 323, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jLabel8.setText("Search");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 361, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setText("Enter Name of Item");
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 359, 232, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StockAddBG.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        String name=jTextField2.getText();
        String description=jTextField3.getText();
        String item_unit=jTextField4.getText();
        String reorder=jTextField5.getText();
        try
        {
           
            Connection con=ConnectionProvider.getcon();
            PreparedStatement ps=con.prepareStatement("insert into AddItem values(?,?,?,?,?)");
            
            ps.setString(1,id);
            ps.setString(2,name);
            ps.setString(3,description);
            ps.setString(4,item_unit);
            ps.setString(5,reorder);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Saved");
            setVisible(false);
            new StockAdd().setVisible(true);
            autoid();
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        if(jTextField3.getText().equals("Enter Unit of Measurement"))
        {
            jTextField3.setText("");
            jTextField3.setForeground(new Color(0,0,0));
        }
       
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        if(jTextField3.getText().equals(""))
        {
            jTextField3.setText("Enter Unit of Measurement");
            jTextField3.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        if(jTextField4.getText().equals("Enter Quantity of Item"))
        {
            jTextField4.setText("");
            jTextField4.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        if(jTextField4.getText().equals(""))
        {
            jTextField4.setText("Enter Quantity of Item");
            jTextField4.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
        if(jTextField5.getText().equals("Enter Reorder Level of Item"))
        {
            jTextField5.setText("");
            jTextField5.setForeground(new Color(0,0,0));
        }
        
        
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // TODO add your handling code here:
        if(jTextField5.getText().equals(""))
        {
            jTextField5.setText("Enter Reorder Level of Item");
            jTextField5.setForeground(new Color(153,153,153));
        }
        
        
    }//GEN-LAST:event_jTextField5FocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        try
        {
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            st.executeUpdate("delete from AddItem where id='"+id+"'");
            JOptionPane.showMessageDialog(null,"Successfully Deleted");
            setVisible(false);
            new StockAdd().setVisible(true);
            autoid();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        try
        {
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from AddItem where id='"+id+"'");
            if(rs.first())
            {
                jTextField1.setEditable(true);
                jTextField2.setText(rs.getString(2));
                jTextField2.setForeground(new Color(0,0,0));
                jTextField3.setText(rs.getString(3));
                jTextField3.setForeground(new Color(0,0,0));
                jTextField4.setText(rs.getString(4));
                jTextField4.setForeground(new Color(0,0,0));
                jTextField5.setText(rs.getString(5));
                jTextField5.setForeground(new Color(0,0,0));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"This item does not exist");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        String name=jTextField2.getText();
        String unit=jTextField3.getText();
        String quantity=jTextField4.getText();
        String reorder=jTextField5.getText();
        try
        {
            Connection con=ConnectionProvider.getcon();
            PreparedStatement ps=con.prepareStatement("update AddItem set name=?,unit=?,quantity=?,reorder=? where id=?");
            ps.setString(1,name);
            ps.setString(2,unit);
            ps.setString(3,quantity);
            ps.setString(4,reorder);
            ps.setString(5,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
            new StockAdd().setVisible(true);
            autoid();
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StockAdd().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        if(jTextField2.getText().equals("Enter Name of Item"))
        {
            jTextField2.setText("");
            jTextField2.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        if(jTextField2.getText().equals(""))
        {
            jTextField2.setText("Enter Name of Item");
            jTextField2.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
        {
            jTextField2.setEditable(true);
        }
        else
        {
            jTextField2.setEditable(false);
            JOptionPane.showMessageDialog(null,"Invalid input!,Please type characters only","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
        {
            jTextField3.setEditable(true);
        }
        else
        {
            jTextField3.setEditable(false);
            JOptionPane.showMessageDialog(null,"Invalid input!,Please type characters only","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            jTextField4.setEditable(false);
            JOptionPane.showMessageDialog(null,"Invalid input!,Please type numbers only","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            jTextField4.setEditable(true);
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c))
        {
            jTextField5.setEditable(false);
            JOptionPane.showMessageDialog(null,"Invalid input!,Please type numbers only","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            jTextField5.setEditable(true);
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try
        {
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from additem");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_formComponentShown

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
        if(jTextField6.getText().equals("Enter Name of Item"))
        {
            jTextField6.setText("");
            jTextField6.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
        if(jTextField6.getText().equals(""))
        {
            jTextField6.setText("Enter Name of Item");
            jTextField6.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField6.getText().trim()));
        
    }//GEN-LAST:event_jTextField6KeyPressed

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
            java.util.logging.Logger.getLogger(StockAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockAdd().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
