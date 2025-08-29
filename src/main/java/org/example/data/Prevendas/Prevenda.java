package org.example.data.Prevendas;

public class Prevenda {
    private int prevenda;
    private String chave,data;
    private float total_bruto,total_desconto,total_liquido;

    public Prevenda(int prevenda, String chave, String data, float total_bruto, float total_desconto, float total_liquido) {
        this.prevenda = prevenda;
        this.chave = chave;
        this.data = data;
        this.total_bruto = total_bruto;
        this.total_desconto = total_desconto;
        this.total_liquido = total_liquido;
    }

    public int getPrevenda() {
        return prevenda;
    }

    public void setPrevenda(int prevenda) {
        this.prevenda = prevenda;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getTotal_bruto() {
        return total_bruto;
    }

    public void setTotal_bruto(float total_bruto) {
        this.total_bruto = total_bruto;
    }

    public float getTotal_desconto() {
        return total_desconto;
    }

    public void setTotal_desconto(float total_desconto) {
        this.total_desconto = total_desconto;
    }

    public float getTotal_liquido() {
        return total_liquido;
    }

    public void setTotal_liquido(float total_liquido) {
        this.total_liquido = total_liquido;
    }
}
