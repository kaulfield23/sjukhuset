package edu.lernia.labb3;

public class Patient {
    private String name;
    private String sickness;

    Patient(String name) {
        this(name, null);
    }

    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    boolean isSick() {

        if (sickness != null) {
            return true;
        } else {
            return false;
        }

    }

    String getName() {
        return name;
    }

    String getSickness() {
        return sickness;
    }

    void takeMedication(Medicine medicine) {
        if (medicine.getTreatmentName() == sickness) {
            this.sickness = null;
        }
    }
}
