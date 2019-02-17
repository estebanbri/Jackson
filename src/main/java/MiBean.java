import com.fasterxml.jackson.annotation.JsonProperty;

public class MiBean {

    @JsonProperty("id")
    private String id;

    @JsonProperty("MINOMBRE")
    private String nombre;

    public MiBean(){}

    public MiBean(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre;
    }

}
