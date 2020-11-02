import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence
                        .createEntityManagerFactory("h_test");

        EntityManager entityManager = factory.createEntityManager();
        Engine engine = new Engine(entityManager);

        engine.run();

    }

}
