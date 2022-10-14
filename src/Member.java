public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

//    object 타입: 자바의 최상위 클래스

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){ //member타입인지 확인
            Member member = (Member) obj; //자식 클래스로 변환 obj를 멤버 클래스로 변환하여 삽입
            return member.name.equals(this.name) && (member.age == age);
//            앞의 네임은 넘어온거 뒤꺼는 new로 넣은거.(홍길동, 30)
        }
        else {
            return false; // 아니면 완전 다른 클래스
        }
    }

    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }
}
