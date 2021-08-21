package lyh7712.shopservice.psytest;

//예를 들어 Mp3 파일을 재생하도록 요구사항이 변경 되었다고 하자.
//요구사항을 만족 시키기 위해서는 SoundPlayer의 play() 메소드를 수정하여야 한다.
// 그러나 이러한 소스코드 변경은 OCP 원칙에 위배된다.


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Client {


    public static void main(String[] args) {

        List<TestObject> list = new ArrayList<>();


        TestObject object1 = new TestObject(1L, "test");
        TestObject object2 = new TestObject(2L, "test2");

        list.add(object1);
        list.add(object2);

        TestObject testObject = list.stream()
                .filter(o -> o.getName() == "test2")
                .findFirst()
                .orElseThrow();

        System.out.println(testObject.getName());
    }
}
