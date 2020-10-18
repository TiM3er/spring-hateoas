package pl.tim3erland.open.springhateos.dao;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CLASS", schema = "PUBLIC", catalog = "BAZADANYCH")
public class ClazzDao {
    private Integer classId;
    private String className;

    @Basic
    @Column(name = "CLASS_ID")
    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "CLASS_NAME")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClazzDao clazzDao = (ClazzDao) o;
        return Objects.equals(classId, clazzDao.classId) &&
                Objects.equals(className, clazzDao.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, className);
    }
}
