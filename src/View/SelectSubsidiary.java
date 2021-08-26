package View;
import Controller.Visual;
import Model.Subsidiary;
import javax.swing.*;


/**
 *
 * @author paulo
 */
public class SelectSubsidiary extends javax.swing.JFrame {

    /**
     * Creates new form SelectSubsidiary
     */
    public SelectSubsidiary() {
        initComponents();
        for (Subsidiary subsidiary: Visual.getSubsidiaryList()) {
            l1.addElement(subsidiary.getDisplayName());
        }
        listSubsidiary.setModel(l1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        TitleSubisidiary = new javax.swing.JLabel();
        BackSubsidiary = new javax.swing.JButton();
        SearchSubsidiary = new javax.swing.JTextField();
        SearchNameSubsidiary = new javax.swing.JToggleButton();
        btnNextSelectSubsidiary = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSubsidiary = new javax.swing.JList<>();
        l1 = new DefaultListModel<>();


        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TitleSubisidiary.setText("Selecionar subisidaria");

        BackSubsidiary.setText("Sair");
        BackSubsidiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                dispose();
                Login.execute();
            }
        });

        SearchSubsidiary.setText("Buscar subisidiaria pelo nome");
        SearchSubsidiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSubsidiaryActionPerformed(evt);
            }
        });

        SearchNameSubsidiary.setText("Buscar");
        SearchNameSubsidiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNameSubsidiaryActionPerformed(evt);
            }
        });

        btnNextSelectSubsidiary.setText("Próximo");
        btnNextSelectSubsidiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               Subsidiary subsidiary = Visual.getSubisidiaryByDisplayName(listSubsidiary.getSelectedValue());
               if(subsidiary != null) {
                   Visual.setSubsidiary(subsidiary);
                   setVisible(false);
                   dispose();
                   Home.execute();
               }
            }
        });

        listSubsidiary.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listSubsidiary);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(288, 288, 288)
                                                .addComponent(TitleSubisidiary))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(BackSubsidiary)
                                                .addGap(522, 522, 522)
                                                .addComponent(btnNextSelectSubsidiary)))
                                .addGap(44, 44, 44))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SearchSubsidiary, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchNameSubsidiary)
                                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(TitleSubisidiary)
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SearchSubsidiary, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SearchNameSubsidiary))
                                .addGap(75, 75, 75)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BackSubsidiary)
                                        .addComponent(btnNextSelectSubsidiary))
                                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>

    private void SearchSubsidiaryActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnNextSelectSubsidiaryActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SearchNameSubsidiaryActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BackSubsidiaryActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    public static void execute() {
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
            java.util.logging.Logger.getLogger(SelectSubsidiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectSubsidiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectSubsidiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectSubsidiary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectSubsidiary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton BackSubsidiary;
    private javax.swing.JToggleButton SearchNameSubsidiary;
    private javax.swing.JTextField SearchSubsidiary;
    private javax.swing.JLabel TitleSubisidiary;
    private javax.swing.JButton btnNextSelectSubsidiary;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listSubsidiary;
    private DefaultListModel<String> l1;
    // End of variables declaration
}
