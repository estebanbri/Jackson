import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String json1 = "{\"id\":\"102\",\"MINOMBRE\":\"Jose\"}";
        MiBean bean1 = toBean(json1);
        System.out.println(bean1);

        MiBean bean2 = new MiBean("101", " Esteban");
        String json2 = toJson(bean2);
        System.out.println(json2);

        List<MiBean> lista = Arrays.asList(
                new MiBean("222", " Roberto"),
                new MiBean("223", " Andres")
        );
        String jsonList = toJson(lista);
        System.out.println(jsonList);

        Tables tables = new Tables();
        Table table = new Table();
        Record record = new Record(233, "corsa");

        boolean b1 = table.records.add(bean2);
        boolean b2 = tables.tables.add(table);

        String json3 = toJson(tables);
        System.out.println(json3);


    }
    private static MiBean toBean(String json) throws IOException{
        return new ObjectMapper().readValue(json, MiBean.class);
    }
    private static String toJson(MiBean bean) throws JsonProcessingException{
        return new ObjectMapper().writeValueAsString(bean);
    }
    private static String toJson(List<MiBean> lista) throws JsonProcessingException{
        return new ObjectMapper().writeValueAsString(lista);
    }

    private static String toJson(Tables tables) throws JsonProcessingException{
        return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(tables);
    }
}
