package lesson6;

class Dog extends Animals {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH))
            System.out.println("Собака пробежала за палочкой " + length + "м.");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH))
            System.out.println("Собака проплыла " + length + "м.");
        else System.out.println("Собака не поплыла");
    }
}

