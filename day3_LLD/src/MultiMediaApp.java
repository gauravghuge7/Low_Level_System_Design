import medias.*;

public class MultiMediaApp {
    public static void main(String[] args){

        Media video = new Video("movie.mp4");
        Media audio = new Audio("song.mp3");
        Media image = new Image("picture.jpg");

        Media img= new ImageAdaptor(image);


    }
}
