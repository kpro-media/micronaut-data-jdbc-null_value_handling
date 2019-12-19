package example.entity;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@MappedEntity(value = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @MappedEntity(value = "number_column")
    private Integer numberColumn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumberColumn() {
        return numberColumn;
    }

    public void setNumberColumn(Integer numberColumn) {
        this.numberColumn = numberColumn;
    }
}
