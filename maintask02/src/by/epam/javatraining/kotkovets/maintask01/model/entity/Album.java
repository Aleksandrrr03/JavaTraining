package by.epam.javatraining.kotkovets.maintask01.model.entity;

import java.util.Objects;

/**
 * This class describes the essence(entity) of "Album".
 * The class Album is inherited from the class Edition.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Edition
 * @since JDK1.0
 */

public class Album extends Edition {

    private String photoFormat;
    private String paperDensity;

    public String getPhotoFormat() {
        return photoFormat;
    }

    public void setPhotoFormat(String photoFormat) {
        if (photoFormat != null) {
            this.photoFormat = photoFormat;
        }
    }

    public String getPaperDensity() {
        return paperDensity;
    }

    public void setPaperDensity(String paperDensity) {
        if (paperDensity != null) {
            this.paperDensity = paperDensity;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Album album = (Album) o;
        return Objects.equals(photoFormat, album.photoFormat) &&
                Objects.equals(paperDensity, album.paperDensity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), photoFormat, paperDensity);
    }

    @Override
    public String toString() {
        return "Album{" +
                "photoFormat='" + photoFormat + '\'' +
                ", paperDensity='" + paperDensity + '\'' +
                '}' +
                super.toString();
    }

    public Album(int countOfEdition, String titleOfEdition, int countOfPAges, int yearOfIssue, String author,
                 int idOfEdition, String type, String photoFormat, String paperDensity) {
        super(countOfEdition, titleOfEdition, yearOfIssue, author, type,countOfPAges);
        this.photoFormat = photoFormat;
        this.paperDensity = paperDensity;
    }

    public Album() {
        super(0, " ", 0, " ", " ",0);
        this.photoFormat = " ";
        this.paperDensity = " ";
    }
}
