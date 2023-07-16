public abstract class TransportVehicle {
    private String modelName;
    private int wheelsCount;

    public TransportVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void service() {
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }

    }

        public String getModelName() {
            return modelName;
        }

        public int getWheelsCount() {
            return wheelsCount;
        }
    }
