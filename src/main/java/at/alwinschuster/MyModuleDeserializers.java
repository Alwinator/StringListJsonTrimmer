package at.alwinschuster;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class MyModuleDeserializers extends Deserializers.Base{
    @Override
    public JsonDeserializer<?> findCollectionDeserializer(CollectionType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer) {
        if(type.getRawClass() == List.class && type.containedType(0).getRawClass() == String.class){
                return new StringListTrimDeserializer();
        }
        return null;
    }
}
