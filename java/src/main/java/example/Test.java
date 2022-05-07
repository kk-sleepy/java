package example;
import com.experiment04.entity.Student;
import com.experiment05.resource.DatabaseUtils;
import org.w3c.dom.ls.LSInput;

import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        test01 t1 = new son();
        try {
            t1.fly();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

