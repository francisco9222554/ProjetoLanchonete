package com.mycompany.projetolanchonete.model;

public class ItemPedido {
    private int idProduto;
    private String nomeProduto;
    private double precoUnitario;
    private int quantidade;

    public ItemPedido(int idProduto, String nomeProduto, double precoUnitario, int quantidade) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public int getIdProduto() { return idProduto; }
    public String getNomeProduto() { return nomeProduto; }
    public double getPrecoUnitario() { return precoUnitario; }
    public int getQuantidade() { return quantidade; }
}