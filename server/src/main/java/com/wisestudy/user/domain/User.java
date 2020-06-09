package com.wisestudy.user.domain;

import com.fasterxml.jackson.annotation.*;
import com.wisestudy.category.domain.Category;
import com.wisestudy.user.domain.enumerate.Gender;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@JsonPropertyOrder({
        "id",
        "email",
        "password",
        "name",
        "birth",
        "cellPhone",
        "gender"
})
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("user_id")
    private Long id;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(name = "birthday")
    @JsonProperty("birthday")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime birth;

    @Column(name = "cell_phone", nullable = false, length = 20)
    private String cellPhone;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "enum('F', 'M')")
    private Gender gender;

//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    private List<Category> categories = new ArrayList<>();


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", cellPhone='" + cellPhone + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
