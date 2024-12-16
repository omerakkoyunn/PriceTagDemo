import org.gradle.api.Plugin
import org.gradle.api.Project
import com.android.build.gradle.LibraryExtension
import extensions.libs
import org.gradle.kotlin.dsl.dependencies
import kotlin.text.get

class MainGradlePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        applyPlugins(project)
    }

    private fun applyPlugins(project: Project, isAppModule: Boolean = false){
        with(project){
            with(pluginManager){
                apply("com.google.devtools.ksp")
                apply("com.android.application")
                apply("kotlin-android")
                apply("dagger.hilt.android.plugin")
            }

            dependencies {
                add("implementation", libs.findLibrary("hilt.android").get())
                add("ksp", libs.findLibrary("hilt.android.compiler").get())
            }
        }
    }


    private fun Project.android(): LibraryExtension {
        return extensions.getByType(LibraryExtension::class.java)
    }

}