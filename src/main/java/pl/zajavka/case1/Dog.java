package pl.zajavka.case1;

public class Dog extends Animal {
    private String name;

    @Override
    public String whatIsYourName() {
        return "My name is Dog";
    }
}
