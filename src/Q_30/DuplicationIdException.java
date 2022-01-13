package Q_30;

public class DuplicationIdException extends Exception {

private static final long serialVersionUID = 1L;
  DuplicationIdException()
{
 super("player ID must be unique");
}
}
