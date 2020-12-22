package com.github.wenwengeek.siwajie.services

import com.intellij.openapi.project.Project
import com.github.wenwengeek.siwajie.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
