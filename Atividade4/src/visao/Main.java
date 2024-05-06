package visao;

import javax.swing.JOptionPane;

import modelagem.Pessoa;
import negocio.ArvoreBinaria;

public class Main {

	public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Exemplo de inser��o de pessoas na �rvore
        arvore.inserir(new Pessoa("Jo�o"));
        arvore.inserir(new Pessoa("Maria"));
        arvore.inserir(new Pessoa("Ana"));
        arvore.inserir(new Pessoa("Carlos"));

        // Exemplo de exibi��o dos nomes em ordem
        System.out.println("Pessoas em ordem:");
        arvore.emOrdem();

        // Exemplo de intera��o com JOptionPane
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        arvore.inserir(new Pessoa(nome));

        System.out.println("Pessoas em ordem ap�s a inser��o:");
        arvore.emOrdem();
    }
}