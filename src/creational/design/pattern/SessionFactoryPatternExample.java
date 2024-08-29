package creational.design.pattern;

class SessionFactory {
    private static SessionFactory instance;
     int abc;
    private SessionFactory() { }

    public static SessionFactory getInstance() {
        if (instance == null) {
            instance = new SessionFactory();
            System.out.println("SessionFactory Pattern: Single instance accessed!");
        }
        else if(instance !=null) {
        	System.out.println("session factory is already present");
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("SessionFactory Pattern: Single instance accessed!");
    }
}

public class SessionFactoryPatternExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactory.getInstance();
        sessionFactory.abc=10;
        System.out.println(sessionFactory.abc);
//        sessionFactory.showMessage();
        SessionFactory.getInstance();
        
    }
}

