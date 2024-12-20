/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.PedidoDAO;
import DTO.PedidoDTO;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danil
 */
public class CaixaTela extends javax.swing.JFrame {

    private PedidoDTO objPedidoDTO;

    /**
     * Creates new form CaixaTela
     */
    public CaixaTela() {
        super("Caixa");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caixaPanel = new javax.swing.JPanel();
        idTotemLabel = new javax.swing.JLabel();
        idPedidoTextField = new javax.swing.JTextField();
        metodoPagamentoLabel = new javax.swing.JLabel();
        totalPagamentoLabel = new javax.swing.JLabel();
        pagamentoTotalTextField = new javax.swing.JTextField();
        metodoPagamentoComboBox = new javax.swing.JComboBox<>();
        valorRecebidoLabel = new javax.swing.JLabel();
        valorRecebidoTextField = new javax.swing.JTextField();
        trocoLabel = new javax.swing.JLabel();
        trocoTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProdutosTotemTable = new javax.swing.JTable();
        emitirNotaFiscalButton = new javax.swing.JButton();
        calcularPagamentoButton = new javax.swing.JButton();
        mostrarPedidoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        caixaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Caixa\n"));
        caixaPanel.setToolTipText("");

        idTotemLabel.setText("Id_Pedido");

        metodoPagamentoLabel.setText("Método de Pagamento");

        totalPagamentoLabel.setText("Total a Pagar");

        pagamentoTotalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoTotalTextFieldActionPerformed(evt);
            }
        });

        metodoPagamentoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de crédito", "Cartão de débito", "Dinheiro", "Pix" }));

        valorRecebidoLabel.setText("Valor Recebido");

        trocoLabel.setText("Troco");

        listaProdutosTotemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Num Pedido", "Nome", "Valor", "Qtd", "Tipo Pedido", "ValorTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listaProdutosTotemTable);

        emitirNotaFiscalButton.setBackground(new java.awt.Color(255, 255, 253));
        emitirNotaFiscalButton.setText("Emitir Nota Fiscal");
        emitirNotaFiscalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emitirNotaFiscalButtonActionPerformed(evt);
            }
        });

        calcularPagamentoButton.setBackground(new java.awt.Color(255, 255, 253));
        calcularPagamentoButton.setText("Calcular Pagamento");
        calcularPagamentoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPagamentoButtonActionPerformed(evt);
            }
        });

        mostrarPedidoButton.setText("Mostrar Pedido");
        mostrarPedidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPedidoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout caixaPanelLayout = new javax.swing.GroupLayout(caixaPanel);
        caixaPanel.setLayout(caixaPanelLayout);
        caixaPanelLayout.setHorizontalGroup(
            caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caixaPanelLayout.createSequentialGroup()
                .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(caixaPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(idTotemLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idPedidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarPedidoButton))
                    .addGroup(caixaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(caixaPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(caixaPanelLayout.createSequentialGroup()
                                        .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(totalPagamentoLabel)
                                            .addComponent(metodoPagamentoLabel)
                                            .addComponent(valorRecebidoLabel)
                                            .addComponent(trocoLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(metodoPagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(trocoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(valorRecebidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pagamentoTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(emitirNotaFiscalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(caixaPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(calcularPagamentoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        caixaPanelLayout.setVerticalGroup(
            caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, caixaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idPedidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idTotemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostrarPedidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, caixaPanelLayout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalPagamentoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagamentoTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(metodoPagamentoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(metodoPagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valorRecebidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorRecebidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(caixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trocoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trocoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(calcularPagamentoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(emitirNotaFiscalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(caixaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caixaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emitirNotaFiscalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emitirNotaFiscalButtonActionPerformed
        JOptionPane.showMessageDialog(null, "EMITINDO NOTA FISCAL....");
       
    }//GEN-LAST:event_emitirNotaFiscalButtonActionPerformed

    private void mostrarPedidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPedidoButtonActionPerformed
        String idPedido;
        
       idPedido = idPedidoTextField.getText();
       
       int idPedidoo = Integer.parseInt(idPedido);
       
       PedidoDTO objPedidoDTO = new PedidoDTO();
       objPedidoDTO.setId_pedido(idPedidoo);
       
       PedidoDAO objPedidoDAO = new PedidoDAO();
       objPedidoDAO.MostrarPedido(objPedidoDTO);
       
       listarPedido(objPedidoDTO);
        
       
       CarregarCampos();
       
    }//GEN-LAST:event_mostrarPedidoButtonActionPerformed

    private void calcularPagamentoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPagamentoButtonActionPerformed
        String totalPagar  = pagamentoTotalTextField.getText();  
        String valorRecebido = valorRecebidoTextField.getText();
          
        
            double totalPagarr = Double.parseDouble(totalPagar);
            double valorRecebidoo = Double.parseDouble(valorRecebido);
            double resultado = valorRecebidoo - totalPagarr ;
            
            String resultadoFinal = Double.toString(resultado);
            
           trocoTextField.setText(resultadoFinal);
            
    }//GEN-LAST:event_calcularPagamentoButtonActionPerformed

    private void pagamentoTotalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoTotalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagamentoTotalTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CaixaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaixaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaixaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel caixaPanel;
    private javax.swing.JButton calcularPagamentoButton;
    private javax.swing.JButton emitirNotaFiscalButton;
    private javax.swing.JTextField idPedidoTextField;
    private javax.swing.JLabel idTotemLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaProdutosTotemTable;
    private javax.swing.JComboBox<String> metodoPagamentoComboBox;
    private javax.swing.JLabel metodoPagamentoLabel;
    private javax.swing.JButton mostrarPedidoButton;
    private javax.swing.JTextField pagamentoTotalTextField;
    private javax.swing.JLabel totalPagamentoLabel;
    private javax.swing.JLabel trocoLabel;
    private javax.swing.JTextField trocoTextField;
    private javax.swing.JLabel valorRecebidoLabel;
    private javax.swing.JTextField valorRecebidoTextField;
    // End of variables declaration//GEN-END:variables
        
    int totalPagar;
    int num;
    int var= 0;
    double valorPagar = 0;
    private void listarPedido(PedidoDTO objPedidoDTO){
        
        try {
            
            PedidoDAO objPedidoDAO = new PedidoDAO();
            
            DefaultTableModel model = (DefaultTableModel) listaProdutosTotemTable.getModel();
            model.setNumRows(0);
            
            
            ArrayList<PedidoDTO> lista = objPedidoDAO.MostrarPedido(objPedidoDTO);
            
            
            for(num = 0; num <lista.size(); num++){
                model.addRow(new Object[]{
                        lista.get(num).getId_pedido(),
                        lista.get(num).getNum_pedido(),
                        lista.get(num).getProduto_pedido(),
                        lista.get(num).getValor(),
                        lista.get(num).getQuantidade_pedido(),
                        lista.get(num).getTipoPedido_pedido(),
                        lista.get(num).getPreco_pedido(),
                        
                });
                
               
                
              
              
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar Pedido VIEW:" + e);
        }
    }

    
    private void CarregarCampos(){
        
               // PedidoDAO objPedidoDAO = new PedidoDAO();
                
               // ArrayList<PedidoDTO> lista = objPedidoDAO.MostrarPedido(objPedidoDTO);
                 JOptionPane.showMessageDialog(null, num);
                 
                for(var = 0; var <=num; var++){
                    if(var == 0){
                        valorPagar = 0;
                    }      
                    
                  String valor = listaProdutosTotemTable.getModel().getValueAt(var, 6).toString();
                  
                 double result = Double.parseDouble(valor);
                 
                 
                 
                  valorPagar = valorPagar + result;
                  
                   Math.round(result);
                   
                    String resultadoFinal = Double.toString(valorPagar);
                    
                     
                    pagamentoTotalTextField.setText(resultadoFinal);
                    
            }          
            
    }

}
