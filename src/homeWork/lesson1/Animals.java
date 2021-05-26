package homeWork.lesson1;

public class Animals {
    private String breed;

    public Animals(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
