package com.geacademy.extras;

import javax.swing.*;

public class ObjectHierarchy {
    public static void main(String[] args) {


//        showHierarchyRecursive1(JTextField.class);
//        showHierarchyRecursive2(JTextField.class, new StringBuilder());
//        System.out.println(showHierarchyRecursive3(JTextField.class, new StringBuilder()));


        System.out.println(showHierarchyRecursive(JTextField.class));

    }

    private static void showHierarchyRecursive1(Class c) {
        if (c.getSuperclass() == null) {
            System.out.println(c.getName());
            return;
        }
        showHierarchyRecursive1(c.getSuperclass());
        System.out.println(c.getName());
    }


    private static void showHierarchyrecursive2(Class c, StringBuilder tab) {
        if (c.getSuperclass() == null) {
            System.out.println(c.getName());
            return;
        }
        showHierarchyrecursive2(c.getSuperclass(), tab);
        tab.append("\t");
        System.out.println(tab + c.getName());
    }


    private static String showHierarchyrecursive3(Class c, StringBuilder tab) {
        if (c.getSuperclass() == null) {
            return c.getName();
//            System.out.println(c.getName());

        }
        String result = showHierarchyrecursive3(c.getSuperclass(), tab);
        tab.append("\t");
//        System.out.println(tab + c.getName());
        return result + "\n" + tab + c.getName();
    }

    private static String showHierarchyRecursive(Class c) {
        return showHierarchyrecursive3(c, new StringBuilder());
    }

}
