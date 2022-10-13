import java.util.ArrayList;


import java.util.ArrayList;
import java.util.List;
//import java.util.*; 이거 해도 됨


    public class ArrayListEx {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>(); //많이 사용하는 방식. 뒤의 <>에는 데이터타입 생략 가능.

            System.out.println("ArrayList 생성\nlist의 길이 : " + list.size()); // list.size()의 크기 알려줌

            list.add("HTML5");
            list.add("CSS3");
            list.add("Bootstrap5");
            list.add("JS ES6");
            list.add("React");
            list.add("Java");
            list.add("Servlet / JSP");
            list.add("Spring framework");
            list.add("Spring boot");
            list.add("Database(Mysql)");
            list.add("Python");

            System.out.println("\n데이터 추가 후 arraylist의 길이 확인 : " + list.size());
            // 데이터를 추가했기 때문에 arraylist가 11로 출력이 된다. 이게 바로 배열과 arraylist의 차이.

            String str = list.get(5); //5번째 것을 가져온다
            System.out.println("\nlist의 5번 index의 값 : " + str+"\n");

            System.out.println("리스트의 전체 내용 출력 ");

            for(int i =0; i<list.size(); i++){
                System.out.println("리스트 " + i + "번 index의 값 : " + list.get(i));
            }

            System.out.println("\n=====리스트 안 데이터 삭제하기======");

            list.remove(5); //5번 삭제
            list.remove(2); //2번 삭제
            list.remove("React"); //Java 삭제

            System.out.println("\nremove 후 list 변수의 크기" + list.size() + "\n");


            for(int i = 0; i < list.size(); i++){
                System.out.println("리스트" + i +"번 index값의 : " + list.get(i));
            }




//        List 클래스가 ArrayList의 부모이므로 부모 타입의 변수에 자식 클래스 타입인 ArrayList 객체를 대입하여 사용
//        List<String> list2 = new ArrayList<String>(); // 위 아래 중 원하는 방식으로 사용하면 된다
        }
    }

