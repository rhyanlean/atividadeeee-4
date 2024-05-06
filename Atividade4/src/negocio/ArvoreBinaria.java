package negocio;

import modelagem.Pessoa;

public class ArvoreBinaria {
	class No {
        Pessoa pessoa;
        No esquerda;
        No direita;

        public No(Pessoa pessoa) {
            this.pessoa = pessoa;
            esquerda = null;
            direita = null;
        }
    }

    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    // M�todo para inserir uma pessoa na �rvore
    public void inserir(Pessoa pessoa) {
        raiz = inserirRec(raiz, pessoa);
    }

    private No inserirRec(No raiz, Pessoa pessoa) {
        if (raiz == null) {
            raiz = new No(pessoa);
            return raiz;
        }

        if (pessoa.getNome().compareTo(raiz.pessoa.getNome()) < 0)
            raiz.esquerda = inserirRec(raiz.esquerda, pessoa);
        else if (pessoa.getNome().compareTo(raiz.pessoa.getNome()) > 0)
            raiz.direita = inserirRec(raiz.direita, pessoa);

        return raiz;
    }

    // M�todo para percorrer a �rvore em ordem
    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(No raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.esquerda);
            System.out.println(raiz.pessoa.getNome());
            emOrdemRec(raiz.direita);
        }
    }


    {
    }
    }


