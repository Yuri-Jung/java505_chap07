import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java"); // Java가 중복되어 있기 때문에 하나 제거되어 4개라고 카운트 된다.
        set.add("JDBC");
        set.add("Servlet / JSP");
        set.add("Java");
        set.add("mybatis");

        int size = set.size();
        System.out.println("HashSet에 저장된 수 : " + size);

        Iterator<String> iterator = set.iterator();//순서없고 반복문 없다.
//        Iterator는 정말 많이 사용된다. 내가 리스트를 쓰든, 배열을 쓰든, map을 쓰든 사용방법이 동일하다.
//        hasnext로 확인하고, next()로 다음 데이터 가져오고.

        while (iterator.hasNext()){ //반복문에 넣으면 하나씩 꺼낼 수 있다.
            String element = iterator.next(); //깃발 옆으로 이동하면서 꽃는다.
            System.out.println("\t" + element);
        }

//        for(String item : set) forin문 foreach문이라고도 불림. 이런 방법도 가능 하지만 while문을 많이 사용하는 추세

        set.remove("JDBC"); //정확하게 찍어서 삭제해야 한다.
        set.remove("mybatis");

        System.out.println("\nHashSet에 저장된 수 : " + set.size());

        iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t" + element);
        }
        
        set.clear(); // 데이터 다 삭제시킴. 전체 다 비움.

        if(set.isEmpty()){
            System.out.println("HashSet이 비어있음");
        }
    }
}
