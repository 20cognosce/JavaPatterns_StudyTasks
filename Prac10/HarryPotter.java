package Prac10;

import org.springframework.stereotype.Component;

@Component
public class HarryPotter implements Magician {
    @Override
    public void doMagic() {
        System.out.println("Заклинание Гарри Поттера");
    }
}
