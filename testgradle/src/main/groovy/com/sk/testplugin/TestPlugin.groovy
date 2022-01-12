package com.sk.testplugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.android.build.gradle.BaseExtension

class TestPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        if (Class.forName("com.android.build.gradle.BaseExtension")) {
            println("hello world! evve body")
            BaseExtension android = project.extensions.getByType(BaseExtension)
        } else {
            println("hello world! evve body")
        }
    }
}