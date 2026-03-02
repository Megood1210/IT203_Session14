import java.util.Comparator;
import java.util.TreeSet;

public class Bai5 {
    static class Patient {
        String name;
        int severity;
        int arrivalTime;

        public Patient(String name, int severity, int arrivalTime) {
            this.name = name;
            this.severity = severity;
            this.arrivalTime = arrivalTime;
        }

        @Override
        public String toString() {
            return name + " (Mức " + severity + ", đến lúc " + formatTime(arrivalTime) + ")";
        }

        private String formatTime(int time) {
            int hour = time / 100;
            int minute = time % 100;
            return hour + ":" + String.format("%02d", minute);
        }
    }

    public static void main(String[] args) {
        Comparator<Patient> priorityComparator = new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.severity != p2.severity) {
                    return p1.severity - p2.severity;
                }

                return p1.arrivalTime - p2.arrivalTime;
            }
        };

        TreeSet<Patient> emergencyQueue = new TreeSet<>(priorityComparator);

        emergencyQueue.add(new Patient("Bệnh nhân A", 3, 800));
        emergencyQueue.add(new Patient("Bệnh nhân B", 1, 815));
        emergencyQueue.add(new Patient("Bệnh nhân C", 1, 805));

        for (Patient p : emergencyQueue) {
            System.out.println(p);
        }
    }
}