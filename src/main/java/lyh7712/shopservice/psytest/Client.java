package lyh7712.shopservice.psytest;

//예를 들어 Mp3 파일을 재생하도록 요구사항이 변경 되었다고 하자.
//요구사항을 만족 시키기 위해서는 SoundPlayer의 play() 메소드를 수정하여야 한다.
// 그러나 이러한 소스코드 변경은 OCP 원칙에 위배된다.



public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        client.solution("01034234323");

    }

    public String solution(String phone_number) {
        String result1 = phone_number.substring(phone_number.length() - 4, phone_number.length()); // 4323
        String result2 = phone_number.substring(0, phone_number.length() - 4).replaceAll("[\\d]", "*"); // 0102323
        System.out.println(result2 + result1);
        return result2;
    }
}
