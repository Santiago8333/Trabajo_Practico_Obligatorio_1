package com.in.trabajo_prctico_obligatorio_1;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
private List<Palabra>listaPalabra;


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        listaPalabra = new ArrayList<>();
        listaPalabra.add(new Palabra(R.drawable.arbol,"tree","arbol"));

    }

    public void BuscarPalabra(String palabra){
        Palabra  palabraEncontrada = new Palabra(R.drawable.notfound,"not found","palabra no encontrada");
        for(Palabra p : listaPalabra){
            if(p.getPalabraEsp().equalsIgnoreCase(palabra)){
                palabraEncontrada  = p;

            }
        }
        Intent intent = new Intent(getApplication(), TraductorActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("palabra",palabraEncontrada );
        intent.putExtra("palabra",bundle);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplication().startActivity(intent);


    }


}
