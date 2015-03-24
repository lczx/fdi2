import external.AdvancedMediaPlayer;
import external.Mp4Player;
import external.FlacPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("flac"))
            advancedMusicPlayer = new FlacPlayer();
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("flac"))
            advancedMusicPlayer.playFlac(fileName);
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer.playMp4(fileName);
    }

}
