/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yves.lambert.dao;

import java.util.List;
import bean.Course;

public interface IListeCoursesDAO {

    List<Course> rechercherCourses();

    void creerCourse(final Course pCourse);

    void supprimerCourse(final Course pCourse);

    void modifierCourse(final Course pCourse);
}
