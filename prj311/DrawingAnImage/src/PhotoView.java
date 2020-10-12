
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Vector;
import javax.swing.JFileChooser;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class PhotoView extends javax.swing.JFrame {

    boolean autoSlide = false;
    int rate = 0;
    BufferedImage currentImage = null;
    JFileChooser fChooser = new JFileChooser();
    Vector<String> list = new Vector<String>();
    int x = 10, y = 20;
    int imgIndex = -1;
    Graphics g = null;
    TimeThread timeCounter;

    class TimeThread extends Thread {

        @Override
        public void run() {
            imgIndex = lstFiles.getSelectedIndex();
            int n = lstFiles.getModel().getSize();
            if (n > 0 && autoSlide) {
                while (imgIndex < n) {
                    try {
                        loadImage();
                        showImage();
                        imgIndex++;
                        sleep(1000 * rate);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
        }
    }

    public PhotoView() {
        initComponents();
        this.setSize(1000, 600);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "GIF", "JPG", "JPEG", "PNG");
        fChooser.setFileFilter(filter);
        fChooser.setMultiSelectionEnabled(true);
        g = this.pView.getGraphics();
        this.sldRate.setEnabled(false);
        this.sldRate.setValue(1);
    }

    private void loadImage() {
        String filename = list.elementAt(imgIndex);
        try {
            currentImage = ImageIO.read(new File(filename));
        } catch (Exception e) {
            currentImage = null;
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void showImage() {
        if (currentImage != null) {
            g.clearRect(x, y, pView.getWidth() - x, pView.getHeight() - y);
            int imgWidth = currentImage.getWidth();
            int imgHeight = currentImage.getHeight();
            double ratio = 1.0 * imgWidth / imgHeight;
            int areaWidth = this.pView.getWidth() - 2 * x;
            int areaHeight = this.pView.getHeight() - 2 * y;
            if (imgWidth <= areaWidth && imgHeight <= areaHeight) {
                areaWidth = imgWidth;
                areaHeight = imgHeight;
            } else if (imgWidth > imgHeight) {
                if (imgWidth < areaWidth) {
                    areaWidth = imgWidth;
                }
                areaHeight = (int) (areaHeight / ratio);
            } else {
                if (imgHeight < areaHeight) {
                    areaHeight = imgHeight;
                }
                areaWidth = (int) (areaHeight * ratio);
            }
            g.drawImage(currentImage, x, y, areaWidth, areaHeight, this.pView);
        }
    }

    private void slidingImage() {
        timeCounter = new TimeThread();
        timeCounter.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        pControl = new javax.swing.JPanel();
        btnAddFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFiles = new javax.swing.JList(list);
        btnRemove = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        chkOnOff = new javax.swing.JCheckBox();
        sldRate = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        pView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);

        pControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Panel"));

        btnAddFile.setText("Add Image Files");
        btnAddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFileActionPerformed(evt);
            }
        });

        jLabel1.setText("Current Files");

        lstFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstFilesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstFiles);

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Auto Sliding"));

        jLabel2.setText("On/Off");

        chkOnOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkOnOffMouseClicked(evt);
            }
        });
        chkOnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOnOffActionPerformed(evt);
            }
        });

        sldRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldRateMouseReleased(evt);
            }
        });

        jLabel3.setText("seconds/image");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(chkOnOff)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
            .addComponent(sldRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkOnOff)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pControlLayout = new javax.swing.GroupLayout(pControl);
        pControl.setLayout(pControlLayout);
        pControlLayout.setHorizontalGroup(
            pControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAddFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pControlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(69, 82, Short.MAX_VALUE))
            .addGroup(pControlLayout.createSequentialGroup()
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pControlLayout.setVerticalGroup(
            pControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jSplitPane1.setLeftComponent(pControl);

        pView.setBorder(javax.swing.BorderFactory.createTitledBorder("View Panal"));

        javax.swing.GroupLayout pViewLayout = new javax.swing.GroupLayout(pView);
        pView.setLayout(pViewLayout);
        pViewLayout.setHorizontalGroup(
            pViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        pViewLayout.setVerticalGroup(
            pViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(pView);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkOnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOnOffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOnOffActionPerformed

    private void btnAddFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFileActionPerformed
        int returnVal = fChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = fChooser.getSelectedFiles();
            for (File f : files) {
                list.add(f.getAbsolutePath());
            }
            lstFiles.setSelectedIndex(0);
            this.lstFiles.updateUI();
        }
    }//GEN-LAST:event_btnAddFileActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int[] indices = lstFiles.getSelectedIndices();
        for (int i = indices.length - 1; i >= 0; i--) {
            list.removeElementAt(i);
        }
        lstFiles.updateUI();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        list.removeAllElements();
        lstFiles.updateUI();
    }//GEN-LAST:event_btnClearActionPerformed

    private void lstFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstFilesMouseClicked
        imgIndex = lstFiles.getSelectedIndex();
        this.loadImage();
        this.showImage();
    }//GEN-LAST:event_lstFilesMouseClicked

    private void chkOnOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkOnOffMouseClicked
        if (chkOnOff.isSelected() && lstFiles.getSelectedIndex() >= 0) {
            this.autoSlide = true;
            this.sldRate.setEnabled(true);
            this.rate = this.sldRate.getValue();
            slidingImage();
        } else {
            if (timeCounter != null) {
                timeCounter = null;
            }
            autoSlide = false;
            this.sldRate.setEnabled(false);
        }
    }//GEN-LAST:event_chkOnOffMouseClicked

    private void sldRateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldRateMouseReleased
        this.rate = sldRate.getValue();
    }//GEN-LAST:event_sldRateMouseReleased

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
            java.util.logging.Logger.getLogger(PhotoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhotoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhotoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhotoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhotoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFile;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JCheckBox chkOnOff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList<String> lstFiles;
    private javax.swing.JPanel pControl;
    private javax.swing.JPanel pView;
    private javax.swing.JSlider sldRate;
    // End of variables declaration//GEN-END:variables
}