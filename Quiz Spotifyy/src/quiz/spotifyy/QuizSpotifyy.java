/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.spotifyy;

/**
 *
 * @author sebastian
 */
public class QuizSpotifyy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cancion canción = new cancion(101010101, "ill be okey", "limpBizkit", (int) 5.60, 2000);
        System.out.println("Id: " + canción.getId());
        System.out.println("Titulo: " + canción.getTitulo());
        System.out.println("Autor: " + canción.getAutor());
        System.out.println("Duracion: " + canción.getDuracion());
        System.out.println("Anio de creacion: " + canción.getAnioC());
    }

}
