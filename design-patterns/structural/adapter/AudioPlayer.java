public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // inbuilt support to play ogg music files
        if (audioType.equalsIgnoreCase("ogg"))
            System.out.println("Playing ogg file. Name: " + fileName);
        // mediaAdapter is providing support to play other file formats
        else if (audioType.equalsIgnoreCase("flac") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else
            System.out.println("Invalid media. " + audioType + " format not supported");
    }

}
