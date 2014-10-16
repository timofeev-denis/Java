package com.my;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public List<User> selectAll() throws SQLException;
    public int deleteById(int id) throws SQLException;
}
