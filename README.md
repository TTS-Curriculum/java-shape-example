# Java Shape Example

The contents of this file are for educational purposes.

In this file we include an interface called Shape. This interface declares a number of methods which must be implemented by its subclasses.

## Instructions

Download the repo using git or simply use the download link. Once you have the files on your local machine, you are free to use any Java IDE you choose or you can simply use the command line.


### Using Git to download a repo

1. Create a github account, if you don't already have one.

2. If git is not already installed on your machine, download and install it.

3. Once git is installed, navigate to where you want to store this project on your computer.

4. Click on the `Clone or Download` button for this repo. Be sure to click on `Use HTTP` link and copy url.

    > **Note:** Setting up ssh authentication when you create your Github account, will allow you to use the default ssh method

5. Then in the terminal, run the following to download this project's files:

    ```bash
    git clone https://github.com/tech-talent-south/java-shape-example.git
    ```
    
### Using Eclipse / IntelliJ IDE

1. Setup your project in your IDE of choice.

2. Skip to exercises below.

### Compiling and Executing Java on the Command Line

**Preq:** Using a terminal (putty from windows), navigate to your projects directory.

To compile all the Java files on the command line type the following command:

```bash
> javac *.java
```

Then to run your newly compiled code type:

```bash
> java Triangle
```

or

```bash
> java Square
```

## Exercises

### Java

1. Remove area class from Triangle class and recompile.

   What happened and why?

2. Add a method to square to calculate the `circumference` of a square and ensure that it prints the circumference when ran. Method should take 1 argument

3. Create another method called `circumference` that takes two arguments, length and width and computes the circumference.

3. Convert the Shape class into an abstract class. Ensure it runs successfully.
