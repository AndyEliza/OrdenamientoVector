package organizador;
public class MetodoShellSort {
    public void orden(int vector[]) {
        int num = vector.length;
        for (int increment = num / 2; increment > 0; increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < num; i++) {
                for (int j = i; j >= increment && vector[j - increment] > vector[j]; j -= increment) {
                    int temp = vector[j];
                    vector[j] = vector[j - increment];
                    vector[j - increment] = temp;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
