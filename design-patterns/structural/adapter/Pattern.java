public class Pattern {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("ogg", "redneck.ogg");
        audioPlayer.play("mp4", "the retinal circus.mp4");
        audioPlayer.play("flac", "ambient.flac");
        audioPlayer.play("avi", "avavi.avi");
    }

}
