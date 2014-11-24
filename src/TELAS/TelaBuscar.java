/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TELAS;

import RN.BuscaRN;
import VO.BuscaVO;
import VO.CongressoVO;
import VO.EditorasVO;
import VO.JulgarArtigoVO;
import VO.PatrocinadoresVO;
import VO.PessoasVO;
import VO.PublicacoesVO;
import VO.SessoesVO;
import VO.SubmeterArtigoVO;
import VO.UsuariosVO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lennon
 */
public class TelaBuscar extends javax.swing.JFrame {

    /**
     * Creates new form TelaBuscar
     */
    
//    DefaultTableModel dtm = new DefaultTableModel();
    public static TelaBuscar instancia;
    
    protected TelaBuscar() {
        initComponents();
        BuscaVO bvo = BuscaVO.getInstancia();
        bvo.dtm = (DefaultTableModel) tbPesquisa.getModel();
    }
    
    public static TelaBuscar getInstancia() {
        if (instancia == null)
            instancia = new TelaBuscar();
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscar = new javax.swing.JLabel();
        lblImgBuscar = new javax.swing.JLabel();
        lblJanela = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        imgFundo = new javax.swing.JLabel();

        setTitle("IFIP Congressos //Buscar");
        setMinimumSize(new java.awt.Dimension(663, 430));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        lblBuscar.setFont(new java.awt.Font("Eras Medium ITC", 0, 10)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setText("Fazer Busca");
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(lblBuscar);
        lblBuscar.setBounds(570, 40, 60, 13);

        lblImgBuscar.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblImgBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblImgBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/lupa32.png"))); // NOI18N
        lblImgBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(lblImgBuscar);
        lblImgBuscar.setBounds(580, 0, 40, 40);

        lblJanela.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        lblJanela.setForeground(new java.awt.Color(255, 102, 0));
        lblJanela.setText("[JANELA]");
        getContentPane().add(lblJanela);
        lblJanela.setBounds(20, 40, 500, 28);

        lblTitle.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Pesquisar");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 390, 29);

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(340, 350, 100, 28);

        btnEnviar.setText("ENVIAR SELEÇÃO");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(470, 350, 160, 28);

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPesquisa.getTableHeader().setReorderingAllowed(false);
        tbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPesquisa);
        tbPesquisa.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tbPesquisa.getColumnModel().getColumnCount() > 0) {
            tbPesquisa.getColumnModel().getColumn(0).setResizable(false);
            tbPesquisa.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 610, 240);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/fundo.jpg"))); // NOI18N
        imgFundo.setName("imgFundo"); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-10, -10, 710, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    private int definirTela = 0;
//    private int linha;
//    private int nautor;
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false); //fecha tela de busca
        
        BuscaVO bvo = BuscaVO.getInstancia();
        
        bvo.dtm.setNumRows(0);
        
        if (bvo.getDefinirTela() == 1){ //Congresso
            TelaCongresso telaCongresso = TelaCongresso.getInstancia(); //chama instancia
            telaCongresso.setVisible(true); //chama tela buscada
        }
        
        if (bvo.getDefinirTela() == 2){ //Editora
            TelaEditoras telaEditora = TelaEditoras.getInstancia(); //chama instancia
            telaEditora.setVisible(true); //chama tela buscada
        }
        
        if (bvo.getDefinirTela() == 3){ //Pessoa
            TelaPessoas telaPessoa = TelaPessoas.getInstancia(); //chama instancia
            telaPessoa.setVisible(true); //chama tela buscada
        }
        
        if (bvo.getDefinirTela() == 4){ //Patrocinador
            TelaPatrocinadores telaPatrocinador = TelaPatrocinadores.getInstancia(); //chama instancia
            telaPatrocinador.setVisible(true); //chama tela buscada
        }
        
        if (bvo.getDefinirTela() == 5){ //Usuários
            TelaUsuarios telaUsuario = TelaUsuarios.getInstancia(); //chama instancia
            telaUsuario.setVisible(true); //chama tela buscada
        }
        
        if (bvo.getDefinirTela() == 6){ //Autores
            TelaSubmeterArtigo telaSubmeterArtigo = TelaSubmeterArtigo.getInstancia(); //chama instancia
            telaSubmeterArtigo.setVisible(true); //chama tela buscada
        }
        
        if (bvo.getDefinirTela() == 7){ //Sessao
            TelaSessoes telaSessoes = TelaSessoes.getInstancia(); //chama instancia
            telaSessoes.setVisible(true); //chama tela buscada
        }
        
        if (bvo.getDefinirTela() == 8){ //Moderador Sessao
            TelaSessoes telaSessoes = TelaSessoes.getInstancia(); //chama instancia
            telaSessoes.setVisible(true); //chama tela buscada
        }
        
        if (bvo.getDefinirTela() == 9 || bvo.getDefinirTela() == 10){ //Publicacao
            TelaPublicacoes telaPublicacoes = TelaPublicacoes.getInstancia(); //chama instancia
            telaPublicacoes.setVisible(true); //chama tela buscada
        }
        
        if (bvo.getDefinirTela() == 11){ //Julgar Artigos
            TelaJulgarArtigo telaJulgarArtigo = TelaJulgarArtigo.getInstancia(); //chama instancia
            telaJulgarArtigo.setVisible(true); //chama tela buscada
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void fazerBusca (){
        
        BuscaVO bvo = BuscaVO.getInstancia();
        BuscaRN brn = BuscaRN.getInstancia();
        brn.fazerBusca(bvo);
        
    }
    
    private void lblImgBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgBuscarMouseClicked
        // TODO add your handling code here:
        
        BuscaVO bvo = BuscaVO.getInstancia();
        BuscaRN brn = BuscaRN.getInstancia();
        String mensagem = brn.fazerBusca(bvo);
        
    }//GEN-LAST:event_lblImgBuscarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        // TODO add your handling code here:
        
        BuscaVO bvo = BuscaVO.getInstancia();
        BuscaRN brn = BuscaRN.getInstancia();
        String mensagem = brn.fazerBusca(bvo);
        
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        BuscaVO bvo = BuscaVO.getInstancia();
        
        if (bvo.getDefinirTela() == 1){
            this.lblJanela.setText("Buscar Congresso");
        }
        if (bvo.getDefinirTela() == 2 || bvo.getDefinirTela() == 10){
            this.lblJanela.setText("Buscar Editora");
        }
        if (bvo.getDefinirTela() == 3){
            this.lblJanela.setText("Buscar Pessoa");
        }
        if (bvo.getDefinirTela() == 4){
            this.lblJanela.setText("Buscar Patrocinador");
        }
        if (bvo.getDefinirTela() == 5){
            this.lblJanela.setText("Buscar Usuário");
        }
        if (bvo.getDefinirTela() == 6){
            this.lblJanela.setText("Buscar Autor");
        }
        if (bvo.getDefinirTela() == 7){
            this.lblJanela.setText("Buscar Sessão");
        }
        if (bvo.getDefinirTela() == 8){
            this.lblJanela.setText("Buscar Moderador");
        }
        if (bvo.getDefinirTela() == 9 || bvo.getDefinirTela() == 11){
            this.lblJanela.setText("Buscar Artigo");
        }
    }//GEN-LAST:event_formWindowActivated

    private void tbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisaMouseClicked
        // TODO add your handling code here:
        
        BuscaVO bvo = BuscaVO.getInstancia();    
        bvo.setLinha(Integer.parseInt((String) tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 0)));
                
    }//GEN-LAST:event_tbPesquisaMouseClicked
    
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        
        BuscaVO bvo = BuscaVO.getInstancia();
        
        bvo.dtm.setNumRows(0);
        
        this.setVisible(false);
        
        if (bvo.getDefinirTela() == 1){ //Congresso
            
            CongressoVO cvo = CongressoVO.getInstancia();
            cvo.setId(bvo.getLinha());
            
            TelaCongresso telaCongresso = TelaCongresso.getInstancia();
            telaCongresso.atualizaCampos(1);
            telaCongresso.setVisible(true);
            
        }
        
        if (bvo.getDefinirTela() == 2){ //Editora
            
            EditorasVO evo = EditorasVO.getInstancia();
            evo.setId(bvo.getLinha());
            
            TelaEditoras telaEditoras = TelaEditoras.getInstancia();
            telaEditoras.preencheTela(1);
            telaEditoras.setVisible(true);
            
        }
        
        if (bvo.getDefinirTela() == 3){ //Pessoa
            
            PessoasVO pvo = PessoasVO.getInstancia();
            pvo.setId(bvo.getLinha());
            
            TelaPessoas telaPessoas = TelaPessoas.getInstancia();
            telaPessoas.preencheTela(1);
            telaPessoas.setVisible(true);
        
        }
        
        if (bvo.getDefinirTela() == 4){ //Patrocinador
            
            PatrocinadoresVO pvo = PatrocinadoresVO.getInstancia();
            pvo.setId(bvo.getLinha());
            
            TelaPatrocinadores telaPatrocinadores = TelaPatrocinadores.getInstancia();
            telaPatrocinadores.preencheTela(1);
            telaPatrocinadores.setVisible(true);
            
        }
        
        if (bvo.getDefinirTela() == 5){ //Usuários
            
            UsuariosVO uvo = UsuariosVO.getInstancia();
            uvo.setId(bvo.getLinha());
            
            TelaUsuarios telaUsuarios = TelaUsuarios.getInstancia();
            telaUsuarios.preencheTela(1);
            telaUsuarios.setVisible(true);
            
        }
        
        if (bvo.getDefinirTela() == 6){ //Autores
            
            SubmeterArtigoVO savo = SubmeterArtigoVO.getInstancia();
            savo.setId(bvo.getLinha());
            
            if(bvo.getNautor() == 1)
                savo.setNautor(1);
            if(bvo.getNautor() == 2)
                savo.setNautor(2);
            if(bvo.getNautor() == 3)
                savo.setNautor(3);
            
            TelaSubmeterArtigo telaSubmissao = TelaSubmeterArtigo.getInstancia();
            telaSubmissao.preencheTela(1);
            telaSubmissao.setVisible(true);
            
        }
        
        if (bvo.getDefinirTela() == 7){ //Sessao
            
            SessoesVO svo = SessoesVO.getInstancia();
            svo.setId(bvo.getLinha());
            
            TelaSessoes telaSessao = TelaSessoes.getInstancia();
            telaSessao.preencheTela(1);
            telaSessao.setVisible(true);
            
        }
        
        if (bvo.getDefinirTela() == 8){ //Moderador
            
            SessoesVO svo = SessoesVO.getInstancia();
            svo.setId(bvo.getLinha());
            
            TelaSessoes telaSessao = TelaSessoes.getInstancia();
            telaSessao.preencheModerador(1);
            telaSessao.setVisible(true);
            
        }
        
        if (bvo.getDefinirTela() == 9){ //Artigo Publicacao
            
            PublicacoesVO pvo = PublicacoesVO.getInstancia();
            pvo.setId(bvo.getLinha());
            
            TelaPublicacoes publica = TelaPublicacoes.getInstancia();
            publica.preencheTela(1);
            publica.setVisible(true);
            
        }
        
        if (bvo.getDefinirTela() == 10){ //Editora Publicacao
            
            PublicacoesVO pvo = PublicacoesVO.getInstancia();
            pvo.setId(bvo.getLinha());
            
            TelaPublicacoes publica = TelaPublicacoes.getInstancia();
            publica.preencheTela(2);
            publica.setVisible(true);
            
        }
        
        if (bvo.getDefinirTela() == 11){ //Artigo Julgar
            
            JulgarArtigoVO javo = JulgarArtigoVO.getInstancia();
            javo.setId(bvo.getLinha());
            
            TelaJulgarArtigo telaJulgarArtigo = TelaJulgarArtigo.getInstancia();
            telaJulgarArtigo.preencheTela(1);
            telaJulgarArtigo.setVisible(true);
        }
        
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblImgBuscar;
    private javax.swing.JLabel lblJanela;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tbPesquisa;
    // End of variables declaration//GEN-END:variables

}