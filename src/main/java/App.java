import javax.swing.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        showHierarchy(JTextField.class);
    }
    public static String showHierarchy( Class c) {

        System.out.println(c.getName());
        System.out.println(c.getSuperclass().getName());
        return null;



//        java.lang.Object
//          java.awt.Component
//              java.awt.Container
//                     javax.swing.JComponent
//                          javax.swing.text.JTextComponent
//                              javax.swing.JTextField
    }
}
