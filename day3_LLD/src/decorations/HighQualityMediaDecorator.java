package decorations;

import medias.Media;

public class HighQualityMediaDecorator extends MediaDecorator{

    public HighQualityMediaDecorator(Media decorateMedia) {
        super(decorateMedia);
    }

    public  void play() {
        super.play();

        System.out.println("enhancing the playback quality");
    }
}
