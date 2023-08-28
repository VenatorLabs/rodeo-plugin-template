# rodeo-plugin

## Purpose

This is a template repository for creating plugins for the Rodeo data processing
service. This template contains everything you need to get started writing your
first plugin including build system and source files.

## Customizing the Project

There are a few things that you will want to change in this template project to
make it your own.

### 1. settings.gradle

The settings.gradle file contains the rootProject.name variable. It is set to
'rodeo-plugin' by default, change this to the name of your new plugin.

### 2. TemplatePlugin.java and TemplatePluginTest.java

You should rename these files and the classes contained within to something more
descriptive of the plugin you are developing.

### 3. /src Directories

The `org/yourorg` directories underneath the `src/main/java` and `src/test/java`
directories should be changed to match your organization name.

### 4.  org.venatorlabs.rodeo.plugin.RodeoPlugin File

This file is located under the `src/main/resources/META-INF/service` directory
and is incorporated into the jar file produced by the build process. Change the
`org.yourorg.TemplatePlugin` to the updated src paths and plugin class name.
This file is required for Rodeo to load the plugin properly.

## Building the Project

This project is already setup with the Gradle build system. You can build the
project using the provided gradle script: `./gradlew build`. This will perform
any and all unit tests and will output the compiled plugin in the `build/libs`
directory.
