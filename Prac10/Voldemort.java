package Prac10;

import org.springframework.stereotype.Component;

@Component
public class Voldemort implements Magician {
    @Override
    public void doMagic() {
        System.out.println("Заклинание Волан-де-Морта");
    }
}
