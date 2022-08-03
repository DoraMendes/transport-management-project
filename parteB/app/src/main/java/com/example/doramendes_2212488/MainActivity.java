package com.example.doramendes_2212488;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.doramendes_2212488.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); // adicionei
        setContentView(binding.getRoot()); // adicionei
    }

    public void onClickButton(View view) {
        //startActivity(SegundaActivity.createIntent(MainActivity.this, position)); //contexto não pode ser apenas "this"
        Intent intent = new Intent(this, SegundaAtividade.class);
        startActivity(intent);
    }
}