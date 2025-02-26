package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 80);
        MemberConstruct member2 = new MemberConstruct("user2", 12, 90);

        MemberConstruct[] memberInits = {member1, member2};

        for (MemberConstruct s : memberInits) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 점수: " + s.grade);
        }
    }
}
