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
        String nome = i.getStringExtra("nome");
        String ocupacao = i.getStringExtra("ocupacao");

        TextView txt = (TextView) findViewById(R.id.txtTela2);
        txt.setText(String.format("Nome: %s,  Ocupacao: %s.", nome, ocupacao));
    }
}
