/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yves.lambert.controller;

import java.util.List;

import javax.validation.Valid;

public class ModificationForm {

    @Valid
    private List<ModificationCourse> listeCourses;

    public void setListeCourses(final List<ModificationCourse> pListeCourses) {
        listeCourses = pListeCourses;
    }

    public List<ModificationCourse> getListeCourses() {
        return listeCourses;
    }

}
