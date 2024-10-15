import java.util.ArrayList;
import java.util.List;

class Animal {
    public String som() {
        return "som que animal faz";
    }
}

class Cachorro extends Animal {
    @Override
    public String som() {
        return "Au au";
    }
}

class Gato extends Animal {
    @Override
    public String som() {
        return "Miau";
    }
}

public class main {
    public static void fazerSom(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        fazerSom(animais);
    }
}
