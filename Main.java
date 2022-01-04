import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao (cm): ");
        float height = sc.nextFloat();
        System.out.println("Nhập cân nặng (kg): ");
        float weight = sc.nextFloat();

        float BMI = weight / (height * height) * 100 * 100;
        String result;
        if (BMI < 18.5){
            result = "Thiếu cân";
        } else if (BMI < 25){
            result = "Bình thường";
        } else if (BMI < 30){
            result = "Thừa cân";
        } else {
            result = "Béo phì";
        }

        System.out.printf("BMI: %.2f.\nKết luận: %s.", BMI, result);
    }
}
