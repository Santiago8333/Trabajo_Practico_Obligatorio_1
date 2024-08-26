package com.in.trabajo_prctico_obligatorio_1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.in.trabajo_prctico_obligatorio_1.databinding.ActivityTraductorBinding;

public class TraductorActivity extends AppCompatActivity {
    private TraductorViewModel traductorViewModel;
    private ActivityTraductorBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        traductorViewModel= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(TraductorViewModel.class);
        binding=ActivityTraductorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // Observar cambios en el LiveData
        traductorViewModel.getPalabraLiveData().observe(this, palabra -> {
                if (palabra != null) {
                    binding.tvTraducida.setText(palabra.getPalabraEng());
                    binding.img.setImageResource(palabra.getFoto());
                }
        });

         traductorViewModel.rescatarDatos(getIntent());
    }
}