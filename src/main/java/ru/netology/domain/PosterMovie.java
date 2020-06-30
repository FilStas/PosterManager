package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PosterMovie {
    private int id;
    private String imageUrl;
    private String name;
    private int year;
    private String genre;

}
