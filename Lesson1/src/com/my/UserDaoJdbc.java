package com.my;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class UserDaoJdbc implements UserDao {
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection( "jdbc:h2", "sa", "" );
    }

    @Override
    public List<User> selectAll() throws SQLException {
        Connection conn = getConnection();
        return null;
    }

    @Override
    public int deleteById(int id) throws SQLException {
        return 0;
    }
}
