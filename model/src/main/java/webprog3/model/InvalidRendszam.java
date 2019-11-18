package webprog3.model;

public class InvalidRendszam extends Throwable {
    public InvalidRendszam(String rendszam) {
        super(rendszam);
    }
}
