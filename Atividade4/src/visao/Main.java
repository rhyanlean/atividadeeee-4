package visao;

import javax.swing.JOptionPane;

import modelagem.Pessoa;
import negocio.ArvoreBinaria;

public class Main {

	public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Exemplo de inserção de pessoas na árvore
        arvore.inserir(new Pessoa("João"));
        arvore.inserir(new Pessoa("Maria"));
        arvore.inserir(new Pessoa("Ana"));
        arvore.inserir(new Pessoa("Carlos"));

        // Exemplo de exibição dos nomes em ordem
        System.out.println("Pessoas em ordem:");
        arvore.emOrdem();

        // Exemplo de interação com JOptionPane
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        arvore.inserir(new Pessoa(nome));

        System.out.println("Pessoas em ordem após a inserção:");
        arvore.emOrdem();
    }
}