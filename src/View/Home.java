package View;

import Controller.Visual;
import javax.swing.*;

/**
 *
 * @author paulo
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Home() {
        initComponents();
        lblRiskLevel.setText(Visual.getRiskLevel(Visual.getSubsidiary()));
        lblInfectedAmount.setText(String.valueOf(Visual.getTotalInfecteds(Visual.getSubsidiary())));
        lblVaccinateAmount.setText(String.valueOf(Visual.getTotalImmunizeds(Visual.getSubsidiary())));
        lblRecommendDecisions.setText(Visual.isRecommendedMeasures(Visual.getSubsidiary()));
        lblPresencialEmployee.setText(String.valueOf(Visual.getTotalPresential(Visual.getSubsidiary())));
        lblHibridEmployee.setText(String.valueOf(Visual.getTotalHybrid(Visual.getSubsidiary())));
        lblHomeEmployee.setText(String.valueOf(Visual.getTotalHomeOffice(Visual.getSubsidiary())));
        lblTotalEmployee.setText(String.valueOf(Visual.getTotalEmployees(Visual.getSubsidiary())));
        jLabel1.setText(Visual.getSubsidiary().getFantasyName());
        jLabel2.setText(Visual.getSubsidiary().getDisplayName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblRiskLevel = new javax.swing.JLabel();
        lblInfectedAmount = new javax.swing.JLabel();
        lblVaccinateAmount = new javax.swing.JLabel();
        lblRecommendDecisions = new javax.swing.JLabel();
        lblPresencialEmployee = new javax.swing.JLabel();
        lblHibridEmployee = new javax.swing.JLabel();
        lblHomeEmployee = new javax.swing.JLabel();
        lblTotalEmployee = new javax.swing.JLabel();
        btnManagerEmail = new javax.swing.JButton();
        btnManagerEmployee = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnSetJob = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome da empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Subsidiaria");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Nível de Risco:");

        jLabel4.setText("Quantidade de Infectados:");

        jLabel5.setText("Quantidade de Vacinados:");

        jLabel6.setText("Recomendado medidas:");

        jLabel7.setText("Funcionários em Regime Presencial:");

        jLabel8.setText("Funcionários em Regime Híbrido:");

        jLabel9.setText("Funcionários em Regime HomeOfiice:");

        jLabel10.setText("Total de Funcionários:");

        lblRiskLevel.setText("lblRiskLevel");
        lblRiskLevel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lblRiskLevelComponentAdded(evt);
            }
        });

        lblInfectedAmount.setText("lblInfectedAmount");

        lblVaccinateAmount.setText("lblVaccinateAmount");

        lblRecommendDecisions.setText("lblRecommendDecisions");

        lblPresencialEmployee.setText("lblPresencialEmployee");

        lblHibridEmployee.setText("lblHibridEmployee");

        lblHomeEmployee.setText("lblHomeEmployee");

        lblTotalEmployee.setText("lblTotalEmployee");

        btnManagerEmail.setText("Gerenciar e-mails");
        btnManagerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerEmailActionPerformed(evt);
            }
        });

        btnManagerEmployee.setText("Gerenciar Funcionários");
        btnManagerEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerEmployeeActionPerformed(evt);
            }
        });

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnSetJob.setText("Definir modo de trabalho");
        btnSetJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetJobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnManagerEmployee)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnManagerEmail)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSetJob)
                                                .addGap(160, 160, 160))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addGap(320, 320, 320))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblRecommendDecisions, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblVaccinateAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblInfectedAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblRiskLevel, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(90, 90, 90)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTotalEmployee, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblHomeEmployee, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblHibridEmployee, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblPresencialEmployee, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel3)
                                                        .addComponent(lblRiskLevel))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel4)
                                                        .addComponent(lblInfectedAmount))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel5)
                                                        .addComponent(lblVaccinateAmount))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel6)
                                                        .addComponent(lblRecommendDecisions))
                                                .addGap(72, 72, 72)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnManagerEmployee)
                                                        .addComponent(btnManagerEmail)
                                                        .addComponent(btnSetJob))
                                                .addGap(47, 47, 47)
                                                .addComponent(jButton3)
                                                .addGap(31, 31, 31))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel7)
                                                        .addComponent(lblPresencialEmployee))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel8)
                                                        .addComponent(lblHibridEmployee))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel9)
                                                        .addComponent(lblHomeEmployee))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(jLabel10)
                                                        .addComponent(lblTotalEmployee))
                                                .addContainerGap())))
        );

        pack();
    }// </editor-fold>

    private void btnManagerEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void lblRiskLevelComponentAdded(java.awt.event.ContainerEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnManagerEmailActionPerformed(java.awt.event.ActionEvent evt) {
            setVisible(false);
            dispose();
            Alerts.execute();
    }

    private void btnSetJobActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    public static void execute() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View.Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnManagerEmail;
    private javax.swing.JButton btnManagerEmployee;
    private javax.swing.JButton btnSetJob;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHibridEmployee;
    private javax.swing.JLabel lblHomeEmployee;
    private javax.swing.JLabel lblInfectedAmount;
    private javax.swing.JLabel lblPresencialEmployee;
    private javax.swing.JLabel lblRecommendDecisions;
    private javax.swing.JLabel lblRiskLevel;
    private javax.swing.JLabel lblTotalEmployee;
    private javax.swing.JLabel lblVaccinateAmount;
    // End of variables declaration
}

