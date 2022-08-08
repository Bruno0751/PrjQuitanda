//PROJECT NAME: prjBruno-quitanda
package bruno.com.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import bruno.com.model.Quitanda;
import bruno.com.services.QuitandaServices;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:07
 * @version 1.0 beta
 */
public class GUICadastroDeQuitanda extends javax.swing.JInternalFrame {

    public GUICadastroDeQuitanda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlNomeQuitanda = new javax.swing.JLabel();
        jlClienteQuintanda = new javax.swing.JLabel();
        jlFuncionarioQuitanda = new javax.swing.JLabel();
        jtNomeQuitanda = new javax.swing.JTextField();
        jtClieteQuitanda = new javax.swing.JTextField();
        jtFuncionarioQuitanda = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbLimparQuitanda = new javax.swing.JButton();
        jbCadastrarQuitanda = new javax.swing.JButton();
        jButtonCloseSysten = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Quitanda");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlNomeQuitanda.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlNomeQuitanda.setText("Nome da Quintanda");

        jlClienteQuintanda.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlClienteQuintanda.setText("Nome do Cliente");

        jlFuncionarioQuitanda.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlFuncionarioQuitanda.setText("Nome do Funcionário");

        jtNomeQuitanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeQuitandaKeyPressed(evt);
            }
        });

        jtClieteQuitanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtClieteQuitandaKeyPressed(evt);
            }
        });

        jtFuncionarioQuitanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtFuncionarioQuitandaKeyPressed(evt);
            }
        });

        jLayeredPane1.setLayer(jlNomeQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlClienteQuintanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlFuncionarioQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtNomeQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtClieteQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtFuncionarioQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtFuncionarioQuitanda)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNomeQuitanda)
                                    .addComponent(jlClienteQuintanda))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtNomeQuitanda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtClieteQuitanda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jlFuncionarioQuitanda)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jlNomeQuitanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNomeQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlClienteQuintanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtClieteQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlFuncionarioQuitanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtFuncionarioQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbLimparQuitanda.setText("Limpar");
        jbLimparQuitanda.setMaximumSize(new java.awt.Dimension(83, 28));
        jbLimparQuitanda.setMinimumSize(new java.awt.Dimension(83, 28));
        jbLimparQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparQuitandaActionPerformed(evt);
            }
        });

        jbCadastrarQuitanda.setText("Cadastrar");
        jbCadastrarQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarQuitandaActionPerformed(evt);
            }
        });
        jbCadastrarQuitanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastrarQuitandaKeyPressed(evt);
            }
        });

        jButtonCloseSysten.setText("Desligar");
        jButtonCloseSysten.setMaximumSize(new java.awt.Dimension(83, 28));
        jButtonCloseSysten.setMinimumSize(new java.awt.Dimension(83, 28));
        jButtonCloseSysten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSystenActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jbLimparQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbCadastrarQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButtonCloseSysten, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCloseSysten, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimparQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastrarQuitanda))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbCadastrarQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimparQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCloseSysten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarQuitandaActionPerformed
        this.insert();
    }//GEN-LAST:event_jbCadastrarQuitandaActionPerformed

    private void jtNomeQuitandaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeQuitandaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtClieteQuitanda.grabFocus();
        }
    }//GEN-LAST:event_jtNomeQuitandaKeyPressed

    private void jtClieteQuitandaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtClieteQuitandaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtFuncionarioQuitanda.grabFocus();
        }
    }//GEN-LAST:event_jtClieteQuitandaKeyPressed

    private void jtFuncionarioQuitandaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFuncionarioQuitandaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbCadastrarQuitanda.grabFocus();
        }
    }//GEN-LAST:event_jtFuncionarioQuitandaKeyPressed

    private void jbCadastrarQuitandaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastrarQuitandaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            insert();
        }
    }//GEN-LAST:event_jbCadastrarQuitandaKeyPressed

    private void jbLimparQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparQuitandaActionPerformed
        this.clear();
    }//GEN-LAST:event_jbLimparQuitandaActionPerformed

    private void jButtonCloseSystenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSystenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSystenActionPerformed

    private void insert() {
        try {
            Quitanda quitanda = new Quitanda();

            quitanda.setNome(jtNomeQuitanda.getText());
            quitanda.setClientes(jtClieteQuitanda.getText());
            quitanda.setFuncionarios(jtFuncionarioQuitanda.getText());

            QuitandaServices quitandaServices = bruno.com.services.FactoryServices.getQuitandaServices();

            quitandaServices.insert(quitanda);

            JOptionPane.showMessageDialog(rootPane, "Quitanda Cadastrada");
            clear();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clear() {
        jtNomeQuitanda.setText(null);
        jtClieteQuitanda.setText(null);
        jtFuncionarioQuitanda.setText(null);
        jtNomeQuitanda.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSysten;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbCadastrarQuitanda;
    private javax.swing.JButton jbLimparQuitanda;
    private javax.swing.JLabel jlClienteQuintanda;
    private javax.swing.JLabel jlFuncionarioQuitanda;
    private javax.swing.JLabel jlNomeQuitanda;
    private javax.swing.JTextField jtClieteQuitanda;
    private javax.swing.JTextField jtFuncionarioQuitanda;
    private javax.swing.JTextField jtNomeQuitanda;
    // End of variables declaration//GEN-END:variables
}
