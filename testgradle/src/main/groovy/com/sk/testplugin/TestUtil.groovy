package com.sk.testplugin

import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project

public class TestUtil {

    public static final int IS_APP = 0
    public static final int IS_LIB = 1
    public static final int NOT_APP_OR_LIB = -1

    public static int PROJECT_TYPE = NOT_APP_OR_LIB

    /**
     * 检测当前模块是app还是lib
     * @param project
     * @param android
     * @return
     */
    public static int checkModule(Project project, BaseExtension android) {
        try {
            if (Class.forName("com.android.build.gradle.BaseExtension")) {
                if (android instanceof AppExtension) {
                    PROJECT_TYPE = IS_APP
                } else if (android instanceof LibraryExtension) {
                    PROJECT_TYPE = IS_LIB
                } else {
                    PROJECT_TYPE = NOT_APP_OR_LIB
                }
            } else {
                PROJECT_TYPE = NOT_APP_OR_LIB
            }
        } catch(Exception e) {
            PROJECT_TYPE = NOT_APP_OR_LIB
        }

        return PROJECT_TYPE
    }




}