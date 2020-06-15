package com.wisestudy.user.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.wisestudy.user.domain.enumerate.Gender;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

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
@JsonRootName("user")
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
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birth;

    @Column(name = "cell_phone", nullable = false, length = 20)
    private String cellPhone;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "enum('FEMALE', 'MALE')")
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
