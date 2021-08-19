package lyh7712.shopservice.psytest;

public class TestDto {

    private String name;

    private String url;

    public TestDto(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Test toEntity() {
        Test test = new Test();
        this.setName(name);
        this.setUrl(url);
        return test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.id = 10L;

    }
}
