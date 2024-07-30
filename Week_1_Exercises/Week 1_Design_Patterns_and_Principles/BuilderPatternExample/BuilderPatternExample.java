public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel Core i5", 8)
                .build();
        System.out.println(basicComputer);

        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", 16)
                .withGpu("NVIDIA GeForce RTX 3080")
                .withStorage(1024)
                .build();
        System.out.println(gamingComputer);

        Computer serverComputer = new Computer.Builder("Intel Xeon E5", 32)
                .withStorage(2048)
                .build();
        System.out.println(serverComputer);
    }
}