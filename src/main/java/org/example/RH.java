package org.example;

public class RH {

    public static String formula = "salario * insalubridade + ferias + comissao";

    public static double calcularRemuneracao(double salario, double insalubridade, double ferias, double comissao) {
        String expressao;
        expressao = formula.replace("salario", Double.toString(salario));
        expressao = expressao.replace("insalubridade", Double.toString(insalubridade));
        expressao = expressao.replace("ferias", Double.toString(ferias));
        expressao = expressao.replace("comissao", Double.toString(comissao));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
