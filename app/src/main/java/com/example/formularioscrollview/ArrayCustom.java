package com.example.formularioscrollview;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.List;


class ArrayCustom extends ArrayAdapter<Lista> {
    private Context context;
    private  int resourceLista;

    public ArrayCustom(@NonNull Context context, int resource, @NonNull List<Lista> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resourceLista = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String nome = getItem(position).getNome();
        String email = getItem(position).getEmail();
        String nascimento = getItem(position).getNascimento();
        String cpf = getItem(position).getCpf();
        String telefone = getItem(position).getTelefone();
        String celular = getItem(position).getCelular();

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resourceLista, parent, false);
        TextView tvNome = convertView.findViewById(R.id.nome);
        TextView tvEmail = convertView.findViewById(R.id.Email);
        TextView tvNascimento = convertView.findViewById(R.id.Nascimento);
        TextView tvCpf = convertView.findViewById(R.id.Cpf);
        TextView tvTelefone = convertView.findViewById(R.id.Telefone);
        TextView tvCelular = convertView.findViewById(R.id.Celular);

        tvNome.setText(nome);
        tvNascimento.setText(nascimento);
        tvEmail.setText(email);
        tvCpf.setText(cpf);
        tvTelefone.setText(telefone);
        tvCelular.setText(celular);

        return convertView;
    }


}







