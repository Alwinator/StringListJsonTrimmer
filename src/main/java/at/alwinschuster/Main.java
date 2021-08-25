package at.alwinschuster;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        MyModule module = new MyModule();
        mapper.registerModule(module);

        System.out.println("---------------------- Test ----------------------");
        // {"something": "Hello", "myList": ["Hello", "Test", "", "Hi", ""]}
        String json = "{\"something\": \"Hello\", \"myList\": [\"Hello\", \"Test\", \"\", \"Hi\", \"\"]}";

        MyObject obj = mapper.readValue(json, MyObject.class);
        System.out.println(obj);
        System.out.println("SUCCESS");
    }
}
