package cn.jsonqiao.prj.wechat.util.serializable;

import cn.jsonqiao.prj.wechat.util.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by jsonqiao on 16/8/19.
 */
public class LocalDateTimeSerializable extends JsonSerializer<LocalDateTime> {

    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(localDateTime.format(DateTimeFormatter.ofPattern(Constants.FULL_DATE_TIME_PATTERN)));
    }
}
