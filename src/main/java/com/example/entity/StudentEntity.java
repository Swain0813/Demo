package com.example.entity;

public class StudentEntity {
    /**
     * <pre>
     * 
     * 表字段 : student.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : student.name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 
     * 表字段 : student.age
     * </pre>
     */
    private Integer age;

    /**
     * <pre>
     * 获取：
     * 表字段：student.id
     * </pre>
     *
     * @return student.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：student.id
     * </pre>
     *
     * @param id
     *            student.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：student.name
     * </pre>
     *
     * @return student.name：
     */
    public String getName() {
        return name;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：student.name
     * </pre>
     *
     * @param name
     *            student.name：
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：student.age
     * </pre>
     *
     * @return student.age：
     */
    public Integer getAge() {
        return age;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：student.age
     * </pre>
     *
     * @param age
     *            student.age：
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     *
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @param that
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StudentEntity other = (StudentEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()));
    }

    /**
     *
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        return result;
    }
}