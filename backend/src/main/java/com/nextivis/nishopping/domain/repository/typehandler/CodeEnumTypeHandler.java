package com.nextivis.nishopping.domain.repository.typehandler;

import com.nextivis.nishopping.domain.*;
import lombok.*;
import org.apache.ibatis.type.*;

import java.sql.*;
import java.util.stream.*;

@AllArgsConstructor
public class CodeEnumTypeHandler<T extends CodeEnum> extends BaseTypeHandler<T> {
    private Class<T> type;

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, T t, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, t.getCode());
    }

    @Override
    public T getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int code = resultSet.getInt(s);
        return resultSet.wasNull() ? null : getCodeEnum(code);
    }

    @Override
    public T getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int code = resultSet.getInt(i);
        return resultSet.wasNull() ? null : getCodeEnum(code);
    }

    @Override
    public T getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int code = callableStatement.getInt(i);
        return callableStatement.wasNull() ? null : getCodeEnum(code);
    }

    private T getCodeEnum(int code) {
        return Stream.of(type.getEnumConstants())
                     .filter(entry -> entry.getCode() == code)
                     .findFirst()
                     .orElse(null);
    }
}
