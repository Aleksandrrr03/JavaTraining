package by.epam.javatraining.kotkovets.maintask01.model.entity;

import java.util.Objects;

/**
 * This class describes the essence(entity) of "Magazine".
 * The class Magazine is inherited from the class Edition.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Edition
 * @since JDK1.0
 */

public class Magazine extends Edition {
    private String pageBinding;
    private String periodicity;

    public Magazine(int countOfEdition, String titleOfEdition, int yearOfIssue, String author, String type,
                    String pageBinding, String periodicity, int countOfPages) {
        super(countOfEdition, titleOfEdition, yearOfIssue, author, type,countOfPages);
        this.pageBinding = pageBinding;
        this.periodicity = periodicity;
    }

    public Magazine() {
        super(0, " ", 0, " ", " ",0);
        this.pageBinding = " ";
        this.periodicity = " ";
    }

    public String getPageBinding() {
        return pageBinding;
    }

    public void setPageBinding(String pageBinding) {
        if (pageBinding != null) {
            this.pageBinding = pageBinding;
        }
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        if (periodicity != null) {
            this.periodicity = periodicity;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(pageBinding, magazine.pageBinding) &&
                Objects.equals(periodicity, magazine.periodicity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), pageBinding, periodicity);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "pageBinding='" + pageBinding + '\'' +
                ", periodicity='" + periodicity + '\'' +
                '}'+
                super.toString();
    }


}
