package com.spring.jpastudy.chap01.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_product")
@Getter @ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="prod_id")
    private long id; // PK

    @Column(name="prod_nm" , length=30 , nullable = false)
    private String name; // 상품명

    @Column(name="price")
    private int price; // 상품가격

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category; // 상품 카테고리

    @CreationTimestamp // insert시에 자동으로 서버시간 저장
    @Column(updatable = false)
    private LocalDateTime createdAt; // 상품 등록 시간

    @UpdateTimestamp // update 실행시 자동으로 시간이 저장
    private LocalDateTime updatedAt; // 상품 수정 시간

    // 데이터베이스에는 저장안하고 클래스 내부에서만 사용할 필드
    @Transient
    private String nickName;

    public enum  Category {
        FOOD ,  FASHION , ELECTRONIC
    }
}
