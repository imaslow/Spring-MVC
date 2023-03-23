package web.car;

public class Car {
    private String marka;
    private String model;
    private String hozyain;

    public Car() {
    }

    public Car(String marka, String model, String hozyain) {
        this.marka = marka;
        this.model = model;
        this.hozyain = hozyain;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHozyain() {
        return hozyain;
    }

    public void setHozyain(String hozyain) {
        this.hozyain = hozyain;
    }

}
