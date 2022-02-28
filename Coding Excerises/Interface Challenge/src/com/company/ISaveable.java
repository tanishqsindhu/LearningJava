package com.company;

import java.util.List;

public interface ISaveable {
    List<String> write();
    Void read(List<String> list);
}
