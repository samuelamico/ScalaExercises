# Learning Scala

<div align="center">
  

  **Scala Tutorial**
  
  [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/samuelamico/ScalaExercises)
    


</div>

**This repository will consist of exercises done during the Scala Course at Udemy Part1, Part2 and Part3. Some tutorials I will spend here to help those who are starting to program Scala.**

## IntelliJ IDEA Tutorial

**1.**[ Download IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/)

**2. Install the Scala plugin**
When starting Intellij, a Welcome Screen shows up. The first step before creating or opening a Scala project is to install the Scala plugin. For that, go to the bottom right of the Welcome Screen and choose Configure → Plugins → Browse JetBrains Plugins. If such Welcome Screen doesn't appear, go to Preferences (Settings) → Plugins.

**3. Creating a project**
The easiest way to create a project is to use the Project Wizard. To use it, click Create New Project on the Welcome Screen, then select Scala, and finally SBT Project.

**4. Synchronizing SBT and IntelliJ IDEA projects**
IntelliJ IDEA SBT support synchronizes the project with your build file, so when you change Scala version you're going to use, or add a library, your project is updated accordingly.

```
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
```
**5. Using terminal to run SBT commands**
The easiest way to run SBT commands from from IntelliJ IDEA is to use the Terminal tool window via Alt+F12. It executes the terminal in your project directory. Then, type `sbt` to execute the build tool REPL. If you have any problem (your mappings are different, for instance), [check the official documentation](https://www.jetbrains.com/help/idea/2016.2/terminal.html?search=terminal).
