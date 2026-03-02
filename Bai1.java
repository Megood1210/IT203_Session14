import java.util.LinkedHashSet;

public class Bai1 {
    public static void main(String[] args) {
        String[] input = {"Nguyễn Văn A – Yên Bái","Trần Thị B – Thái Bình","Nguyễn Văn A – Yên Bái","Lê Văn C – Hưng Yên"};

        LinkedHashSet<String> patientSet = new LinkedHashSet<>();

        for (String name : input) {
            patientSet.add(name);
        }

        System.out.print("In ra danh sách gọi khám: ");
        System.out.println(String.join(", ", patientSet));
    }
}