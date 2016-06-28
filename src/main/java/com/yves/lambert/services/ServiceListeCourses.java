/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yves.lambert.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bean.Course;
import  com.yves.lambert.dao.IListeCoursesDAO;

public class ServiceListeCourses implements IServiceListeCourses {

    @Autowired
    private IListeCoursesDAO dao;

    @Transactional(readOnly = true)
    public List<Course> rechercherCourses() {
        return dao.rechercherCourses();
    }

    @Transactional
    public void creerCourse(final String pLibelle, final Integer pQuantite) {
        final Course lCourse = new Course();
        lCourse.setLibelle(pLibelle);
        lCourse.setQuantite(pQuantite);

        dao.creerCourse(lCourse);
    }

    @Transactional
    public void supprimerCourse(final Integer pIdCourse) {
        final Course lCourse = new Course();
        lCourse.setId(pIdCourse);

        dao.supprimerCourse(lCourse);
    }

    @Transactional
    public void modifierCourses(final List<Course> pListeCourses) {
        for (final Course lCourse : pListeCourses) {
            dao.modifierCourse(lCourse);
        }
    }
}
