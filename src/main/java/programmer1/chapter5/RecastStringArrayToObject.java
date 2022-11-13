package programmer1.chapter5;

import java.io.IOException;

public class RecastStringArrayToObject {
    public static void main(String[] args) {
//        String[] strings = {"stringValue"};
//        Object[] objects = strings;
//        objects[0] = new StringBuilder();
        RuntimeException[] exceptions = {new RuntimeException()};
        Object[] exceptionObjects = exceptions;
        exceptionObjects[0] = new IOException();
    }
}
