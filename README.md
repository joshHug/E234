Installing Java
----

#### Windows 

Install the latest version of Java at this link:
https://adoptopenjdk.net

#### Mac OS

1. Open a terminal.
2. Run:
`/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`

3. Run: `brew doctor`

4. If you encounter a warning asking you to download Command Line Tools, you will need to do this. Please follow the StackOverflow post [here](http://stackoverflow.com/questions/9329243/xcode-4-4-and-later-install-command-line-tools).

5. Run: `brew cask install java`

#### Linux

Install the newest version of Java using the appropriate package manager, e.g. `apt`. For example:

`sudo apt install openjdk-15-jdk git`

Installing IntelliJ
----

1. Download the community edition of IntelliJ from IDEA's website: [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/).

2. Start IntelliJ.

3. In the bottom right hand corner click "Configure", then "Plugins". Use the search box to search for "Java Visualizer" by Eli Lipsitz. Install the plugin.

Installing a Text Editor and Git
----

1. Install a text editor on your computer. We recommend Sublime Text [https://www.sublimetext.com/](https://www.sublimetext.com/), Atom [https://atom.io/](https://atom.io/) or Visual Studio Code [https://code.visualstudio.com/](https://code.visualstudio.com/). 

2. Download the Git version control software from [http://git-scm.com/download/](http://git-scm.com/download/). 

3. Run the git installer. When you get to the option that says "Choosing the default text editor used by git", select the editor you installed in part 1.

