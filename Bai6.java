import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Bai6 {
    static class Patient {
        String name;
        int age;
        String department;

        public Patient(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Patient> patientList = new ArrayList<>();

        patientList.add(new Patient("Lan", 45, "Tim mạch"));
        patientList.add(new Patient("Hùng", 50, "Nội tiết"));
        patientList.add(new Patient("Mai", 60, "Tim mạch"));

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patientList) {
            if (!departmentMap.containsKey(p.department)) {
                departmentMap.put(p.department, new ArrayList<>());
            }

            departmentMap.get(p.department).add(p);
        }

        System.out.println("Output Map Structure:");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Key \"" + entry.getKey() + "\" -> Value " + entry.getValue());
        }

        String searchDept = "Tim mạch";
        System.out.println("\nDanh sách bệnh nhân khoa " + searchDept + ":");
        if (departmentMap.containsKey(searchDept)) {
            for (Patient p : departmentMap.get(searchDept)) {
                System.out.print(p.name);
            }
        } else {
            System.out.println("Không có khoa này");
        }

        String maxDept = "";
        int maxCount = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > maxCount) {
                maxCount = entry.getValue().size();
                maxDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + maxDept + " đang đông nhất (" + maxCount + " bệnh nhân).");
    }
}