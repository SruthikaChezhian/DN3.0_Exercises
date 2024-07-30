public class Computer {
    private String cpu;
    private int ram;
    private int storage;
    private String gpu;
    private String os;
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private String gpu;
        private String os;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder withStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder withGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder withOs(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", gpu='" + gpu + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}