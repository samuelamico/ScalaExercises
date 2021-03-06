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


## Functional Program Help

### Tailrecursive Function

The recursive programs create a problem. Simple recursion creates a series of stack frames, and for algorithms that require
deep levels of recursion, this creates a StackOverflowError (and crashes your program).

With Scala you can work
around this problem by making sure that your recursive functions are written in a
tail-recursive style.

Martin Odersky explains tail-recursion in Scala:
```
“Functions which call themselves as their last action are called tailrecursive. 
The Scala compiler detects tail recursion and replaces it
with a jump back to the beginning of the function, after updating the
function parameters with the new values … as long as the last thing
you do is calling yourself, it’s automatically tail-recursive (i.e.,
optimized).”
```

#### How do I write tailrecursive functions:

1) Keep the original function signature the same 
2) Create a second function by (a) copying the original function, (b) giving it a
   new name, (d) giving it a new “accumulator” input
   parameter, and (e) adding the @tailrec annotation to it
3) Modify the second function’s algorithm so it uses the new accumulator
4) Call the second function from inside the first function. When you do this you
   give the second function’s accumulator parameter a “seed” value
   
Example:
```scala
// tail-recursive solution
def sum(list: List[Int]): Int = {
    @tailrec
    def sumWithAccumulator(list: List[Int], currentSum: Int): Int = {
      list match {
      case Nil => currentSum
      case x :: xs => sumWithAccumulator(xs, currentSum + x)
      }
    }
    sumWithAccumulator(list, 0)
}
```