package bms.chamaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent i = getIntent();
        int tipo = i.getIntExtra("tipo",-1);
        final TextView txt = (TextView) findViewById(R.id.txtTela2);

        switch (tipo){
            case 1:
                String nome = i.getStringExtra("nome");
                String ocupacao = i.getStringExtra("ocupacao");

                txt.setText(String.format("Nome: %s,  Ocupacao: %s.", nome, ocupacao));
                break;
            case 2:
                PessoaA pessoaA = (PessoaA) i.getSerializableExtra("PessoaA");
                String msg = String.format("Nome %s, idade: %d.", pessoaA.getNome(), pessoaA.getIdade());

                txt.setText(msg);
                break;
        }

    }
}
