package one.digitalinovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author Guilherme
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
