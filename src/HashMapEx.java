import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();

        System.out.println("HashMap의 크기 : " + map.size());

        map.put("아이유" , 30);
        map.put("유인나", 32);
        map.put("유재석",50);
        map.put("홍길동",30);
        map.put("이순신",40);

        System.out.println("HashMap의 크기 : " + map.size()); //5가 되었다

        System.out.println("\t홍길동의 나이 : " + map.get("홍길동")); //해당 키가 가지고 있는 값 출력
        System.out.println();

        Set<String> keyset = map.keySet(); //가지고 있는 모든 키를 가져온다.
        Iterator<String> keyIter = keyset.iterator();

        while(keyIter.hasNext()){ //키에 뭐가 있는지 모를 때 데이터를 모두 프린트해본다.
            String key = keyIter.next();
            int value = map.get(key); //get으로 데이터 추출
            System.out.println("key : " + key + "\tvalue" + value); //순서대로 나오지는 않는다. 그래도 데이터 전부 다 프린트
        }
        System.out.println();

        if(map.containsKey("김종국")){ //만약 김종국 있다면
            map.remove("김종국"); //김종국 삭제하라
        }

        map.remove("이순신"); //삭제. 다 프린트 하고난후
        map.remove("홍길동");
        System.out.println("HashMap의 크기 : " + map.size());

        map.clear();
        System.out.println("\n ------clear한 후--------");
        System.out.println("HashMap의 크기 : " + map.size());
    }
}
