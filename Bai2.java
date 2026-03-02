import java.util.HashMap;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        HashMap<String, String> drugMap = new HashMap<>();

        drugMap.put("T01", "Paracetamol");
        drugMap.put("T02", "Ibuprofen");
        drugMap.put("T03", "Aspirin");
        drugMap.put("T04", "Amoxicillin");
        drugMap.put("T05", "Vitamin C");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã thuốc: ");
        String code = scanner.nextLine();

        if (drugMap.containsKey(code)) {
            System.out.println("Tên thuốc: " + drugMap.get(code));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }

    }
}