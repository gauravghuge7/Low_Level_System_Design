package decorations;

import medias.Media;

public abstract class MediaDecorator implements Media {

    protected Media decorateMedia;

    public MediaDecorator(Media decorateMedia) {
        this.decorateMedia = decorateMedia;
    }

    @Override
    public void play() {
        this.decorateMedia.play();
    }


}
