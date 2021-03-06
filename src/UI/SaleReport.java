/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Database.*;

import Models.salesrecord;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;


public class SaleReport extends javax.swing.JInternalFrame {

        DatabaseConnection dbcon = new DatabaseConnection();
    /**
     * Creates new form AboutUs
     */
    public SaleReport() {
        
        initComponents();
        show_users_in_JTable();
         
    }
      public ArrayList<salesrecord> saleslist()
    {
        ArrayList<salesrecord> saleslist = new ArrayList<salesrecord>();
        
        String query = "SELECT * FROM `purchases`";
             Connection con = dbcon.getConnection();
                
             try {
           
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            salesrecord sales;
            
            while (rs.next())
            {
            sales = new salesrecord(rs.getInt("prodID"),rs.getString("address"),rs.getString("buyerName"),rs.getInt("postal"),
            rs.getString("brand"),rs.getString("date"),rs.getString("batchNO"),rs.getString("quantity"),rs.getString("branch"),rs.getString("email"));
            saleslist.add(sales);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
   
                return saleslist;
    }
       public void show_users_in_JTable()
    {
    ArrayList<salesrecord> list =saleslist();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    Object [] row = new Object[10];
    for(int i=0; i< list.size(); i++)
    {
        row[0] = list.get(i).getProdID();
        row[1] = list.get(i).getBuyerName();
        row[2] = list.get(i).getAddress();
        row[3] = list.get(i).getPostal();
        row[4] = list.get(i).getBrand();
        row[5] = list.get(i).getDate();
        row[6] = list.get(i).getBatchNo();
        row[7] = list.get(i).getQuantity();
        row[8] = list.get(i).getBranch();
        row[9] =list.get(i).getEmail();
        model.addRow(row);
    
    }}/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        region = new javax.swing.JComboBox<String>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdisplay = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("UserAccount");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("FILL IN THE FORM TO GENERATE SALES REPORTS");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 0));
        jLabel4.setText("Region");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 0));
        jLabel7.setText("Results");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("GenerateSalesReports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jToggleButton1.setText("Cancel");

        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        region.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kandy", "Colombo", "Matale" }));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil_eraser_48px.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("CLEAR");

        jTable1.setBackground(new java.awt.Color(0, 0, 51));
        jTable1.setForeground(new java.awt.Color(102, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "prodID", "buyerName", "address", "postal", "brand", "date", "batchNo", "quantity", "branch", "email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setMaximumSize(new java.awt.Dimension(800, 0));
        jScrollPane1.setViewportView(jTable1);

        txtdisplay.setColumns(20);
        txtdisplay.setRows(5);
        jScrollPane2.setViewportView(txtdisplay);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButton3)
                .addGap(221, 221, 221)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addComponent(region, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                        .addGap(786, 786, 786))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jToggleButton1))
                        .addGap(127, 127, 127))))
        );

        jTabbedPane1.addTab("GenerateSalesReports", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getAccessibleContext().setAccessibleName("UserAcount");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: txtUserName.setText("");
        
        
        
        
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String branch = region.getSelectedItem().toString();
   
          Connection con = dbcon.getConnection();
          System.out.println("WORKING 1");
        try{
             String query = "SELECT `prodID`, `buyerName`, `address`, `postal`, `brand`, `date`, `batchNo`, `quantity`, `branch`, `email` FROM `purchases` WHERE branch ='"+branch+"'";
            
            Statement st = con.createStatement();
                     System.out.println("WORKING 2");
            ResultSet rs = st.executeQuery(query);
                     System.out.println("WORKING 3");
            salesrecord sales;
            
           while (rs.next())
            {
            
              
                   int id = rs.getInt("prodID");
                   String address = rs.getString("address");
                   String name = rs.getString("buyerName");
                   String postal = rs.getString("postal");
                   String brand = rs.getString("brand");
                   String date = rs.getString("date");
                   String batchNO = rs.getString("batchNO");
                   String quantity = rs.getString("quantity");
                   String Branch = rs.getString("branch");
                   String email = rs.getString("email");
                   
                   txtdisplay.setText("PRODUCT ID-:"+id+" \nAdress-:"+address+"\nName-:"+name+"\npostal-:"+postal+"\nBrand-:"+brand+""
                           + "\nDATE-:"+date+"\nBatch No-:"+batchNO+"\n Quantity-:"+quantity+" \nBranch-:"+Branch+"\nEmail-:"+email);
                                     System.out.println("WORKING 4");      
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
                  
        

    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

 try{ 
        DefaultTableModel tableModel= (DefaultTableModel)jTable1.getModel();
        HashMap<String, Object> para = new HashMap<>();
        para.put("","");
        JasperPrint jasperPrint = null;
        JasperCompileManager.compileReportToFile("C:\\Users\\hp\\Desktop\\Velo\\src\\Service\\salesreport.jrxml");
        jasperPrint= JasperFillManager.fillReport("C:\\Users\\hp\\Desktop\\Velo\\src\\Service\\salesreport.jasper",para,new JRTableModelDataSource(tableModel));
        JasperViewer.viewReport(jasperPrint,false);
       }
       catch(Exception e)
       {
       JOptionPane.showMessageDialog(rootPane,e);
       }        


// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> region;
    private javax.swing.JTextArea txtdisplay;
    // End of variables declaration//GEN-END:variables

   
}
