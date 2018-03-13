package listdemo;

/**
 * @Author: HuangZiTeng
 * @Date: 15:50 2018/3/13 0013
 * @ClassUse:
 * @Modified: no
 */
public class person {

    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        person person = (person) o;

        return this.name.equals(person.name) && this.age == person.age;
    }


}
