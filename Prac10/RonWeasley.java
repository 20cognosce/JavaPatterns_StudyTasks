package Prac10;

import org.springframework.stereotype.Component;

@Component
public class RonWeasley implements Magician {
    @Override
    public void doMagic() {
        System.out.println("Заклинание Рона Уизли");
    }
}
