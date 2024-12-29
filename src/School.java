import java.util.ArrayList;
import java.util.List;
public class School {
    private List<Person> members;
    public School() {
        members=new ArrayList<>();
    }
    public void addMember(Person member) {
            this.members.add(member);
    }
    public String toString() {
        String result="All members:\n";
        for (Person member : members) {
            result += member.toString()+'\n';
        }
        return result;
    }
}
