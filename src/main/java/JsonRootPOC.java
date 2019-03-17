
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.List;

public class JsonRootPOC {


    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);


        Record record = new Record();
        record.setId(1);
        record.setModelo("asdd");
        List<Record> records = new ArrayList();
        records.add(record);

        Tablee tablee = new Tablee();
        tablee.setRecord(records);

        String json = objectMapper.writeValueAsString(tablee);
        System.out.println(json);
    }


}

