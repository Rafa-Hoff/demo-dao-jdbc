package db;

public class DbIntegrityException extends RuntimeException {
    private static final long serialVersion = 1L;

    public DbIntegrityException(String msg) {
        super(msg);
    }
}
