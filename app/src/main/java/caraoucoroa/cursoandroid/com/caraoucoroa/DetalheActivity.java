package caraoucoroa.cursoandroid.com.caraoucoroa;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView Moeda;
    private ImageView botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        Moeda = (ImageView) findViewById(R.id.MoedaId);
        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);


        Bundle extra = getIntent().getExtras();
        if(extra != null){

            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("cara"))
                //imagem cara
            Moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
        }else{
                //imagem coroa
            Moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));

        }


        botaoVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class));
            }
        });

    }
}
