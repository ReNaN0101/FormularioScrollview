package com.example.formularioscrollview;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText ed01,ed02,ed03,ed04,ed05,ed06;
    Button btn01;
    ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela1);
        ed01 = findViewById(R.id.ed01);
        ed02 = findViewById(R.id.ed02);
        ed03 = findViewById(R.id.ed03);
        ed04 = findViewById(R.id.ed04);
        ed05 = findViewById(R.id.ed05);
        ed06 = findViewById(R.id.ed06);
        btn01 = findViewById(R.id.btn01);
        lista = findViewById(R.id.lista01);
        ArrayList<String> dados = new ArrayList<>();
        dados.add("Nome: Renan de Andrade Terra\nCpf:12312312\nData de nascimento: 04/01/2003\nNumero de Telefone:123123123\nNumero de Celular:12312312\nEmail:dadadadda@hotmail.com");
        dados.add("Nome: Bianca Aparecida de Andrade Terra\nCpf:12312312\nData de nascimento: 18/02/2005\nNumero de Telefone:123123123\nNumero de Celular:12312312\nEmail:dadadadda@hotmail.com");
        dados.add("Nome: Heliésio Terra da Silva\nCpf:12312312\nData de nascimento: 20/10/1962\nNumero de Telefone:123123123\nNumero de Celular:12312312\nEmail:dadadadda@hotmail.com");
        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                dados);
        lista.setAdapter(adapter);

    }
}