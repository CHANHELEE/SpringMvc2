package hello.itemservice.domain.item;

import lombok.Getter;

@Getter
public enum ItemType {

    BOOK("도서"),FOOR("음식"),ETC("기타");

    private final  String description;

    ItemType(String descpription) {
        this.description = descpription;
    }
}
