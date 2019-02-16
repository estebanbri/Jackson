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
    
    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre;
    }

}
