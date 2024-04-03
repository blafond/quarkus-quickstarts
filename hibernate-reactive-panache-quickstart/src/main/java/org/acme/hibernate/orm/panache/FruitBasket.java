package org.acme.hibernate.orm.panache;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "fruit_basket")
public class FruitBasket extends PanacheEntityBase implements Serializable {
    @Id
    public Long id;

    @Column
    public String name;

    // Just in case you get it running, to prevent issues with api json gen (cycle).
    @JsonIgnore
    @OneToMany(mappedBy = "basket", fetch = FetchType.LAZY)
    public Collection<Fruit> fruits;


    public FruitBasket() {}

    public FruitBasket(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String var10000 = this.getClass().getSimpleName();
        return var10000 + "<" + this.id + ">";
    }
}