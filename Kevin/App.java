public class App {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();

        if (true) {
            arr = new ArrayList<>();
        }

        for (int i = 0; i < 20; i++) {
            arr.set(i);
        }

        for (int index = 0; index < 20; index++) {
            System.out.println(arr.get(index));
        }
    }
}
