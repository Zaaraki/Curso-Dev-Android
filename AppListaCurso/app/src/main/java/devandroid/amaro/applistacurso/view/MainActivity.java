package devandroid.amaro.applistacurso.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.amaro.applistacurso.R;
import devandroid.amaro.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pessoa = new Pessoa();
        outraPessoa = new Pessoa();

        pessoa.setPrimeiroNome("Amaro");
        pessoa.setSobrenome("Neto");
        pessoa.setCursoDesejado("Aaaaaaa");
        pessoa.setTelefone("888888888");

        outraPessoa.setPrimeiroNome("Rivet");
        outraPessoa.setSobrenome("Little");
        outraPessoa.setCursoDesejado("Math");
        outraPessoa.setTelefone("989999999");

        dadosPessoa = "Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobrenome();
        dadosPessoa += " Curso: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone: ";
        dadosPessoa += pessoa.getTelefone();

        dadosOutraPessoa = "Primeiro Nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobrenome();
        dadosOutraPessoa += " Curso: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone: ";
        dadosOutraPessoa += outraPessoa.getTelefone();


        int parada=0;
    }
}