package com.app.core;
import java.util.TreeSet;
import utils.StudentCollectionUtils;



public class TestTreeSet2 {
public static void main(String[] args) {
// TODO Auto-generated method stub
TreeSet<Student> st= new TreeSet<Student>();
st.addAll(StudentCollectionUtils.populateList());
System.out.println(st);
}
}