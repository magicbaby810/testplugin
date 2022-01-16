import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.sk.testplugin.TestTransform
import com.sk.testplugin.TestUtil
import org.gradle.api.Plugin
import org.gradle.api.Project

class TestPlugin implements Plugin<Project> {

    public static final String PLUGIN_NAME = "TestPlugin"

    @Override
    void apply(Project project) {
        BaseExtension android = project.extensions.getByType(BaseExtension)
        if (TestUtil.checkModule(project, android) != TestUtil.NOT_APP_OR_LIB) {
            android.registerTransform(new TestTransform())
        }
    }
}