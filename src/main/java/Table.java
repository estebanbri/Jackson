import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;
@JsonSerialize
public class Table {
    List<MiBean> records  = new ArrayList();

    public List<MiBean> getRecords() {
        return records;
    }

    public void setRecords(List<MiBean> records) {
        this.records = records;
    }
}
