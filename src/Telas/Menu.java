/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import BackEnd.AtualizadorHorario;
import Controllers.Database;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Administração
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() throws SQLException {
        initComponents();
        AplicaNimbusLookAndFeel.pegaNimbus();
        mostrarHora();
        this.setExtendedState(MAXIMIZED_BOTH);
        Database conexao1 = new Database();
        atualizaAlunos(conexao1);
        URL url = this.getClass().getResource("/Imagens/01.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        relogio = new javax.swing.JLabel();
        labelImagem = new javax.swing.JLabel();
        qtdAlunos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastraAluno = new javax.swing.JMenuItem();
        editaAluno = new javax.swing.JMenuItem();
        desativarAlunos = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        retiraPasse = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prefeitura de Bombinhas - Santa Catarina");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        relogio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        relogio.setForeground(new java.awt.Color(0, 0, 255));
        relogio.setText("Relógio");

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoCopia.png"))); // NOI18N

        qtdAlunos.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        qtdAlunos.setText("Alunos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Quantidade de Alunos Cadastrados:");

        jMenu1.setText("Alunos");

        cadastraAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        cadastraAluno.setText("Cadastrar");
        cadastraAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(cadastraAluno);

        editaAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        editaAluno.setText("Editar/Atualizar");
        editaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(editaAluno);

        desativarAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        desativarAlunos.setText("Desativar todos os alunos");
        desativarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desativarAlunosActionPerformed(evt);
            }
        });
        jMenu1.add(desativarAlunos);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem3.setText("Alunos Inativos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Retirada de Passes");

        retiraPasse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        retiraPasse.setText("Iniciar Retirada de Passe");
        retiraPasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiraPasseActionPerformed(evt);
            }
        });
        jMenu2.add(retiraPasse);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem5.setText("Relatório por Aluno");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem6.setText("Relatório por Data");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem1.setText("Relatório por Instituição");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jMenuItem2.setText("Relatório por Curso");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(labelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(relogio)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdAlunos)))
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdAlunos)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relogio)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastraAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraAlunoActionPerformed
        // TODO add your handling code here:
        CadastraAluno exibe = null;
        try {
            exibe = new CadastraAluno(this);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        exibe.setVisible(true);
        exibe.requestFocus();


    }//GEN-LAST:event_cadastraAlunoActionPerformed

    public static void atualizaAlunos(Database conexao1) throws SQLException {
        qtdAlunos.setText(String.valueOf(conexao1.quantosAlunos()));
    }

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        // TODO add your handling code here:
        fechar();
    }//GEN-LAST:event_sairMouseClicked

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_sairActionPerformed

    private void editaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaAlunoActionPerformed
        // TODO add your handling code here:
        BuscaAluno exibe = new BuscaAluno();
        exibe.setVisible(true);
    }//GEN-LAST:event_editaAlunoActionPerformed

    private void desativarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desativarAlunosActionPerformed
        // TODO add your handling code here:
        int numAlunos = 0, resp = 0;
        boolean alterado;
        Database conexao = new Database();
        try {
            numAlunos = conexao.quantosAlunos();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

        resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja colocar " + numAlunos + " alunos como inativos? Esta opção não pode ser desfeita futuramente");
        if (resp == JOptionPane.YES_OPTION) {
            alterado = conexao.todosInativos();
            if (alterado) {
                JOptionPane.showMessageDialog(null, numAlunos + " alunos foram colocados como inativos!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma alteração foi efetuada!");
        }
    }//GEN-LAST:event_desativarAlunosActionPerformed

    private void retiraPasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retiraPasseActionPerformed
        // TODO add your handling code here
        BuscaAlunoRetira busca = new BuscaAlunoRetira();
        busca.setVisible(true);
    }//GEN-LAST:event_retiraPasseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Relatorio_Instituicao relatorio = new Relatorio_Instituicao();
        relatorio.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Relatorio_Aluno relatorioAluno = new Relatorio_Aluno();
        relatorioAluno.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Relatorio_Data relatorioData = new Relatorio_Data();
        relatorioData.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        AlunosInativos inativos = new AlunosInativos();
        inativos.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Relatorio_Curso relatorioCurso = new Relatorio_Curso();
        relatorioCurso.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public void mostrarHora() {
        AtualizadorHorario ah = new AtualizadorHorario(relogio);
        ah.mostrarData(true);
        Thread thHora = ah;
        thHora.start();
    }

    public boolean fechar() {
        int resp = 0;
        resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?");
        if (resp == JOptionPane.YES_OPTION) {
            System.exit(0);
            return true;
        } else {
            return false;
        }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastraAluno;
    private javax.swing.JMenuItem desativarAlunos;
    private javax.swing.JMenuItem editaAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel labelImagem;
    public static javax.swing.JLabel qtdAlunos;
    private javax.swing.JLabel relogio;
    private javax.swing.JMenuItem retiraPasse;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
