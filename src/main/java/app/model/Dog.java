package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String saing;

    public Dog() {
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }

    public String getSaing() {
        return saing;
    }

    public void setSaing(String saing) {
        this.saing = saing;
    }
    @Override
    void say() {
        System.out.println(saing);
    }
}
