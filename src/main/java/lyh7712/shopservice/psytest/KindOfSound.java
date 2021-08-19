package lyh7712.shopservice.psytest;

public class KindOfSound {

    private SoundPlayer soundPlayer;

    public KindOfSound(SoundPlayer soundPlayer) {
        this.soundPlayer = soundPlayer;
    }

    public void play() {
        soundPlayer.play();
    }
}
