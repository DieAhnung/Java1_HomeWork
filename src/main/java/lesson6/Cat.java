package lesson6;

class Cat extends Animals {
    private final int MAX_RUN_LENGTH = 200;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {
            System.out.println("Котик пробежал за вкусняшкой " + length +"м.");
        } else {
            System.out.println("Котик ленив и бегать не хочет");
        }
    }


    @Override
    void swim(int length) {
        System.out.println("Котитки боятся воды и плавать отказываются");
    }
}