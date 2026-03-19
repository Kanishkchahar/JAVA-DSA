import java.util.Arrays;

public class Trigonometric {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi);
        double[] values = new double[12];
        values[0] = Math.sin(Math.PI);
        values[1] = Math.cos(Math.PI);
        values[2] = Math.tan(Math.PI);
        values[3] = Math.asin(1.0);
        values[4] = Math.acos(1.0);
        values[5] = Math.atan(1.0);
        values[6] = Math.atan2(1,Math.PI);
        values[7] = Math.sinh(1.0);
        values[8] = Math.cosh(1.0);
        values[9] = Math.tanh(1.0);
        values[10] = Math.toDegrees(Math.PI);
        values[11]= Math.toRadians(180);

        System.out.println(Arrays.toString(values));

    }
}
