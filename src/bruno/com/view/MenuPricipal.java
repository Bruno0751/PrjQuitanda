//PROJECT NAME: prjBruno-quitanda
package bruno.com.view;

import bruno.com.persistence.ConexaoMysqlBruno;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018
 * @version 1
 */
public class MenuPricipal extends javax.swing.JFrame {

    private String ipDaMaquina;

    public MenuPricipal() throws UnknownHostException {
        initComponents();
        this.ipDaMaquina = InetAddress.getLocalHost().getHostAddress();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAreaDeTrabalho = new javax.swing.JDesktopPane();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadastroCliente = new javax.swing.JMenuItem();
        jMenuItemCadastroFruta = new javax.swing.JMenuItem();
        jMenuItemCadsatroQuitanda = new javax.swing.JMenuItem();
        jMenuManutencao = new javax.swing.JMenu();
        jMenuItemManutencaoClientes = new javax.swing.JMenuItem();
        jMenuItemManutencaoFruta = new javax.swing.JMenuItem();
        jMenuItemManutencaoQuitandas = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuPrj = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bem Vindo - Area De Trabalho");

        jAreaDeTrabalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jAreaDeTrabalho);
        jAreaDeTrabalho.setLayout(jAreaDeTrabalhoLayout);
        jAreaDeTrabalhoLayout.setHorizontalGroup(
            jAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        jAreaDeTrabalhoLayout.setVerticalGroup(
            jAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemCadastroCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCadastroCliente.setText("Clientes");
        jMenuItemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadastroCliente);

        jMenuItemCadastroFruta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCadastroFruta.setText("Frutas");
        jMenuItemCadastroFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFrutaActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadastroFruta);

        jMenuItemCadsatroQuitanda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemCadsatroQuitanda.setText("Quitandas");
        jMenuItemCadsatroQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadsatroQuitandaActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadsatroQuitanda);

        jMenuBarPrincipal.add(jMenuCadastrar);

        jMenuManutencao.setText("Manutençao");
        jMenuManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManutencaoActionPerformed(evt);
            }
        });

        jMenuItemManutencaoClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemManutencaoClientes.setText("Clietes");
        jMenuItemManutencaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoClientesActionPerformed(evt);
            }
        });
        jMenuManutencao.add(jMenuItemManutencaoClientes);

        jMenuItemManutencaoFruta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemManutencaoFruta.setText("Frutas");
        jMenuItemManutencaoFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoFrutaActionPerformed(evt);
            }
        });
        jMenuManutencao.add(jMenuItemManutencaoFruta);

        jMenuItemManutencaoQuitandas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemManutencaoQuitandas.setText("Quintas");
        jMenuItemManutencaoQuitandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoQuitandasActionPerformed(evt);
            }
        });
        jMenuManutencao.add(jMenuItemManutencaoQuitandas);

        jMenuBarPrincipal.add(jMenuManutencao);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBarPrincipal.add(jMenuSair);

        jMenuPrj.setText("Projeto");
        jMenuPrj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPrjMouseClicked(evt);
            }
        });
        jMenuBarPrincipal.add(jMenuPrj);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAreaDeTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAreaDeTrabalho)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManutencaoActionPerformed
        JOptionPane.showMessageDialog(null, "em breve", "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuManutencaoActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemCadsatroQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadsatroQuitandaActionPerformed
        abrirCadastroDeQuitanda();
    }//GEN-LAST:event_jMenuItemCadsatroQuitandaActionPerformed

    private void jMenuItemManutencaoFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoFrutaActionPerformed
        abrirManutencaoDeFrutas();
    }//GEN-LAST:event_jMenuItemManutencaoFrutaActionPerformed

    private void jMenuItemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteActionPerformed
        abrirCadastroDeCliente();
    }//GEN-LAST:event_jMenuItemCadastroClienteActionPerformed

    private void jMenuItemManutencaoQuitandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoQuitandasActionPerformed
        abrirManutencaoDeQuitanda();
//        JOptionPane.showMessageDialog(null, "em breve", "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemManutencaoQuitandasActionPerformed

    private void jMenuItemManutencaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoClientesActionPerformed
        abrirManutencaoDeCliente();
    }//GEN-LAST:event_jMenuItemManutencaoClientesActionPerformed

    private void jMenuItemCadastroFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFrutaActionPerformed
        abrirCadastroDeFrutas();
    }//GEN-LAST:event_jMenuItemCadastroFrutaActionPerformed

    private void jMenuPrjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPrjMouseClicked
        System.out.println(this.ipDaMaquina);
        if (this.ipDaMaquina.contains("192.168.")) {
            try {
                Desktop.getDesktop().open(new File("D:\\PrjDesktopJava\\ok\\PrjQuitanda"));
            } catch (IOException ex) {
                Logger.getLogger(MenuPricipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuPrjMouseClicked

    private void abrirCadastroDeFrutas() {
        GUICadastroDeFruta obj = new GUICadastroDeFruta();
        jAreaDeTrabalho.add(obj);
        obj.setVisible(true);
    }

    private void abrirCadastroDeQuitanda() {
        GUICadastroDeQuitanda obj = new GUICadastroDeQuitanda();
        jAreaDeTrabalho.add(obj);
        obj.setVisible(true);
    }

    private void abrirCadastroDeCliente() {
        GUICadastroDeCliente obj = new GUICadastroDeCliente();
        jAreaDeTrabalho.add(obj);
        obj.setVisible(true);
    }

    private void abrirManutencaoDeFrutas() {
        GUIManutencaoDeFrutas obj = new GUIManutencaoDeFrutas();
        jAreaDeTrabalho.add(obj);
        obj.setVisible(true);
    }

    private void abrirManutencaoDeQuitanda() {
        GUIManutencaoDeQuitanda obj = new GUIManutencaoDeQuitanda();
        jAreaDeTrabalho.add(obj);
        obj.setVisible(true);
    }

    private void abrirManutencaoDeCliente() {
        GUIManutencaoDeClientes obj = new GUIManutencaoDeClientes();
        jAreaDeTrabalho.add(obj);
        obj.setVisible(true);
    }

    public static void main(String args[]) throws SQLException {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Connection c = null;
        try {
            c = ConexaoMysqlBruno.conectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar", "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            c.close();
        }
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Falha ao abrir software\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | javax.swing.UnsupportedLookAndFeelException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuPricipal().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MenuPricipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JDesktopPane jAreaDeTrabalho;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemCadastroCliente;
    private javax.swing.JMenuItem jMenuItemCadastroFruta;
    private javax.swing.JMenuItem jMenuItemCadsatroQuitanda;
    private javax.swing.JMenuItem jMenuItemManutencaoClientes;
    private javax.swing.JMenuItem jMenuItemManutencaoFruta;
    private javax.swing.JMenuItem jMenuItemManutencaoQuitandas;
    private javax.swing.JMenu jMenuManutencao;
    private javax.swing.JMenu jMenuPrj;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
