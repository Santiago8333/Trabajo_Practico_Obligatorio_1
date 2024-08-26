package com.in.trabajo_prctico_obligatorio_1;

import java.io.Serializable;

public class Palabra implements Serializable {
    private int foto;
    private String palabraEsp,palabraEng;

    public Palabra(int foto,String palabraEng,String palabraEsp){
        this.foto = foto;
        this.palabraEsp = palabraEsp;
        this.palabraEng=palabraEng;
    }

    public String getPalabraEsp() {
        return palabraEsp;
    }

    public void setPalabraEsp(String palabraEsp) {
        this.palabraEsp = palabraEsp;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getPalabraEng() {
        return palabraEng;
    }

    public void setPalabraEng(String palabraEng) {
        this.palabraEng = palabraEng;
    }
}
