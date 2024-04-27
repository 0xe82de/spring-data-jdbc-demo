package org.example.springdatajdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(schema = "core", name = "tb_members", value = "tb_members")
@Data
@AllArgsConstructor
public class Member {

    @Id
    @Column("seq")
    public Long seq;

    @Column("name")
    public String name;

    @Column("age")
    public int age;
}
