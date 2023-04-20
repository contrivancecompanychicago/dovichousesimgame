import java.lang.Object;

public class Dovichousesimenv extends RealmObject {

    @PrimaryKey
    @RealmField("_id")
    private ObjectId id;
    private String name;
    private int age;

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public void setTerrain(String Terrain) {
        this.terrain = terrain;
    }

    public String getPlace() {
        return place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
