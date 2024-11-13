package medias;

public class Audio implements Media{

    private String fileName;

    public Audio() {
    }

    public Audio(String filename) {
        this.fileName = filename;
    }

    @Override
    public void play() {
        System.out.println("Playing the Audio : "+ fileName);
    }
}
