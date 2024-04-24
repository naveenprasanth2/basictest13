package org.example.practise1;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class SerializableImpl implements Serializable {
    @Serial
    private static final long serialVersionUID = 1234567L;
    private String name;
    private int age;
}
