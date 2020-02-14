package co.closeit.tfrais.playground.hibernate.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class Portfolio {

    @Id
    private int id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @BatchSize(size = 1000)
    private Set<Client> clients;
}
