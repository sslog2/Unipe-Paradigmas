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
    public static void main(String[] args) {
        Animal cachorro = new Cachorro(); 
        Animal gato = new Gato(); 
        
        System.out.println(cachorro.som()); 
        System.out.println(gato.som()); 
    }
}
