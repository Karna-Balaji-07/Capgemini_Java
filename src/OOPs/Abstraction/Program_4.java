package OOPs.Abstraction;

abstract class MediaPlayer
{
    public void play(){
        System.out.println("Media player is playing");
    }

    abstract void loadMethod();
}

class Audio extends MediaPlayer{
    @Override
    void loadMethod() {
        System.out.println("AudioPlayer is loading");
    }
}

class Video extends MediaPlayer{
    @Override
    void loadMethod() {
        System.out.println("Video player is loading");
    }
}

public class Program_4 {
    public static void main(String[] args) {
        Audio audio = new Audio();
        Video video = new Video();
        audio.loadMethod();
        audio.play();
        video.loadMethod();
        audio.play();
    }
}
