package listdemo;

/**
 * @Author: HuangZiTeng
 * @Date: 15:50 2018/3/13 0013
 * @ClassUse:
 * @Modified: no
 */
public class person implements Comparable<person>{

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        person person = (person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    /**
     * why 31这个数 。
     * 31是一个质数  质数是一个能被1和自己本身整除的数
     * 2  这个数不大也不小
     * 3 31这个数好算，2的5次方-1 ， 2向左移动5位
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(person o) {
        return 0;
    }
}
