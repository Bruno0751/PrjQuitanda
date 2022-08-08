//PROJECT NAME: prjBruno-quitanda
package bruno.com.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import bruno.com.model.Quitanda;
import bruno.com.services.QuitandaServices;
import bruno.com.services.FactoryServices;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:01
 * @version 1.0 beta
 */
public class GUIManutencaoDeQuitanda extends javax.swing.JInternalFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Identificação", "Nome Quitanda", "Cliete", "funcionário"});

    public GUIManutencaoDeQuitanda() {
        initComponents();
        select();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQuitanda = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jtPesqQuitanda = new javax.swing.JTextField();
        jComboQuitanda = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jtIdQuitanda = new javax.swing.JTextField();
        jtNomeQuitanda = new javax.swing.JTextField();
        jtClienteQuitanda = new javax.swing.JTextField();
        jtFuncionarioQuitanda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbDeletarQuitanda = new javax.swing.JButton();
        jbAtualizarQuitanda = new javax.swing.JButton();
        jbAlterarQuitanda = new javax.swing.JButton();
        jbLimparQuitanda = new javax.swing.JButton();
        jButtonCloseSysten3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manutenção de Quitanda");

        jTableQuitanda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificação", "Nome Quitanda", "Cliente", "Funcionário"
            }
        ));
        jTableQuitanda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableQuitandaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableQuitanda);
        if (jTableQuitanda.getColumnModel().getColumnCount() > 0) {
            jTableQuitanda.getColumnModel().getColumn(0).setResizable(false);
            jTableQuitanda.getColumnModel().getColumn(1).setResizable(false);
            jTableQuitanda.getColumnModel().getColumn(2).setResizable(false);
            jTableQuitanda.getColumnModel().getColumn(3).setResizable(false);
        }

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtPesqQuitanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqQuitandaKeyReleased(evt);
            }
        });

        jComboQuitanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "identificação", "Nome Quitanda", "Cliente", "Funcionário" }));
        jComboQuitanda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboQuitandaItemStateChanged(evt);
            }
        });
        jComboQuitanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboQuitandaKeyReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jtPesqQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jComboQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtPesqQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesqQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtIdQuitanda.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Identificação:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Nome da Quitanda:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Cliete:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Funcionário:");

        jLayeredPane2.setLayer(jtIdQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtNomeQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtClienteQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtFuncionarioQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtIdQuitanda)
                    .addComponent(jtNomeQuitanda)
                    .addComponent(jtClienteQuitanda)
                    .addComponent(jtFuncionarioQuitanda))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtIdQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNomeQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtClienteQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtFuncionarioQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbDeletarQuitanda.setText("Deletar");
        jbDeletarQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarQuitandaActionPerformed(evt);
            }
        });

        jbAtualizarQuitanda.setText("Atualizar");
        jbAtualizarQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarQuitandaActionPerformed(evt);
            }
        });

        jbAlterarQuitanda.setText("Alterar");
        jbAlterarQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarQuitandaActionPerformed(evt);
            }
        });

        jbLimparQuitanda.setText("Limpar");
        jbLimparQuitanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparQuitandaActionPerformed(evt);
            }
        });

        jButtonCloseSysten3.setText("Desligar");
        jButtonCloseSysten3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSysten3ActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jbDeletarQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbAtualizarQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbAlterarQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbLimparQuitanda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButtonCloseSysten3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbAlterarQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAtualizarQuitanda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCloseSysten3)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbLimparQuitanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDeletarQuitanda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jbAtualizarQuitanda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAlterarQuitanda))
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jbLimparQuitanda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbDeletarQuitanda))))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonCloseSysten3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLayeredPane3)
                    .addComponent(jScrollPane1)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparQuitandaActionPerformed
        clear();
    }//GEN-LAST:event_jbLimparQuitandaActionPerformed

    private void jbAtualizarQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarQuitandaActionPerformed
        clear();
        select();
    }//GEN-LAST:event_jbAtualizarQuitandaActionPerformed

    private void jtPesqQuitandaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqQuitandaKeyReleased
        clear();
        filter();
    }//GEN-LAST:event_jtPesqQuitandaKeyReleased

    private void jComboQuitandaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboQuitandaItemStateChanged
        clear();
        filter();
    }//GEN-LAST:event_jComboQuitandaItemStateChanged

    private void jComboQuitandaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboQuitandaKeyReleased
        clear();
        filter();
    }//GEN-LAST:event_jComboQuitandaKeyReleased

    private void jbDeletarQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarQuitandaActionPerformed
        delete();
        clear();
        select();
    }//GEN-LAST:event_jbDeletarQuitandaActionPerformed

    private void jTableQuitandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQuitandaMouseClicked
        alterTable();
    }//GEN-LAST:event_jTableQuitandaMouseClicked

    private void jbAlterarQuitandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarQuitandaActionPerformed
        update();
        clear();
        select();
    }//GEN-LAST:event_jbAlterarQuitandaActionPerformed

    private void jButtonCloseSysten3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSysten3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSysten3ActionPerformed

    private void select() {
        try {

            QuitandaServices quitandaServices = FactoryServices.getQuitandaServices();

            ArrayList<Quitanda> lista = new ArrayList<>();

            lista = quitandaServices.select();

            for (int i = 0; i < lista.size(); i++) {
                defaultTableModel.addRow(new String[]{
                    String.valueOf(lista.get(i).getIdQuitanda()),
                    String.valueOf(lista.get(i).getNome()),
                    String.valueOf(lista.get(i).getClientes()),
                    String.valueOf(lista.get(i).getFuncionarios())
                });
            }
            jTableQuitanda.setModel(defaultTableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdQuitanda.setText(null);
    }

    private void clear() {
        defaultTableModel.setNumRows(0);
        jtNomeQuitanda.setText(null);
        jtClienteQuitanda.setText(null);
        jtFuncionarioQuitanda.setText(null);
    }

    private void filter() {
        try {
            if (jtPesqQuitanda.getText().isEmpty()) {
                select();
            } else {
                String pesquisa = jtPesqQuitanda.getText();
                String filtro = jComboQuitanda.getSelectedItem().toString();
                String query = "";
                if (filtro.equalsIgnoreCase("Identificação")) {
                    query = "WHERE id_quitanda = " + pesquisa;
                } else if (filtro.equalsIgnoreCase("Nome Quitanda")) {
                    query = "WHERE nome LIKE '%" + pesquisa + "%'";
                } else if (filtro.equalsIgnoreCase("Cliente")) {
                    query = "WHERE cliente LIKE '%" + pesquisa + "%'";
                } else if (filtro.equalsIgnoreCase("Funcionário")) {
                    query = "WHERE funcionario LIKE '%" + pesquisa + "%'";
                }
                QuitandaServices quitandaServices = FactoryServices.getQuitandaServices();
                
                ArrayList<Quitanda> listaQuitandas = quitandaServices.filter(query);

                for (int i = 0; i < listaQuitandas.size(); i++) {
                    defaultTableModel.addRow(new String[]{
                        String.valueOf(listaQuitandas.get(i).getIdQuitanda()),
                        listaQuitandas.get(i).getNome(),
                        listaQuitandas.get(i).getClientes(),
                        listaQuitandas.get(i).getFuncionarios(),});
                }
                jTableQuitanda.setModel(defaultTableModel);
            }

        } catch (Exception e) {
            jtPesqQuitanda.setText(null);
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void delete() {
        try {
            int linha = jTableQuitanda.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione Uma Linha");
            } else {
                String id = jTableQuitanda.getValueAt(linha, 0).toString();
                QuitandaServices quitandaServices = FactoryServices.getQuitandaServices();
                quitandaServices.deletarQuitanda(Long.parseLong(id));

                JOptionPane.showMessageDialog(
                        this,
                        "Quitanda Deletada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdQuitanda.setText(null);
    }

    private void alterTable() {
        try {
            int linha = jTableQuitanda.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione uma Linha");
            } else {
                String id = jTableQuitanda.getValueAt(linha, 0).toString();
                String nome = jTableQuitanda.getValueAt(linha, 1).toString();
                String valorCusto = jTableQuitanda.getValueAt(linha, 2).toString();
                String qtd = jTableQuitanda.getValueAt(linha, 3).toString();

                jtIdQuitanda.setText(id);
                jtNomeQuitanda.setText(nome);
                jtClienteQuitanda.setText(valorCusto);
                jtFuncionarioQuitanda.setText(qtd);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void update() {
        try {
            Quitanda quitanda = new Quitanda();

            quitanda.setIdQuitanda(Long.parseLong(jtIdQuitanda.getText()));
            quitanda.setNome(jtNomeQuitanda.getText());
            quitanda.setClientes(jtClienteQuitanda.getText());
            quitanda.setFuncionarios(jtFuncionarioQuitanda.getText());

            QuitandaServices quitandaServices = bruno.com.services.FactoryServices.getQuitandaServices();

            quitandaServices.update(quitanda);

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Quitanda Alterado Com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdQuitanda.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSysten3;
    private javax.swing.JComboBox<String> jComboQuitanda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableQuitanda;
    private javax.swing.JButton jbAlterarQuitanda;
    private javax.swing.JButton jbAtualizarQuitanda;
    private javax.swing.JButton jbDeletarQuitanda;
    private javax.swing.JButton jbLimparQuitanda;
    private javax.swing.JTextField jtClienteQuitanda;
    private javax.swing.JTextField jtFuncionarioQuitanda;
    private javax.swing.JTextField jtIdQuitanda;
    private javax.swing.JTextField jtNomeQuitanda;
    private javax.swing.JTextField jtPesqQuitanda;
    // End of variables declaration//GEN-END:variables
}
