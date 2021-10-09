package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
@Configuration
public class StudentImp implements StudentDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public StudentImp()
    {
        super();
    }
    public StudentImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String toString() {
        return "StudentImp{" +
                "jdbcTemplate=" + jdbcTemplate +
                '}';
    }

    @Override
    public int insert(Student student) {
        String query="insert into persons(PersonID,LastName,FirstName,address,city) values(?,?,?,?,?)";
        int r=this.jdbcTemplate.update(query,student.getPersonID(),student.getLastName(),student.getFirstName(),student.getAddress(),student.getCity());

        return r;
    }

    @Override
    public int change(Student student) {
        String query="update persons set LastName=? where FirstName=?";

        int r= this.jdbcTemplate.update(query,student.getLastName(),student.getFirstName());
        return r;
    }

    @Override
    public int delete(Student student) {
        String query="delete from persons where city=?";
        int r=this.jdbcTemplate.update(query,student.getCity());
        return r;
    }

    @Override
    public Student getStudent(String studentID) {
        String query="select * from persons where personID=?";
        RowMapper <Student> rowMapper= new RowMapperImp();

        Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentID);
        return student;
    }

    @Override
    public List<Student> getAllStudents(Student student) {
        String query="select * from persons where city=?";
        List<Student> students=this.jdbcTemplate.query(query,new RowMapperImp(),student.getCity());
        return students;
    }
}
