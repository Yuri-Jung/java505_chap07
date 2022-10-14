import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
//        문제1) HashSet을 사용하여 로또 번호 7개를 생성하는 프로그램을 작성하세요
//        HashSet을 사용하면 중복 체크 부분이 필요없다.

        for(int i = 0; i<7; i ++) {
            int rnd = (int) ((Math.random() * 45) + 1);
            System.out.print(rnd + "\t");
        }

        Set <Integer> set = new HashSet<>();

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.println("\t" + element);
        }



        //선생님버전
//        Set <Integer> lotto = new HashSet<>();
//        int count = 0;
//
//        while(count < 7) {
//            int rnd = ((int) Math.random() *45)+1;
//
//            if(lotto.add(rnd)){
//                count ++;
//
//                if(lotto.size() == 7){
//                    break;
//                }
//            }
//        }
//
//        Integer<Integer> iter = lotto.iterator();
//        String number = "";
//        while(iter.hasNext()){
//            int num = iter.next();
//            number += String.valueOf(num) + "";
//        }
//        System.out.println(number);

        ////여기까지

//      내가 한 부분 주석 처리 안하니까 오류난다..

    Set<Member> set1 = new HashSet<>();
    set1.add(new Member("홍길동",30));   // new사용하면서 주소값이 달라져서 2개가 출력됨
    set1.add(new Member("홍길동",30));  //하지만 동일한 값으로 인식되면 한 개로 출력이 됨.

        System.out.println("\n총 객체 수 : " + set1.size());
    }
}
