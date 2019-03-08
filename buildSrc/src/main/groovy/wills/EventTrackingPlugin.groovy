package wills

import org.gradle.api.Plugin
import org.gradle.api.Project

class EventTrackingPlugin implements Plugin<Project> {
  static final String PLUGIN_NAME = "helloPlugin"

  HelloPluginExtension helloPluginExtension

  @Override
  void apply(Project project) {
    println "custom ---- start ----"
    project.extensions.add(PLUGIN_NAME, HelloPluginExtension)
//    println helloPluginExtension
    project.task('hello') {
      group 'junli'
      doLast {
        println project.helloPlugin
      }
    }
    println "custom ---- end ----"
  }
}