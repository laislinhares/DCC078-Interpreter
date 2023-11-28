package org.example;

public class Funcionario {

    private double salario;
    private double insalubridade;
    private double ferias;
    private double comissao;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(double insalubridade) {
        this.insalubridade = insalubridade;
    }

    public double getFerias() {
        return ferias;
    }

    public void setFerias(double ferias) {
        this.ferias = ferias;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularRemuneracao() {
        return RH.calcularRemuneracao(this.salario, this.insalubridade, this.ferias, this.comissao);
    }
}
