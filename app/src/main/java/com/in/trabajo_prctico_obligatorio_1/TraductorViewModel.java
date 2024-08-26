package com.in.trabajo_prctico_obligatorio_1;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class TraductorViewModel extends AndroidViewModel {
    private MutableLiveData<Palabra> palabraLiveData;

    public TraductorViewModel(@NonNull Application application) {
        super(application);
    }
    public LiveData<Palabra> getPalabraLiveData() {
        if(palabraLiveData==null){
               palabraLiveData = new MutableLiveData<>();
        }
        return palabraLiveData;
    }
    public void rescatarDatos(Intent intent) {
        Bundle bundle = intent.getBundleExtra("palabra");
        if (bundle != null) {
            Palabra palabra = (Palabra) bundle.getSerializable("palabra");
            if (palabra != null) {
                palabraLiveData.setValue(palabra); // Actualiza el LiveData con la palabra recibida
            }
        }
    }
}
