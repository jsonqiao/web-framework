package cn.jsonqiao.prj.wechat.domain;

import cn.jsonqiao.prj.wechat.util.serializable.LocalDateTimeDeserializer;
import cn.jsonqiao.prj.wechat.util.serializable.LocalDateTimeSerializable;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by jsonqiao on 16/8/19.
 */
public class BaseDo implements Serializable {

    private long id;

    @JsonSerialize(using = LocalDateTimeSerializable.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createTimestamp;

    @JsonSerialize(using = LocalDateTimeSerializable.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime lastChangeTimestamp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(LocalDateTime createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public LocalDateTime getLastChangeTimestamp() {
        return lastChangeTimestamp;
    }

    public void setLastChangeTimestamp(LocalDateTime lastChangeTimestamp) {
        this.lastChangeTimestamp = lastChangeTimestamp;
    }
}
