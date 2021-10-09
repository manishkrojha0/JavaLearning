package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

@Configuration
@ComponentScan(basePackages = {"test"})
public class ConfigJDBC {
    @Bean(name = { "ds"})
    public DriverManagerDataSource getDriverDetails()
    {
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/world");
        ds.setUsername("root");
        ds.setPassword("Manish@2000");
        return ds;
    }
    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getjdbcTemplate()
    {
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDriverDetails());
        return jdbcTemplate;
    }
//    @Bean(name = {"studentDao"})
//    public StudentDao getStudentDao()
//    {
//        StudentImp studentDao= new StudentImp();
//        studentDao.setJdbcTemplate(getjdbcTemplate());
//        return studentDao;
//    }
}
