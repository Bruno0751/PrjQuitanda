//PROJECT NAME: prjBruno-quitanda
package bruno.com.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import bruno.com.model.Fruta;
import bruno.com.services.FrutaServices;
import bruno.com.services.FactoryServices;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:02
 * @version 1.0 beta
 */
public class GUIManutencaoDeFrutas extends javax.swing.JInternalFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "Valor", "Quantidade"});

    public GUIManutencaoDeFrutas() {
        initComponents();
        selectAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFrutas = new javax.swing.JTable();
        jbLimpar = new javax.swing.JButton();
        jbDeletarCoisa = new javax.swing.JButton();
        jbAtualizaCoisas = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jtPesq = new javax.swing.JTextField();
        jComboFiltro = new javax.swing.JComboBox<>();
        jButtonCloseSysten = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtIdFruta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtValorFruta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtNomeFruta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtQuantidadeFruta = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Manutenção Tabela de Frutas");

        jTableFrutas.setBorder(null);
        jTableFrutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor", "Quantidade"
            }
        ));
        jTableFrutas.setMaximumSize(new java.awt.Dimension(796, 96));
        jTableFrutas.setMinimumSize(new java.awt.Dimension(796, 96));
        jTableFrutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFrutasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFrutas);
        if (jTableFrutas.getColumnModel().getColumnCount() > 0) {
            jTableFrutas.getColumnModel().getColumn(0).setResizable(false);
            jTableFrutas.getColumnModel().getColumn(1).setResizable(false);
            jTableFrutas.getColumnModel().getColumn(2).setResizable(false);
            jTableFrutas.getColumnModel().getColumn(3).setResizable(false);
        }

        jbLimpar.setText("Limpar");
        jbLimpar.setMaximumSize(new java.awt.Dimension(74, 28));
        jbLimpar.setMinimumSize(new java.awt.Dimension(74, 28));
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletarCoisa.setText("Deletar");
        jbDeletarCoisa.setMaximumSize(new java.awt.Dimension(74, 28));
        jbDeletarCoisa.setMinimumSize(new java.awt.Dimension(74, 28));
        jbDeletarCoisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarCoisaActionPerformed(evt);
            }
        });

        jbAtualizaCoisas.setText("Atualizar");
        jbAtualizaCoisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizaCoisasActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.setMaximumSize(new java.awt.Dimension(74, 28));
        jbAlterar.setMinimumSize(new java.awt.Dimension(74, 28));
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqKeyReleased(evt);
            }
        });

        jComboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Valor", "Quantidade" }));
        jComboFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboFiltroItemStateChanged(evt);
            }
        });
        jComboFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboFiltroKeyReleased(evt);
            }
        });

        jLayeredPane2.setLayer(jtPesq, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jComboFiltro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCloseSysten.setText("Desligar");
        jButtonCloseSysten.setMaximumSize(new java.awt.Dimension(74, 28));
        jButtonCloseSysten.setMinimumSize(new java.awt.Dimension(74, 28));
        jButtonCloseSysten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseSystenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Código:");

        jtIdFruta.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Preço:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Fruta:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Quantidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtIdFruta, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)))
                            .addComponent(jtValorFruta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtNomeFruta)
                            .addComponent(jtQuantidadeFruta)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAtualizaCoisas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCloseSysten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbDeletarCoisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtIdFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane2))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtValorFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNomeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtQuantidadeFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonCloseSysten, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbDeletarCoisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAtualizaCoisas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbDeletarCoisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarCoisaActionPerformed
        delete();
        clear();
        selectAll();
    }//GEN-LAST:event_jbDeletarCoisaActionPerformed

    private void jbAtualizaCoisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizaCoisasActionPerformed
        clear();
        selectAll();
    }//GEN-LAST:event_jbAtualizaCoisasActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        clear();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        update();
        clear();
        selectAll();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jTableFrutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFrutasMouseClicked
        updateTable();
    }//GEN-LAST:event_jTableFrutasMouseClicked

    private void jComboFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboFiltroItemStateChanged
        clear();
        selectBy();
    }//GEN-LAST:event_jComboFiltroItemStateChanged

    private void jComboFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboFiltroKeyReleased
        clear();
        selectBy();
    }//GEN-LAST:event_jComboFiltroKeyReleased

    private void jtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqKeyReleased
        clear();
        selectBy();
    }//GEN-LAST:event_jtPesqKeyReleased

    private void jButtonCloseSystenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSystenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSystenActionPerformed

    private void selectAll() {
        try {

            FrutaServices frutaServices = FactoryServices.getFrutasServices();

            ArrayList<Fruta> lista = new ArrayList<>();

            lista = frutaServices.selectAll();

            for (int i = 0; i < lista.size(); i++) {
                defaultTableModel.addRow(new String[]{
                    String.valueOf(lista.get(i).getIdFruta()),
                    String.valueOf(lista.get(i).getNome()),
                    String.valueOf(lista.get(i).getValorCusto()),
                    String.valueOf(lista.get(i).getQuantidade())
                });
            }
            jTableFrutas.setModel(defaultTableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdFruta.setText(null);
    }

    private void clear() {
        defaultTableModel.setNumRows(0);
        jtIdFruta.setText(null);
        jtNomeFruta.setText(null);
        jtQuantidadeFruta.setText(null);
        jtValorFruta.setText(null);
    }

    private void delete() {
        try {
            int linha = jTableFrutas.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione Uma Linha");
            } else {
                String id = jTableFrutas.getValueAt(linha, 0).toString();
                
                FrutaServices frutaServices = FactoryServices.getFrutasServices();
                
                frutaServices.delete(Long.parseLong(id));

                JOptionPane.showMessageDialog(this, "Fruta Deletado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdFruta.setText(null);
    }

    private void updateTable() {
        try {
            int linha = jTableFrutas.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(this, "Selecione uma Linha!");
            } else {
                String id = jTableFrutas.getValueAt(linha, 0).toString();
                String nome = jTableFrutas.getValueAt(linha, 1).toString();
                String valorCusto = jTableFrutas.getValueAt(linha, 2).toString();
                String qtd = jTableFrutas.getValueAt(linha, 3).toString();

                jtIdFruta.setText(id);
                jtNomeFruta.setText(nome);
                jtValorFruta.setText(valorCusto);
                jtQuantidadeFruta.setText(qtd);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void update() {
        try {
            Fruta fruta = new Fruta();
            
            fruta.setIdFruta(Long.parseLong(jtIdFruta.getText()));
            fruta.setNome(jtNomeFruta.getText());
            fruta.setValorCusto(Float.parseFloat(jtValorFruta.getText()));
            fruta.setQuantidade(Integer.parseInt(jtQuantidadeFruta.getText()));

            FrutaServices frutaServices = bruno.com.services.FactoryServices.getFrutasServices();

            frutaServices.update(fruta);

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Fruta Alterado Com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jtIdFruta.setText(null);
    }

    private void selectBy() {
        try {
            if (jtPesq.getText().isEmpty()) {
                selectAll();
            } else {
                String pesquisa = jtPesq.getText();
                String filtro = jComboFiltro.getSelectedItem().toString();
                String query = "";
                if (filtro.equalsIgnoreCase("Nome")) {
                    query = "WHERE nome LIKE '%" + pesquisa + "%'";
                } else if (filtro.equalsIgnoreCase("Código")) {
                    query = "WHERE id_fruta = " + pesquisa;
                } else if (filtro.equalsIgnoreCase("Valor")) {
                    query = "WHERE valor = " + pesquisa;
                } else if (filtro.equalsIgnoreCase("Quantidade")) {
                    query = "WHERE quantidade = " + pesquisa;
                }
                FrutaServices frutaServices = FactoryServices.getFrutasServices();
                
                ArrayList<Fruta> lista = frutaServices.selectBy(query);

                for (int i = 0; i < lista.size(); i++) {
                    defaultTableModel.addRow(new String[]{
                        String.valueOf(lista.get(i).getIdFruta()),
                        lista.get(i).getNome(),
                        String.valueOf(lista.get(i).getValorCusto()),
                        String.valueOf(lista.get(i).getQuantidade()),});
                }
                jTableFrutas.setModel(defaultTableModel);
            }

        } catch (Exception e) {
            jtPesq.setText(null);
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSysten;
    private javax.swing.JComboBox<String> jComboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFrutas;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizaCoisas;
    private javax.swing.JButton jbDeletarCoisa;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JTextField jtIdFruta;
    private javax.swing.JTextField jtNomeFruta;
    private javax.swing.JTextField jtPesq;
    private javax.swing.JTextField jtQuantidadeFruta;
    private javax.swing.JTextField jtValorFruta;
    // End of variables declaration//GEN-END:variables
}
