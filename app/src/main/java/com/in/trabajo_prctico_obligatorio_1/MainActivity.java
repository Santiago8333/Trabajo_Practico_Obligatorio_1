package com.in.trabajo_prctico_obligatorio_1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.in.trabajo_prctico_obligatorio_1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel mv;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
/*
        mv.getmPalabra().observe(this, new Observer<Palabra>() {
            @Override
            public void onChanged(Palabra palabra) {
                Bundle bundle = new Bundle();


            }
        });
*/
        binding.btnTraducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener el texto del EditText
                String palabra = binding.etPalabra.getText().toString();
                mv.BuscarPalabra(palabra);
            }
        });
        //setContentView(R.layout.activity_main);

    }
}