package EqualsAndHashCode;

import java.util.List;
import java.util.Objects;

public class EqualsImp {

    public static void main(String[] args) {

        Class1 class1 = new Class1(1,"Rajat", 12121212);
        Class1 class2 = new Class1(2,"Rajat", 3213132);
        Class1 class3 = new Class1(3,"Rajat", 3213132);
        Class1 class4 = new Class1(4,"Rajat4", 6576575);
        Class1 class5 = new Class1(5,"Raja5", 766657465);

        List<Class1> list = List.of(class1,class2,class3,class4,class5);

        list.stream().distinct().forEach(x->{
            System.out.println("Id"+x.getId());
        });

    }

}

class Class1 {
    private int id;
    private String name;
    private long phoneNumber;

    public Class1(int id, String name, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
         System.out.println("Objects are equal");
         return true;
        }
        if (!(o instanceof Class1)) return false;
        Class1 class1 = (Class1) o;
        return Objects.equals(getName(), class1.getName()) && Objects.equals(getPhoneNumber(),((Class1) o).getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getPhoneNumber());
    }
}
