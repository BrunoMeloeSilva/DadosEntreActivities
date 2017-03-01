package bms.chamaactivity;

import java.io.Serializable;

/**
 * Created by brunosilva on 28/02/17.
 *
 * Implementa a interface Serializable apenas para que se possa passar um objeto de PessoaA
 *  entre as activities. Esta é a forma mais simples de se passar objeto entre activities.
 * Existe uma segunda forma de se passar objetos entre activities que é muito mais eficiente
 *  (completa, permatica e recomendada pelo Google, pois é quase 12x mais rápida, diz Nelson
 *  Glauber) que é usando a interface Parcelable, que veremos no exemplo com PessoaB.
 */

public class PessoaA implements Serializable {
    private String nome;
    private int idade;

    public PessoaA(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
