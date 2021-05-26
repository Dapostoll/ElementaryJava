package homeWork.lesson1;

public class Animal {
    private String breed;

    public Animal(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
