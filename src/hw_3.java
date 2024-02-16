import java.util.Arrays;

public class hw_3 {
    public static void main(String[] args) {
        boolean flag = false;
        int amountOfNumbers = 0;
        int sum = 0;

        double[] numbers = {5.3, 2.5, -8.0, 56.6, -22.7, -6.9, 12.0, 8.5, 90.0, 26.3, -44.1, -33.5, 45.0, 65.2, 88.8};
        System.out.println(Arrays.toString(numbers));

        for (double num: numbers) {
            if (num < 0){
                flag = true;
            }if (num > 0 && flag){
                amountOfNumbers++;
                sum += num;
            }
        }
        System.out.println(sum + "/" + amountOfNumbers);
        //System.out.println(sum);
    }
}