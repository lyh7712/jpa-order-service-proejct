package lyh7712.shopservice.domain.item;

import lombok.Getter;
import lombok.Setter;
import lyh7712.shopservice.domain.Item;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Book extends Item {

    private String author;
    private String isbn;
}
