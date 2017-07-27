package com.allstate.compozed.teacherspet.students;

import javax.persistence.Id;

/**
 * Created by localadmin on 7/27/17.
 */
final class StudentModel {

    private String name;
    private long Id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
