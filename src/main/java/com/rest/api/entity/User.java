package com.rest.api.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder //builder를 사용할 수 있게 해줌
@Entity //jpa entity임을 알림
@Getter //user 필드값의 getter를 자동으로 생성
@NoArgsConstructor //인자없는 생성자를 자동으로 생성함
@AllArgsConstructor //인자를 모두 갖춘 생성자를 자동으로 생성함
@Table(name="user") //'user' 테이블과 매핑됨을 명시
public class User {

    @Id //primaryKey임을 알림
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //pk 생성전략을 DB 에 위임한다는 뜻.
    // mysql에서 pk 필드를 auto_increment로 설정해 놓은 경우로 보면 됨
    private long msrl;

    @Column(nullable=false,unique=true,length=30) //uid column을 명시.필수이고, 유니크하고, 길이는 30
    private String uid;

    @Column(nullable=false,length=100) //name column을 명시함. 필수이고 길이는 100
    private String name;

}
