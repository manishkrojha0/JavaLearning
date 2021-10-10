package AnnotationsDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }
    public Example()
    {
        super();
    }
    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example(String subject) {
        this.subject = subject;
    }
    @PostConstruct
    public void start()
    {
        System.out.println("starting method");
    }
    @PreDestroy
    public void end()
    {
        System.out.println("ending method");
    }
}
