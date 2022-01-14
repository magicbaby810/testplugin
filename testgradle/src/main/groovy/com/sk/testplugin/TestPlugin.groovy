package com.sk.testplugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.android.build.gradle.BaseExtension

class TestPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        if (Class.forName("com.android.build.gradle.BaseExtension")) {
            BaseExtension android = project.extensions.getByType(BaseExtension)
            println("hello world! evve body " + android)
        } else {
            println("hello world! evve body")
        }
    }
}