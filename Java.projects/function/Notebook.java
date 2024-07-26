package function;

public class Notebook {
    private String hardDisk, model, color, os;
    private Integer id, memory;

    public Notebook(Integer id, String model, String color, String os, String hardDisk, Integer memory) {
        setValues(id, model, color, os, hardDisk, memory);

    }

    public void setValues(Integer id, String model, String color, String os, String hardDisk, Integer memory) {
        this.id = id;
        this.hardDisk = hardDisk;
        this.model = model;
        this.color = color;
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Модель: " + this.model + "\nЦвет: " + this.color + "\nОперационная система: " + this.os
                + "\nЖесткий диск: "
                + this.hardDisk + "\nОЗУ: " + this.memory;

    }
}
