package com.app.core;
import java.util.Comparator;
import java.util.TreeSet;
import utils.StudentCollectionUtils;



public class TestTreeset {

public static void main(String[] args)
{
TreeSet<Student> st = new TreeSet<>(new Comparator<Student>()
{
@Override
public int compare(Student o1, Student o2)
{
return o1.getRollNo().compareTo(o2.getRollNo());
}
});
st.addAll(StudentCollectionUtils.populateList());
System.out.println(st);
}
}