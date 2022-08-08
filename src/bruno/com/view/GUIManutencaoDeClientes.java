//PROJECT NAME: prjBruno-quitanda
package bruno.com.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import bruno.com.model.Cliente;
import bruno.com.services.ClienteServices;
import bruno.com.services.FactoryServices;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:03
 * @version 1.0 beta
 */
public class GUIManutencaoDeClientes extends javax.swing.JInternalFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "CPF", "Idade"});

    public GUIManutencaoDeClientes() {
        initComponents();
        find();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jtPesqCliente = new javax.swing.JTextField();
        jComboCliete = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliete = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbAtualizarCliete = new javax.swing.JButton();
        jbLimparCliete = new javax.swing.JButton();
        jbAlterarCliete = new javax.swing.JButton();
        jbDeletarCliete = new javax.swing.JButton();
        jButtonCloseSysten = new javax.swing.JButton();
        jtIdCliente = new javax.swing.JTextField();
        jtNomeCliente = new javax.swing.JTextField();
        jtCPF = new javax.swing.JTextField();
        jtIdadeCliente = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção de Cliente");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtPesqCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqClienteKeyReleased(evt);
            }
        });

        jComboCliete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Cpf", "Idade" }));
        jComboCliete.setMaximumSize(new java.awt.Dimension(110, 28));
        jComboCliete.setMinimumSize(new java.awt.Dimension(110, 28));
        jComboCliete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboClieteItemStateChanged(evt);
            }
        });
        jComboCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClieteActionPerformed(evt);
            }
        });
        jComboCliete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboClieteKeyReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jtPesqCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jComboCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboCliete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesqCliente)
                    .addComponent(jComboCliete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTableCliete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliete.setMaximumSize(new java.awt.Dimension(796, 96));
        jTableCliete.setMinimumSize(new java.awt.Dimension(796, 96));
        jTableCliete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClieteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliete);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbAtualizarCliete.setText("Atualizar");
        jbAtualizarCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarClieteActionPerformed(evt);
            }
        });

        jbLimparCliete.setText("Limpar");
        jbLimparCliete.setMaximumSize(new java.awt.Dimension(74, 28));
        jbLimparCliete.setMinimumSize(new java.awt.Dimension(74, 28));
        jbLimparCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparClieteActionPerformed(evt);
            }
        });

        jbAlterarCliete.setText("Alterar");
        jbAlterarCliete.setMaximumSize(new java.awt.Dimension(74, 28));
        jbAlterarCliete.setMinimumSize(new java.awt.Dimension(74, 28));
        jbAlterarCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarClieteActionPerformed(evt);
            }
        });

        jbDeletarCliete.setText("Deletar");
        jbDeletarCliete.setMaximumSize(new java.awt.Dimension(74, 28));
        jbDeletarCliete.setMinimumSize(new java.awt.Dimension(74, 28));
        jbDeletarCliete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarClieteActionPerformed(evt);
            }
        });

        jButtonCloseSysten.setText("Desligar");
        jButtonCloseSysten.setMaximumSize(new java.awt.Dimension(74, 28));
        jButtonCloseSysten.setMinimumSize(new java.awt.Dimension(74, 28));
        jButtonCloseSysten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSystenActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jbAtualizarCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbLimparCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbAlterarCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbDeletarCliete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButtonCloseSysten, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAlterarCliete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAtualizarCliete))
                .addGap(18, 18, 18)
                .addComponent(jButtonCloseSysten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbDeletarCliete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimparCliete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbLimparCliete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAtualizarCliete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAlterarCliete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbDeletarCliete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCloseSysten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtIdCliente.setEnabled(false);

        jtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCPFActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelID.setText("Código:");

        jLabelNome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");

        jLabelCPF.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelCPF.setText("cpf:");

        jLabelIdade.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelIdade.setText("Idade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelID)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtIdCliente)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelCPF)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLayeredPane2)
                                .addComponent(jtCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelIdade)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jtIdadeCliente, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear() {
        defaultTableModel.setNumRows(0);
        jtNomeCliente.setText(null);
        jtCPF.setText(null);
        jtIdadeCliente.setText(null);
    }

    private void find() {
        try {

            ClienteServices clienteServices = FactoryServices.getClieteServices();

            ArrayList<Cliente> lista = new ArrayList<>();

            lista = clienteServices.find();

            for (int i = 0; i < lista.size(); i++) {
                defaultTableModel.addRow(new String[]{
                    String.valueOf(lista.get(i).getIdCliente()),
                    String.valueOf(lista.get(i).getNome()),
                    String.valueOf(lista.get(i).getCpf()),
                    String.valueOf(lista.get(i).getIdade()),});
            }
            jTableCliete.setModel(defaultTableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdCliente.setText(null);
    }

    private void delete() {
        try {
            int linha = jTableCliete.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione Uma Linha");
            } else {
                String id = jTableCliete.getValueAt(linha, 0).toString();

                ClienteServices clienteServices = FactoryServices.getClieteServices();

                clienteServices.delete(Long.parseLong(id));

                JOptionPane.showMessageDialog(null, "Cliente Deletado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdCliente.setText(null);
    }

    private void findBy() {
        try {
            if (jtPesqCliente.getText().isEmpty()) {
                find();
            } else {
                String pesquisa = jtPesqCliente.getText();
                String filtro = jComboCliete.getSelectedItem().toString();
                String query = "";
                if (filtro.equalsIgnoreCase("Código")) {
                    query = "WHERE id_cliente = " + pesquisa;
                } else if (filtro.equalsIgnoreCase("Nome")) {
                    query = "WHERE nome LIKE '%" + pesquisa + "%'";
                } else if (filtro.equalsIgnoreCase("CPF")) {
                    query = "WHERE cpf LIKE '%" + pesquisa + "%'";
                } else if (filtro.equalsIgnoreCase("Idade")) {
                    query = "WHERE idade = " + pesquisa;
                }

                ClienteServices clienteServices = FactoryServices.getClieteServices();

                ArrayList<Cliente> lista = clienteServices.findBy(query);

                for (int i = 0; i < lista.size(); i++) {
                    defaultTableModel.addRow(new String[]{
                        String.valueOf(lista.get(i).getIdCliente()),
                        lista.get(i).getNome(),
                        lista.get(i).getCpf(),
                        String.valueOf(lista.get(i).getIdade()),});
                }
                jTableCliete.setModel(defaultTableModel);
            }

        } catch (Exception e) {
            jtPesqCliente.setText(null);
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alter() {
        try {
            int linha = jTableCliete.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma linha!");
            } else {
                String id = jTableCliete.getValueAt(linha, 0).toString();
                String nome = jTableCliete.getValueAt(linha, 1).toString();
                String cpf = jTableCliete.getValueAt(linha, 2).toString();
                String idade = jTableCliete.getValueAt(linha, 3).toString();

                jtIdCliente.setText(id);
                jtNomeCliente.setText(nome);
                jtCPF.setText(cpf);
                jtIdadeCliente.setText(idade);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void update() {
        try {
            int linha = jTableCliete.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione Uma Linha");
            } else {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(Long.parseLong(jtIdCliente.getText()));
                cliente.setNome(jtNomeCliente.getText());
                cliente.setCpf(jtCPF.getText());
                cliente.setIdade(Integer.parseInt(jtIdadeCliente.getText()));

                ClienteServices clienteServices = bruno.com.services.FactoryServices.getClieteServices();

                clienteServices.update(cliente);

                JOptionPane.showMessageDialog(rootPane, "Cliente Alterado Com Sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdCliente.setText(null);
    }

    private void jbLimparClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparClieteActionPerformed
        clear();
    }//GEN-LAST:event_jbLimparClieteActionPerformed

    private void jbAtualizarClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarClieteActionPerformed
        clear();
        find();
    }//GEN-LAST:event_jbAtualizarClieteActionPerformed

    private void jtPesqClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqClienteKeyReleased
        clear();
        findBy();
    }//GEN-LAST:event_jtPesqClienteKeyReleased

    private void jComboClieteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboClieteItemStateChanged
        clear();
        findBy();
    }//GEN-LAST:event_jComboClieteItemStateChanged

    private void jComboClieteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboClieteKeyReleased
        clear();
        findBy();
    }//GEN-LAST:event_jComboClieteKeyReleased

    private void jbDeletarClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarClieteActionPerformed
        delete();
        clear();
        find();
    }//GEN-LAST:event_jbDeletarClieteActionPerformed

    private void jbAlterarClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarClieteActionPerformed
        update();
        clear();
        find();
    }//GEN-LAST:event_jbAlterarClieteActionPerformed

    private void jTableClieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClieteMouseClicked
        alter();
    }//GEN-LAST:event_jTableClieteMouseClicked

    private void jButtonCloseSystenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSystenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSystenActionPerformed

    private void jComboClieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClieteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboClieteActionPerformed

    private void jtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCPFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSysten;
    private javax.swing.JComboBox<String> jComboCliete;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliete;
    private javax.swing.JButton jbAlterarCliete;
    private javax.swing.JButton jbAtualizarCliete;
    private javax.swing.JButton jbDeletarCliete;
    private javax.swing.JButton jbLimparCliete;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtIdCliente;
    private javax.swing.JTextField jtIdadeCliente;
    private javax.swing.JTextField jtNomeCliente;
    private javax.swing.JTextField jtPesqCliente;
    // End of variables declaration//GEN-END:variables
}
