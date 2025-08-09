package LatestInterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Date doj;         //using clone() we can't modify it.
    private final List<String> mobile;  //Creating the copy of it and return
    private final int age;

    private final Address address;

    public ImmutableClass(int id, String name, Date doj, List<String> mobile, int age, Address address){
        this.id=id;
        this.name=name;
        this.doj = doj;
        this.mobile = mobile;
        this.age=age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public Date getDoj() {
        //return doj;  //mutable
        return (Date) doj.clone();
    }

    public List<String> getMobile() {
        //return mobile;  //mutable
        //return Collections.unmodifiableList(mobile);  //It will throw exception
        return new ArrayList<>(mobile);
    }

    public int getId(){
        return id;
    }

    public Address getAddress() {
        //return address;             //rather then returning direct object
        return new Address(address.getCity(), address.getZip()); //retrun seprate copy of it,
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(101, "Lalbaboo", new Date(),
                Arrays.stream(new String[]{"123456", "84747474"}).collect(Collectors.toList()),
                28, new Address("Delhi", "110043"));

        //immutableClass.name="Santosh";  //we can't modify of name because its final

        immutableClass.getDoj().setDate(10);
        System.out.println(immutableClass);

        immutableClass.getMobile().add("7549662926");
        System.out.println(immutableClass);

        immutableClass.getAddress().setCity("Bangalore");
        System.out.println(immutableClass);

    }

}
