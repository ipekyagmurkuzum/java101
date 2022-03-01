public class DiziHarmonik {
    public static void main(String[] args) {
        int[] list = {2,56,48,-5,95,66};
        double harmonik = 1.0;
        for (int i =0;i<list.length;i++) {
            harmonik+=(1.0/list[i]);
        }
        System.out.print(harmonik);
    }
}
