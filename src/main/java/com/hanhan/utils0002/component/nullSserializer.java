package com.hanhan.utils0002.component;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.hanhan.utils0002.Test.TestJacksonEntity;
import hanhan.p;

import java.io.IOException;
/**
 * Created by Administrator on 2018/7/31.
 */
public class  nullSserializer extends JsonSerializer<Object> {

    @Override
    public void serialize(Object s, JsonGenerator jgen, SerializerProvider serializerProvider) throws IOException {

        jgen.writeString("");

    }
}