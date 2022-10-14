import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties(); //String 타입으로 고정되어있기 때문에 넣지 않아도 좋다. 객체 생성
        String path = PropertiesEx.class.getResource("database.properties").getPath();//현재 코드에 소스 가져오겠다.
//        getResource에서 리소스 가져오겠다. ()안에 위치넣음.getPath는 파일명 들어간다.]

        path = URLDecoder.decode(path,"utf-8"); //경로안에 한글이 포함되어 있을 때 한 번씩 깨지는 경우있다.
        System.out.println("파일경로 : " + path); ///C:/java505/intellij/chap07_/out/production/chap07_/database.properties

        properties.load(new FileReader(path)); //filereader를 통해 해당 파일가져온다.
//         properties.load 하면서 파일의 내용을 읽어옴

        String driver = properties.getProperty("driver"); //(=)앞의 값이 key, 뒤의 값이 value
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
