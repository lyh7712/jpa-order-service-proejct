package lyh7712.shopservice.psytest;

//예를 들어 Mp3 파일을 재생하도록 요구사항이 변경 되었다고 하자.
//요구사항을 만족 시키기 위해서는 SoundPlayer의 play() 메소드를 수정하여야 한다.
// 그러나 이러한 소스코드 변경은 OCP 원칙에 위배된다.


public class Client {

    public static void main(String[] args) {
        KindOfSound sound = new KindOfSound(new Mp3());
        KindOfSound sound2 = new KindOfSound(new Wav());

        sound.play();
        sound2.play();
    }
}
