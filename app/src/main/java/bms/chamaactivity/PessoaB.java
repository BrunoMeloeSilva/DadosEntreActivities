package bms.chamaactivity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by brunosilva on 28/02/17.
 * O Google não recomenda usar Serializable para passar objetos "Pesados" ou passar grandes
 *  quantidades de objetos (vetores, listas, etc) entre activities, para esses casos a recomendacao
 *  e usar Parcelable.
 */

public class PessoaB implements Parcelable {

    private String nome;
    private int idade;

    public PessoaB(String nome, int idade) {
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

    //Daqui pra baixo é para atender a interface Parcelable
    private PessoaB(Parcel from){
        setNome(from.readString());
        setIdade(from.readInt());
    }

    public static final Parcelable.Creator<PessoaB> CREATOR = new Parcelable.Creator<PessoaB>(){

        public PessoaB createFromParcel(Parcel in){
            return new PessoaB(in);
        }

        public PessoaB[] newArray(int size){
            return new PessoaB[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //Deve-se passar os valores na MESMA ORDEM da leitura em "private PessoaB(Parcel from){..}"
        dest.writeString(getNome());
        dest.writeInt(getIdade());
    }
}
