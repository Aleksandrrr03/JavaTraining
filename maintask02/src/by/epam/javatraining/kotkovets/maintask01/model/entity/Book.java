package by.epam.javatraining.kotkovets.maintask01.model.entity;

import java.util.Objects;

/**
 * This class describes the essence(entity) of "Album".
 * The class Book is inherited from the class Edition.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Edition
 * @since JDK1.0
 */

public class Book extends Edition {
    private String cover;
    private String colorsPage;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        if (cover != null) {
            this.cover = cover;
        }
    }

    public String getColorsPage() {
        return colorsPage;
    }

    public void setColorsPage(String colorsPage) {
        if (colorsPage != null) {
            this.colorsPage = colorsPage;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(cover, book.cover) &&
                Objects.equals(colorsPage, book.colorsPage);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cover, colorsPage);
    }

    @Override
    public String toString() {
        return "Book{" +
                "Cover='" + cover + '\'' +
                ", colorsPage='" + colorsPage + '\'' +
                '}'+
                super.toString();
    }

    public Book(int countOfEdition, String titleOfEdition,int yearOfIssue, String author, int countOfPages,
                String type, String cover, String colorsPage) {
        super(countOfEdition, titleOfEdition, yearOfIssue, author, type,countOfPages);
        this.cover = cover;
        this.colorsPage = colorsPage;
    }

    public Book() {
        super(0, " ", 0, " ", " ",0);
        this.cover = " ";
        this.colorsPage = " ";
    }
}
