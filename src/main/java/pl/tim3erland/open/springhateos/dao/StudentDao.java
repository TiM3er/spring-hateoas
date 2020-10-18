package pl.tim3erland.open.springhateos.dao;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "STUDENT", schema = "PUBLIC", catalog = "BAZADANYCH")
public class StudentDao {
    private Integer studentId;
    private String studentName;
    private Integer studentClasId;

    @Basic
    @Column(name = "STUDENT_ID")
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "STUDENT_NAME")
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "STUDENT_CLAS_ID")
    public Integer getStudentClasId() {
        return studentClasId;
    }

    public void setStudentClasId(Integer studentClasId) {
        this.studentClasId = studentClasId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDao that = (StudentDao) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(studentClasId, that.studentClasId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentClasId);
    }
}
