abstract class LibraryMember {
    String memberName, memberId;
    LibraryMember(String n, String id) { memberName = n; memberId = id; }
    abstract int calculateFine(int overdueDays);
}

class StudentMember extends LibraryMember {
    StudentMember(String n, String id) { super(n, id); }
    int calculateFine(int d) { return d * 2; }
}
class FacultyMember extends LibraryMember {
    FacultyMember(String n, String id) { super(n, id); }
    int calculateFine(int d) { return d * 1; }
}
class GuestMember extends LibraryMember {
    GuestMember(String n, String id) { super(n, id); }
    int calculateFine(int d) { return d * 5; }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryMember[] members = {
            new StudentMember("Ankit", "S101"),
            new FacultyMember("Rahul", "F202"),
            new GuestMember("Neha", "G303")
        };
        for (LibraryMember m : members) {
            System.out.println(m.memberName + " fine: " + m.calculateFine(3));
        }
        String searchId = "F202";
        for (LibraryMember m : members) {
            if (m.memberId.equals(searchId)) {
                System.out.println("Found: " + m.memberName);
            }
        }
    }
}
