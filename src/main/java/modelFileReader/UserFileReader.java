package modelFileReader;

public class UserFileReader implements Comparable<UserFileReader> {

    private Integer id;
    private String name;

    public UserFileReader(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(UserFileReader o) {
        return this.getName().compareTo(o.getName());
    }
}
