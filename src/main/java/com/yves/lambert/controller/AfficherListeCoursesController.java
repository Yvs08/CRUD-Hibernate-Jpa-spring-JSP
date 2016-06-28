/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yves.lambert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bean.Course;
import com.yves.lambert.services.IServiceListeCourses;

@Controller
@RequestMapping(value = "/afficherListeCourses")
public class AfficherListeCoursesController {

    @Autowired
    private IServiceListeCourses service;

    @RequestMapping(method = RequestMethod.GET)
    public String afficher(ModelMap pModel) {
        final List<Course> lListeCourses = service.rechercherCourses();
        pModel.addAttribute("listeCourses", lListeCourses);
        return "listeCourses";
    }

}
