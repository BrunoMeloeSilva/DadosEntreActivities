package bms.chamaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Tela2Activity.class);
                i.putExtra("tipo", 1);
                i.putExtra("nome", "Bruno Silva");
                i.putExtra("ocupacao","Pesquisador");
                startActivity(i);
            }
        });

        Button btnPessoaA = (Button) findViewById(R.id.btnPessoaA);
        btnPessoaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Tela2Activity.class);
                i.putExtra("tipo", 2);
                i.putExtra("PessoaA", new PessoaA("Bruno", 32));
                startActivity(i);
            }
        });

        Button btnPessoaB = (Button) findViewById(R.id.btnPessoaB);
        btnPessoaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Tela2Activity.class);
                i.putExtra("tipo", 3);
                i.putExtra("PessoaB", new PessoaB("Bruno Silva", 32));
                startActivity(i);
                //Envia o objeto da mesma forma, seja com Parcelable ou Serializable.
            }
        });
    }
}
