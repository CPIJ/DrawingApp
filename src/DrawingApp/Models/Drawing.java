package DrawingApp.Models;

import DrawingApp.Models.DrawingItems.DrawingItem;

import java.util.List;

public class Drawing {

    private List<DrawingItem> items;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
