package com.example.formularioscrollview;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {
    EditText ed01,ed02,ed03,ed04,ed05,ed06,ed07;
    Button btn01;
    ListView lista;
    ArrayList<Lista> valores;


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
        ed07 = findViewById(R.id.ed07);
        btn01 = findViewById(R.id.btn01);
        lista = findViewById(R.id.lista);

        valores = new ArrayList<>();
        valores.add(new Lista("Nome: Renan de Andrade Terra ", "email: renanandradeterra@hotmail.com", "Data de Nascimento: 04/01/2003", "Cpf: 42535234242", "Telefone: 253264426", "Celular: 985434355"));
        valores.add(new Lista("Nome: Elaine Silva de Andrade ", "email: renanandradeterra@hotmail.com", "Data de Nascimento: 04/01/2003", "Cpf: 42535234242", "Telefone: 253264426", "Celular: 985434355"));
        valores.add(new Lista("Nome: Heliesio Terra da Silva", "email: renanandradeterra@hotmail.com", "Data de Nascimento: 04/01/2003", "Cpf: 42535234242", "Telefone: 253264426", "Celular: 985434355"));
        ArrayCustom arrayCustom = new ArrayCustom(this,R.layout.tabela,valores);

        lista.setAdapter(arrayCustom);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(ed01.getText().toString().isEmpty() && ed02.getText().toString().isEmpty() && ed03.getText().toString().isEmpty() && ed04.getText().toString().isEmpty() && ed05.getText().toString().isEmpty() && ed06.getText().toString().isEmpty()))
                {
                    valores.add(new Lista("Nome: "+ed01.getText(),"Email :"+ed06.getText(),"Data de Nascimento: "+ed03.getText(),"Cpf: "+ed02.getText(),"Telefone: "+ed04.getText(),"Celular: "+ed05.getText()));
                    ed01.setText("");
                    ed02.setText("");
                    ed03.setText("");
                    ed04.setText("");
                    ed05.setText("");
                    ed06.setText("");
                    lista.setAdapter(arrayCustom);
                    Toast toast = Toast.makeText(MainActivity.this, "Dados enviados", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                valores.remove(i);
                lista.setAdapter(arrayCustom);
            }
        });

//        ed07.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                (MainActivity.this).arrayCustom.getFilter().filter(charSequence);
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });


    }
}