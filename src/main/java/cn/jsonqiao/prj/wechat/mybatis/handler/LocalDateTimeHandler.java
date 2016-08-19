package cn.jsonqiao.prj.wechat.mybatis.handler;

import cn.jsonqiao.prj.wechat.util.Constants;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.util.StringUtils;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Created by jsonqiao on 16/8/19.
 */
@MappedTypes(LocalDateTime.class)
public class LocalDateTimeHandler extends BaseTypeHandler<LocalDateTime> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, LocalDateTime localDateTime, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, localDateTime.format(DateTimeFormatter.ofPattern(Constants.FULL_DATE_TIME_PATTERN)));
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet resultSet, String s) throws SQLException {
        Timestamp timestamp = resultSet.getTimestamp(s);
        if (timestamp != null) {
            return LocalDateTime.ofInstant(timestamp.toInstant(), ZoneId.systemDefault());
        }
        return null;
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet resultSet, int i) throws SQLException {
        Timestamp timestamp = resultSet.getTimestamp(i);
        if (timestamp != null) {
            return LocalDateTime.ofInstant(timestamp.toInstant(), ZoneId.systemDefault());
        }
        return null;
    }

    @Override
    public LocalDateTime getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        Timestamp timestamp = callableStatement.getTimestamp(i);
        if (timestamp != null) {
            return LocalDateTime.ofInstant(timestamp.toInstant(), ZoneId.systemDefault());
        }
        return null;
    }
}
