package external;

public class FlacPlayer implements AdvancedMediaPlayer {

    @Override
    public void playFlac(String fileName) {
        System.out.println("Playing flac file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }

}
