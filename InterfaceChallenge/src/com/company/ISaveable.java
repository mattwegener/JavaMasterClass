package com.company;

import java.util.ArrayList;

public interface ISaveable {
    void load(ArrayList list);
    ArrayList save();
}
