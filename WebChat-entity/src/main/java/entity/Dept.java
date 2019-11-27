package entity;

import lombok.Data;

@Data
public class Dept {
    private Integer id;
    private String dept_name;

    private Dept(Builder builder) {
        setId(builder.id);
        setDept_name(builder.dept_name);
    }

    public static void main(String[] args) {
        Dept dept =Dept.newBuilder().id(1).dept_name("aaa").build();
        System.out.println("dept = " + dept);
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private Integer id;
        private String dept_name;

        public Builder() {
        }

        public Builder id(Integer val) {
            id = val;
            return this;
        }

        public Builder dept_name(String val) {
            dept_name = val;
            return this;
        }

        public Dept build() {
            return new Dept(this);
        }
    }
}
