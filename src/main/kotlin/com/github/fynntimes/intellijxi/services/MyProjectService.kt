package com.github.fynntimes.intellijxi.services

import com.intellij.openapi.project.Project
import com.github.fynntimes.intellijxi.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
