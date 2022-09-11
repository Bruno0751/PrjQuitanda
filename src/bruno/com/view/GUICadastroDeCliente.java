//PROJECT NAME: prjBruno-quitanda
package bruno.com.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import bruno.com.model.Cliente;
import bruno.com.services.ClienteServices;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:05
 * @version 1.0 beta
 */
public class GUICadastroDeCliente extends javax.swing.JInternalFrame {

    public GUICadastroDeCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpDadosCliente = new javax.swing.JLayeredPane();
        jlIdadeCliente = new javax.swing.JLabel();
        jlNomeCliente = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jtNomeCliente = new javax.swing.JTextField();
        jtCPF = new javax.swing.JTextField();
        jtIdadeCliente = new javax.swing.JTextField();
        jlpAcoesDoCliente = new javax.swing.JLayeredPane();
        jbLimparCliente = new javax.swing.JButton();
        jbCadatrarCliente = new javax.swing.JButton();
        jButtonCloseSysten = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Cliente");

        jlpDadosCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlIdadeCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlIdadeCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlIdadeCliente.setText("Idade");
        jlIdadeCliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jlNomeCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlNomeCliente.setText("Nome:");
        jlNomeCliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlNomeCliente.setAlignmentY(0.0F);

        jlCPF.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlCPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlCPF.setText("cpf:");
        jlCPF.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeClienteKeyPressed(evt);
            }
        });

        jtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCPFKeyPressed(evt);
            }
        });

        jtIdadeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtIdadeClienteKeyPressed(evt);
            }
        });

        jlpDadosCliente.setLayer(jlIdadeCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCliente.setLayer(jlNomeCliente, javax.swing.JLayeredPane.DRAG_LAYER);
        jlpDadosCliente.setLayer(jlCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCliente.setLayer(jtNomeCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCliente.setLayer(jtCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCliente.setLayer(jtIdadeCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosClienteLayout = new javax.swing.GroupLayout(jlpDadosCliente);
        jlpDadosCliente.setLayout(jlpDadosClienteLayout);
        jlpDadosClienteLayout.setHorizontalGroup(
            jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCPF)
                    .addComponent(jtNomeCliente)
                    .addGroup(jlpDadosClienteLayout.createSequentialGroup()
                        .addGroup(jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomeCliente)
                            .addComponent(jlCPF)
                            .addComponent(jlIdadeCliente))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtIdadeCliente))
                .addContainerGap())
        );
        jlpDadosClienteLayout.setVerticalGroup(
            jlpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIdadeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpAcoesDoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbLimparCliente.setText("Limpar");
        jbLimparCliente.setMaximumSize(new java.awt.Dimension(83, 28));
        jbLimparCliente.setMinimumSize(new java.awt.Dimension(83, 28));
        jbLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparClienteActionPerformed(evt);
            }
        });

        jbCadatrarCliente.setText("Cadatrar");
        jbCadatrarCliente.setMaximumSize(new java.awt.Dimension(83, 28));
        jbCadatrarCliente.setMinimumSize(new java.awt.Dimension(83, 28));
        jbCadatrarCliente.setPreferredSize(new java.awt.Dimension(83, 28));
        jbCadatrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadatrarClienteActionPerformed(evt);
            }
        });
        jbCadatrarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadatrarClienteKeyPressed(evt);
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

        jlpAcoesDoCliente.setLayer(jbLimparCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoesDoCliente.setLayer(jbCadatrarCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoesDoCliente.setLayer(jButtonCloseSysten, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesDoClienteLayout = new javax.swing.GroupLayout(jlpAcoesDoCliente);
        jlpAcoesDoCliente.setLayout(jlpAcoesDoClienteLayout);
        jlpAcoesDoClienteLayout.setHorizontalGroup(
            jlpAcoesDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesDoClienteLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jlpAcoesDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCloseSysten, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadatrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jlpAcoesDoClienteLayout.setVerticalGroup(
            jlpAcoesDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesDoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbCadatrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jlpDadosCliente)
                    .addComponent(jlpAcoesDoCliente))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlpAcoesDoCliente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparClienteActionPerformed
        clear();
    }//GEN-LAST:event_jbLimparClienteActionPerformed

    private void jbCadatrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadatrarClienteActionPerformed
        insert();
    }//GEN-LAST:event_jbCadatrarClienteActionPerformed

    private void jbCadatrarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadatrarClienteKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            insert();
//        }
    }//GEN-LAST:event_jbCadatrarClienteKeyPressed

    private void jButtonCloseSystenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSystenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSystenActionPerformed

    private void jtIdadeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdadeClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtNomeCliente.grabFocus();
        }
    }//GEN-LAST:event_jtIdadeClienteKeyPressed

    private void jtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCPFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtIdadeCliente.grabFocus();
        }
    }//GEN-LAST:event_jtCPFKeyPressed

    private void jtNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtCPF.grabFocus();
        }
    }//GEN-LAST:event_jtNomeClienteKeyPressed

    private void insert() {
        try {
            Cliente obj = new Cliente();

            String nome = jtNomeCliente.getText();
            String cpf = jtCPF.getText();
            String idade = jtIdadeCliente.getText();

            if (nome.isEmpty() && idade.isEmpty() && cpf.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha os Campos", "Atenção", JOptionPane.WARNING_MESSAGE);

            } else if (nome.isEmpty() && !idade.isEmpty() && !cpf.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha o Campo Nome", "Atenção", JOptionPane.WARNING_MESSAGE);

            } else if (!nome.isEmpty() && idade.isEmpty() && !cpf.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha o Campo Idade", "Atenção", JOptionPane.WARNING_MESSAGE);
                jtIdadeCliente.grabFocus();

            } else if (!nome.isEmpty() && !idade.isEmpty() && cpf.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha o Campo CPF", "Atenção", JOptionPane.WARNING_MESSAGE);
                jtCPF.grabFocus();

            } else {
                if (cpf.length() > 11) {
                    
                    JOptionPane.showMessageDialog(null, "CPF Iválido", "Atenção", JOptionPane.WARNING_MESSAGE);
                    jtCPF.grabFocus();
                    
                } else {
                    obj.setNome(jtNomeCliente.getText());
                    obj.setCpf(jtCPF.getText());
                    obj.setIdade(Integer.parseInt(idade));

                    ClienteServices clienteService = bruno.com.services.FactoryServices.getClieteServices();

                    clienteService.insert(obj);

                    JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado");
                    clear();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
        clear();
    }

    private void clear() {
        jtNomeCliente.setText(null);
        jtCPF.setText(null);
        jtIdadeCliente.setText(null);
        jtNomeCliente.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSysten;
    private javax.swing.JButton jbCadatrarCliente;
    private javax.swing.JButton jbLimparCliente;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlIdadeCliente;
    private javax.swing.JLabel jlNomeCliente;
    private javax.swing.JLayeredPane jlpAcoesDoCliente;
    private javax.swing.JLayeredPane jlpDadosCliente;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtIdadeCliente;
    private javax.swing.JTextField jtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
