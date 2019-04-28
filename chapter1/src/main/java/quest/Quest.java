package quest;

public interface Quest {

    default void embark() {
        System.out.println("Rescue default embarked");
    }
}
