package com.ada.example.primeira.aula.exercicio.aula_01;

public class Main {

    public static void main(String[] args) {
        System.out.println(valorFinal(new Notebook(3000), new Debito()));
        System.out.println(valorFinal(new Notebook(3000), new Credito()));
        System.out.println(valorFinal(new Notebook(3000), new CreditoParcelado()));
    }

    public static String valorFinal(Notebook notebook, TaxaMaquininha tipoPagamento) {
        double valorPagoTaxa = notebook.getPrecoVenda() * tipoPagamento.getValorTaxa();
        double valorRecebidoNotebook = notebook.getPrecoVenda() - valorPagoTaxa;
        return "Valor cobrado da taxa da maquininha pela venda do Notebook no " +
        tipoPagamento.getClass().getSimpleName() + " foi " + valorPagoTaxa +
                " e você irá receber " + valorRecebidoNotebook + " reais.";
    }

}
