package by.epam.javatraining.kotkovets.maintask01.model.entity;

import java.sql.Connection;
import java.util.Objects;

/**
 * This class describes the essence(entity) of "Edition".
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @since JDK1.0
 */

public class Edition {

    private String titleOfEdition;
    private String author;
    private String type;
    private int countOfEdition;
    private int yearOfIssue;
    private int countOfPages;

    public Edition(int numberOfEdition, String titleOfEdition, int yearOfIssue, String author, String type,int countOfPages) {
        this.countOfEdition = numberOfEdition;
        this.titleOfEdition = titleOfEdition;
        this.yearOfIssue = yearOfIssue;
        this.author = author;
        this.type = type;
        this.countOfPages = countOfPages;
    }

    public Edition() {
        countOfEdition = 0;
        titleOfEdition = " ";
        yearOfIssue = 0;
        author = " ";
        type = " ";
        countOfPages=0;
    }

    public int getCountOfPages() {

        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public int getNumberOfEdition() {
        return countOfEdition;
    }

    public void setNumberOfEdition(int numberOfEdition) {
        if (numberOfEdition >= 0) {
            this.countOfEdition = numberOfEdition;
        }
    }

    public String getTitleOfEdition() {
        return titleOfEdition;
    }

    public void setTitleOfEdition(String titleOfEdition) {
        if (titleOfEdition != null) {
            this.titleOfEdition = titleOfEdition;
        }
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue >= 0) {
            this.yearOfIssue = yearOfIssue;
        }

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        }
    }


    public int getCountOfEdition() {
        return countOfEdition;
    }

    public void setCountOfEdition(int countOfEdition) {
        if (countOfEdition >= 0) {
            this.countOfEdition = countOfEdition;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        }

    }

    @Override
    public String toString() {
        return "Edition{" +
                "titleOfEdition='" + titleOfEdition + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", countOfEdition=" + countOfEdition +
                ", yearOfIssue=" + yearOfIssue +
                ", countOfPages=" + countOfPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edition edition = (Edition) o;
        return countOfEdition == edition.countOfEdition &&
                yearOfIssue == edition.yearOfIssue &&
                countOfPages == edition.countOfPages &&
                Objects.equals(titleOfEdition, edition.titleOfEdition) &&
                Objects.equals(author, edition.author) &&
                Objects.equals(type, edition.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(titleOfEdition, author, type, countOfEdition, yearOfIssue, countOfPages);
    }


}
