import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonRootName("TABLE")
public class Tablee{


    private List<Record> records;

    @JsonProperty( value = "RECORD", access = JsonProperty.Access.READ_ONLY)
    public List<Record> getRecord() {
        return records;
    }

    @JsonProperty( value = "RECORD", access = JsonProperty.Access.WRITE_ONLY)
    public void setRecord(List<Record> record) {
        this.records = record;
    }
}