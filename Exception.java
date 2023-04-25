import java.lang.Exception;
import io.sentry.Sentry;

public abstract class Exception implements Main{
  
}

try {
  throw new Exception("This is a test.");
} catch (Exception e) {
  Sentry.captureException(e);
}
