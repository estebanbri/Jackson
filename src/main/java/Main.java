import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String json1 = "{\"id\":\"102\",\"MINOMBRE\":\"Jose\"}";
        MiBean bean1 = toBean(json1);
        System.out.println(bean1);

        MiBean bean2 = new MiBean("101", " Esteban");
        String json2 = toJson(bean2);
        System.out.println(json2);

    }
    private static MiBean toBean(String json) throws IOException{
        return new ObjectMapper().readValue(json, MiBean.class);
    }
    private static String toJson(MiBean bean) throws JsonProcessingException{
        return new ObjectMapper().writeValueAsString(bean);
    }
}
