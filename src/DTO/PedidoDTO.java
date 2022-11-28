/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ronil
 */
public class PedidoDTO {
    
        private int id_pedido;
        private int num_pedido;
        private String produto_pedido;
        private double valor;
        private int quantidade_pedido;
        private String tipoPedido_pedido;
        private double preco_pedido;  

    
    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getProduto_pedido() {
        return produto_pedido;
    }

    public void setProduto_pedido(String produto_pedido) {
        this.produto_pedido = produto_pedido;
    }

    public int getQuantidade_pedido() {
        return quantidade_pedido;
    }

    public void setQuantidade_pedido(int quantidade_pedido) {
        this.quantidade_pedido = quantidade_pedido;
    }

    public String getTipoPedido_pedido() {
        return tipoPedido_pedido;
    }

    public void setTipoPedido_pedido(String tipoPedido_pedido) {
        this.tipoPedido_pedido = tipoPedido_pedido;
    }

    public double getPreco_pedido() {
        return preco_pedido;
    }

    public void setPreco_pedido(double preco_pedido) {
        this.preco_pedido = preco_pedido;
    }
}
  