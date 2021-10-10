package StereoType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Scope("prototype")
public class Student {
    @Value("Manish Ojha")

    private String name;
    @Value("Renukoot")
    private String city;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", Address=" + Address +
                ", id=" + id +
                '}';
    }

    @Value("#{Address}")
    private List Address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Value("#{T(java.lang.Math).sqrt(256)}")
    private int id;

    public List getAddress() {
        return Address;
    }

    public void setAddress(List address) {
        Address = address;
    }

    public Student()
    {
        super();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Student(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }
}
