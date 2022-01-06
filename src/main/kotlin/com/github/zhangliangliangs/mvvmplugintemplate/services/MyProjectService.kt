package com.github.zhangliangliangs.mvvmplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.zhangliangliangs.mvvmplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
