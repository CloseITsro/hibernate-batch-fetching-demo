package co.closeit.tfrais.playground.hibernate.persistence.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Data
public class Transaction {

    @Id
    private int id;

    private String field;
}
