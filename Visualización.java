package com.mycompany.youtube.com;



public class Visualizacion {

      private Usuario espectador;

    private Video video;



    public Visualizacion(Usuario espectador, Video video) {

        this.espectador = espectador;

        this.video = video;

    }



    public Usuario getEspectador() {

        return espectador;

    }



    public void setEspectador(Usuario espectador) {

        this.espectador = espectador;

    }



    public Video getVideo() {

        return video;

    }



    public void setVideo(Video video) {

        this.video = video;

    } 

}
