class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class MatchChecker {
    public static void check(String input) throws NoMatchException {
        if (!input.equals("India")) {
            throw new NoMatchException("String does not match 'India'");
        } else {
            System.out.println("String matches 'India'");
        }
    }

    public static void main(String[] args) {
        try {
            check("USA");
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
