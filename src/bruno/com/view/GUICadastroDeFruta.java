//PROJECT NAME: prjBruno-quitanda
package bruno.com.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import bruno.com.model.Fruta;
import bruno.com.services.FrutaServices;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:06
 * @version 1.0 beta
 */
public class GUICadastroDeFruta extends javax.swing.JInternalFrame {

    public GUICadastroDeFruta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpAcoesDeCadatro = new javax.swing.JLayeredPane();
        jbCadastroCoisas = new javax.swing.JButton();
        jbLimparCadastroCoisas = new javax.swing.JButton();
        jButtonCloseSysten = new javax.swing.JButton();
        jlpDadosCadastroCoisas = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlValor = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jtQuantidade = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtValor = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Fruta");

        jlpAcoesDeCadatro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbCadastroCoisas.setText("Cadastrar");
        jbCadastroCoisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroCoisasActionPerformed(evt);
            }
        });
        jbCadastroCoisas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastroCoisasKeyPressed(evt);
            }
        });

        jbLimparCadastroCoisas.setText("Limpar");
        jbLimparCadastroCoisas.setMaximumSize(new java.awt.Dimension(83, 28));
        jbLimparCadastroCoisas.setMinimumSize(new java.awt.Dimension(83, 28));
        jbLimparCadastroCoisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparCadastroCoisasActionPerformed(evt);
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

        jlpAcoesDeCadatro.setLayer(jbCadastroCoisas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoesDeCadatro.setLayer(jbLimparCadastroCoisas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoesDeCadatro.setLayer(jButtonCloseSysten, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesDeCadatroLayout = new javax.swing.GroupLayout(jlpAcoesDeCadatro);
        jlpAcoesDeCadatro.setLayout(jlpAcoesDeCadatroLayout);
        jlpAcoesDeCadatroLayout.setHorizontalGroup(
            jlpAcoesDeCadatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesDeCadatroLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jlpAcoesDeCadatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCloseSysten, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimparCadastroCoisas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastroCoisas))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jlpAcoesDeCadatroLayout.setVerticalGroup(
            jlpAcoesDeCadatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAcoesDeCadatroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCadastroCoisas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimparCadastroCoisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCloseSysten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jlpDadosCadastroCoisas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlNome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlNome.setText("Nome:");

        jlValor.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlValor.setText("Valor:");

        jlQuantidade.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jlQuantidade.setText("Quantidade:");

        jtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtQuantidadeKeyPressed(evt);
            }
        });

        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeKeyPressed(evt);
            }
        });

        jtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtValorKeyPressed(evt);
            }
        });

        jlpDadosCadastroCoisas.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jlValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jlQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jtQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDadosCadastroCoisas.setLayer(jtValor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosCadastroCoisasLayout = new javax.swing.GroupLayout(jlpDadosCadastroCoisas);
        jlpDadosCadastroCoisas.setLayout(jlpDadosCadastroCoisasLayout);
        jlpDadosCadastroCoisasLayout.setHorizontalGroup(
            jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosCadastroCoisasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtValor)
                    .addComponent(jtNome)
                    .addGroup(jlpDadosCadastroCoisasLayout.createSequentialGroup()
                        .addGroup(jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlValor)
                            .addComponent(jlNome)
                            .addComponent(jlQuantidade))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtQuantidade))
                .addContainerGap())
        );
        jlpDadosCadastroCoisasLayout.setVerticalGroup(
            jlpDadosCadastroCoisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosCadastroCoisasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpDadosCadastroCoisas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpAcoesDeCadatro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDadosCadastroCoisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlpAcoesDeCadatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastroCoisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroCoisasActionPerformed
        insert();
    }//GEN-LAST:event_jbCadastroCoisasActionPerformed

    private void jbLimparCadastroCoisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparCadastroCoisasActionPerformed
        clear();
    }//GEN-LAST:event_jbLimparCadastroCoisasActionPerformed

    private void jtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtNome.grabFocus();
        }
    }//GEN-LAST:event_jtQuantidadeKeyPressed

    private void jtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtValor.grabFocus();
        }
    }//GEN-LAST:event_jtNomeKeyPressed

    private void jtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtValorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbCadastroCoisas.grabFocus();
        }
    }//GEN-LAST:event_jtValorKeyPressed

    private void jbCadastroCoisasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastroCoisasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            insert();
        }
    }//GEN-LAST:event_jbCadastroCoisasKeyPressed

    private void jButtonCloseSystenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseSystenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseSystenActionPerformed

    private void insert() {
        try {
            Fruta fruta = new Fruta();

            fruta.setNome(jlNome.getText());
            fruta.setValorCusto(Float.parseFloat(jtValor.getText()));
            fruta.setQuantidade(Integer.parseInt(jtQuantidade.getText()));

            FrutaServices frutaServices = bruno.com.services.FactoryServices.getFrutasServices();

            frutaServices.insert(fruta);

            JOptionPane.showMessageDialog(rootPane, "Fruta Cadastrada");
            clear();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clear() {
        jtQuantidade.setText(null);
        jtNome.setText(null);
        jtValor.setText(null);
        jtQuantidade.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseSysten;
    private javax.swing.JButton jbCadastroCoisas;
    private javax.swing.JButton jbLimparCadastroCoisas;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLayeredPane jlpAcoesDeCadatro;
    private javax.swing.JLayeredPane jlpDadosCadastroCoisas;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
