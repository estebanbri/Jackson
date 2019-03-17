import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

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

    //@JsonValue
    public String serialize(){
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append("-");
        sb.append(nombre);
        return sb.toString();
    }

}
