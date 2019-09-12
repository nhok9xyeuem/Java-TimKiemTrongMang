

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.println("Moi Ban Nhap Ten Sinh Vien");
        String search = input.nextLine();
        boolean kiemtra = false;
        for (int i = 0; i < students.length; i++) {
            if (search.equalsIgnoreCase(students[i])) {
                System.out.println("sinh vien " + students[i] + " vi tri so : " + i);
                kiemtra = true;
                break;
            }

        }
        if (!kiemtra) {
            System.out.println(" Sinh vien " + search + " khong co trong danh sach");
        }

    }
}
