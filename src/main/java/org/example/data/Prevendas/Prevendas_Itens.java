package org.example.data.Prevendas;

public class Prevendas_Itens {
    private int prevenda,prevenda_item,item,produto;
    private float quantidade,preco_bruto,desconto,preco_liquido,total_item;

    public Prevendas_Itens(int prevenda,
                           int prevenda_item,
                           int item,
                           int produto,
                           float quantidade,
                           float preco_bruto,
                           float desconto,
                           float preco_liquido,
                           float total_item) {
        this.prevenda = prevenda;
        this.prevenda_item = prevenda_item;
        this.item = item;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco_bruto = preco_bruto;
        this.desconto = desconto;
        this.preco_liquido = preco_liquido;
        this.total_item = total_item;
    }

    public int getPrevenda() {
        return prevenda;
    }

    public void setPrevenda(int prevenda) {
        this.prevenda = prevenda;
    }

    public int getPrevenda_item() {
        return prevenda_item;
    }

    public void setPrevenda_item(int prevenda_item) {
        this.prevenda_item = prevenda_item;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco_bruto() {
        return preco_bruto;
    }

    public void setPreco_bruto(float preco_bruto) {
        this.preco_bruto = preco_bruto;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getPreco_liquido() {
        return preco_liquido;
    }

    public void setPreco_liquido(float preco_liquido) {
        this.preco_liquido = preco_liquido;
    }

    public float getTotal_item() {
        return total_item;
    }

    public void setTotal_item(float total_item) {
        this.total_item = total_item;
    }
}
