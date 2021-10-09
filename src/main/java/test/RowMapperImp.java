package test;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student= new Student();
        student.setPersonID(resultSet.getString("personID"));
        student.setLastName(resultSet.getString("LastName"));
        student.setFirstName(resultSet.getString("FirstName"));
        student.setAddress(resultSet.getString("address"));
        student.setCity(resultSet.getString("city"));

        return student;
    }
}
