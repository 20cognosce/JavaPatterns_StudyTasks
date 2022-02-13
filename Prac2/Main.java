package Prac2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> peopleToFilter = humanSupplier.get();
        final Once once = new Once(); //to create 2 linebreaks before weight sorting output
        String result = peopleToFilter.stream()
                .sorted((a, b) ->
                {
                    if (a.getBirthDate().isEqual(b.getBirthDate()))
                        return 0;
                    if (a.getBirthDate().isBefore(b.getBirthDate()))
                        return 1;
                    else
                        return -1;
                })
                .peek(e -> System.out.print("Sorted by birthdate: " + e))
                .filter((a) -> a.getAge() < 50)
                .peek(e -> System.out.println(" \tFiltered by age less than 50: " + e))
                .sorted(Comparator.comparingInt(Human::getWeight))
                .peek(e -> {
                    once.foo(() -> System.out.print("\n\n"));
                    System.out.println("Sorted by weight: " + e);
                })
                .map(Human::getFirstName).collect(Collectors.joining(" "));

        System.out.println(result);
    }

    public static class Once {
        private final AtomicBoolean done = new AtomicBoolean();

        public void foo(Runnable task) {
            if (done.get()) return;
            if (done.compareAndSet(false, true)) {
                task.run();
            }
        }
    }

    static Supplier<ArrayList<Human>> humanSupplier = () -> {
        ArrayList<Human> people = new ArrayList<>();
        people.add(new Human(
                33, "Evgeniy", "Zaycev", LocalDate.of(1988, 11, 13), 91));
        people.add(new Human(
                45, "Alexander", "Alex", LocalDate.of(1976, 3, 1), 83));
        people.add(new Human(
                59, "Anatoly", "Sobolev", LocalDate.of(1962, 5, 25), 68));
        people.add(new Human(
                25, "Maria", "Medvedeva", LocalDate.of(1997, 2, 10), 60));
        people.add(new Human(
                19, "Dmitry", "Chukov", LocalDate.of(2002, 8, 27), 75));
        return people;
    };
}
