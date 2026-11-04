public class Anonymous {
    public static void main(String[] args) {
        Dogs dogs1 = new Dogs();
        Dogs dogs2 = new Dogs() {
            @Override
            void speak() {
                System.out.println("My girlfriend is Dog she said i want to Die she just want that i stay with me");
            }
        };

        dogs1.speak();
        dogs2.speak();

    }

    public static class Dogs {
        void speak() {
            System.out.println("The dogs says Waooo! Waoooo!");
        }
    }
}
