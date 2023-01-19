package com.codersbay.part1;

import java.util.List;

public class PhoneBook {

    public Person head;





    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("PhoneBook {\n");

        if(head != null){

            Person current = head;
            for(;;){

                builder.append("\n    " + current.surname);
                builder.append("\n    " + current.lastname);
                builder.append("\n    " + current.phoneNumber);
                builder.append("\n  }\n");

                if(current.next == null) break;
                else current = (Person) current.next;
            }
        }

        builder.append("\n}");
        return builder.toString();
    }
}
