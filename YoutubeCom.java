package com.mycompany.youtube.com;

public class YoutubeCom {

    public static void main(String[] args) {
     Usuario usuario= new Usuario("Luis Alberto");
        Video video = new Video("Aprendiendo java",2400,"https;//youtube.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        
        
        Usuario usuario2=new Usuario("Alfonso Miguel");
        Comentario comment1=new Comentario("Ya esta reprobado chabo :)",usuario2);
        System.out.println("El usuario "+ usuario2.getNombre()+ "  publicó el comentario "+ comment1.getContenido() );
    }
}
