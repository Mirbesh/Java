package function;

public class Notebook {
    private String hardDiskUnit, model, color, os;
    private Integer id, hardDisk, memory;

    public Notebook(Integer id, String model, String color, String os, Integer hardDisk, String hardDiskUnit, Integer memory) {
        setValues(id, model, color, os, hardDisk, hardDiskUnit, memory);

    }

    public void setValues(Integer id, String model, String color, String os, Integer hardDisk, String hardDiskUnit, Integer memory) {
        this.id = id;
        this.hardDisk = hardDisk;
        this.hardDiskUnit = hardDiskUnit;
        this.model = model;
        this.color = color;
        this.os = os;
        this.memory = memory;
    }

    public Boolean findIsMemory(Integer ozu) {
        boolean res = false;
        if (this.memory == ozu) {
            res = true;
        }
        return res;
    }
    public Boolean findIsHardDisk(Integer hardDisk) {
        boolean res = false;
        if (this.hardDisk == hardDisk) {
            res = true;
        }
        return res;
    }

    public Boolean findIsOs(String os) {
        boolean res = false;
        if (this.os.toLowerCase() == os.toLowerCase()) {
            res = true;
        }
        return res;
    }
    
    public Boolean findIsColor(String color) {
        boolean res = false;
        if (this.color.toLowerCase() == color.toLowerCase()) {
            res = true;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Модель: " + this.model + "\nЦвет: " + this.color + "\nОперационная система: " + this.os
                + "\nЖесткий диск: "
                + this.hardDisk + " " + this.hardDiskUnit + "\nОЗУ: " + this.memory;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hardDisk == null) ? 0 : hardDisk.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ((memory == null) ? 0 : memory.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (hardDisk == null) {
            if (other.hardDisk != null)
                return false;
        } else if (!hardDisk.equals(other.hardDisk))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (memory == null) {
            if (other.memory != null)
                return false;
        } else if (!memory.equals(other.memory))
            return false;
        return true;
    }

}
