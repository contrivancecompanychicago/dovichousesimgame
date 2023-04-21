import java.lang.Object;

public abstract class FirebaseApp implements TimeZoneApi {
}


FileInputStream serviceAccount =
  new FileInputStream("path/to/serviceAccountKey.json");

FirebaseOptions options = new FirebaseOptions.Builder()
  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
  .setDatabaseUrl("https://eugenia-g-panem.firebaseio.com")
  .build();

FirebaseApp.initializeApp(options);
