package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfigFile {
    @Bean("bean1")
    public Student getStudent1() {
        Student s1 = new Student();
        s1.setId(3);
        s1.setName("Ajay Magar");
        s1.setEmail("ajaymagar@gmail.com");
        return s1;
        // return new Student(3, "Ajay Magar", "ajaymagar@gmail.com");
    }

    @Bean("bean2")
    public Student getStudent2() {
        Student s2 = new Student();
        s2.setId(4);
        s2.setName("Ajit birajdar");
        s2.setEmail("ajitbirajdar@fgmail.com");
        return s2;
        // return new Student(4, "Ajit birajdar", "ajitbirajdar@gmail.com");
    }

    @Bean("bean3")
    public Student getStudent3() {
        Student s3 = new Student();
        s3.setId(5);
        s3.setName("Anil Kadam");
        s3.setEmail("AnilKadam@gmail.com");
        return s3;
        // return new Student(5, "Anil Kadam", "AnilKadam
    }
}