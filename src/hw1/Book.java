package hw1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String title;
    private int pages;
    private String genre;
    private ArrayList<String> authors;
}

