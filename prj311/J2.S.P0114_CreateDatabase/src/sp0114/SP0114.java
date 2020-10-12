package sp0114;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.HashSet;
import java.util.Vector;
/**
 *
 * @author PC
 */
public class SP0114 extends javax.swing.JFrame {

    DefaultTableModel dftb;
    HashSet hs;
    public SP0114() {
        initComponents();
        dftb = new DefaultTableModel();
        hs = new HashSet();
    }
        public void createDB() {
            String sql = "if not exists (select 1 from sys.databases where name = N'FU_DB') create database FU_DB";
        try {
            DBInfo dbContext = new DBInfo();
            Connection connection = dbContext.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            connection.close();
            lbNote.setText("Create database success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        String sql = "use[FU_DB];\n"
                + "if not exists (select * from sysobjects where name='Stocks' and xtype='U')\n"
                + "create table Stocks(\n"
                + "StockID int primary key,\n"
                + "StockName nvarchar(30),\n"
                + "[Address] nvarchar(45),\n"
                + "DateAvailable DATE,\n"
                + "Note nvarchar(45)\n"
                + ")";
        try {
            DBInfo dbContext = new DBInfo();
            Connection connection = dbContext.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
            connection.close();
            lbNote.setText("Create table success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    

    public void insertData() {
        String sql = "use[FU_DB];\n"
                + "BEGIN\n"
                + "INSERT dbo.Stocks(StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(1, N'Stock one', N'No1 - Wasington', '2010/05/11', N'')\n"
                + "INSERT dbo.Stocks(StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(2, N'Stock two', N'372 Cave town', '2011/09/07', N'')\n"
                + "INSERT dbo.Stocks(StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(3, N'Stock three', N'Nary angle - 890', '2010/05/13', N'Store dangerous')\n"
                + "INSERT dbo.Stocks( StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(4, N'Stock four', N'Twin tower - 01', '2015/07/04', N'')\n"
                + "INSERT dbo.Stocks(StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(5, N'Stock five', N'Victory anniversary', '2014/12/08', N'')"
                + "\n end";
        try {
            DBInfo dbContext = new DBInfo();
            Connection connection = dbContext.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
            connection.close();
            lbNote.setText("Insert data success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayData() {
        try {
            String sql ="use [FU_DB];\n"
                    +"SELECT * FROM dbo.Stocks";
            DBInfo dbContext = new DBInfo();
            Connection connection = dbContext.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sql);
            ResultSet rs = statement.getResultSet();
            Object[] title = {"StockID", "StockName", "Address", "DateAvailable", "Note"};
            dftb.setColumnIdentifiers(title);
            dftb.setRowCount(0);
            hs.clear();
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString(1));
                hs.add(rs.getString(1));
                vector.add(rs.getString(2));
                vector.add(rs.getString(3));
                vector.add(rs.getString(4));
                vector.add(rs.getString(5));
                dftb.addRow(vector);
            }
            jTable1.setModel(dftb);
            lbNote.setText("Display data success");
        } catch (Exception e) {
            e.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CreateDB = new javax.swing.JButton();
        CreateTable = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        lbNote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        CreateDB.setText("CreateDB");
        CreateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDBActionPerformed(evt);
            }
        });

        CreateTable.setText("Create table");
        CreateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTableActionPerformed(evt);
            }
        });

        Insert.setText("Insert Data");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Display.setText("Display Data");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        lbNote.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateDB)
                        .addGap(18, 18, 18)
                        .addComponent(CreateTable)
                        .addGap(18, 18, 18)
                        .addComponent(Insert)
                        .addGap(18, 18, 18)
                        .addComponent(Display)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNote, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateDB)
                    .addComponent(CreateTable)
                    .addComponent(Insert)
                    .addComponent(Display))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateDBActionPerformed
        createDB();
    }//GEN-LAST:event_CreateDBActionPerformed

    private void CreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTableActionPerformed
        createTable();
    }//GEN-LAST:event_CreateTableActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        insertData();
    }//GEN-LAST:event_InsertActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        displayData();
    }//GEN-LAST:event_DisplayActionPerformed

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
            java.util.logging.Logger.getLogger(SP0114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SP0114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SP0114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SP0114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SP0114().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateDB;
    private javax.swing.JButton CreateTable;
    private javax.swing.JButton Display;
    private javax.swing.JButton Insert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNote;
    // End of variables declaration//GEN-END:variables
}