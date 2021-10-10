package SpringConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
@Configuration
@ComponentScan(basePackages = "SpringConfig")
public class Student {
    @Value("116")
    private int id;
    @Value("Manish")
    private String name;
    public Student()
    {
        super();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
