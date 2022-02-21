package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity //JPA 관리 대상으로 인식한다
public class Member {
   @Id
    private Long id;

   @Column(name = "name", nullable = false, columnDefinition = "varchar(100) default 'EMPTY'") //DB컬럼명은 name
    private String username;

   @Column
   private Integer age;

   @Enumerated(EnumType.STRING) //String 사용을 권장, ORDINAL의 경우 데이터가 꼬여버릴수 있음
    private RoleType roleType;

   @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

   @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

   @Lob
   private String description;

   private LocalDate testLocalDate; //년, 월만 나타냄
   private LocalDateTime testLocalDateTime; //년, 월, 일 나타냄

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
