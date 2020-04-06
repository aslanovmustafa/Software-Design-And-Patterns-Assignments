CSCI4731, Software Design and Patterns

Assignment 3

This assignment contains a single task with two parts.

• The task of the first part is to design a class diagram solution to the given problem. To generate the
UML class diagram, it is recommended to use the ArgoUML or StarUML design tool, but the choice is
yours.

• The task of the second part is to implement the given design structure in Java language using
Object-Oriented Programming techniques. Make sure, that your code is neat, clean and thoroughly
commented. Try to use meaningful variable names. This assignment requires you to use the Facade and
the Command patterns.

All submissions should be uploaded to Blackboard as a single zip file (your source and UML class
diagram).

Deadline: 16.04.2020

Robot

Description

Recently, SITE has acquired a new remote-controlledrobot. Thisrobot hasthe wheelsto move and the arms
to perform some tasks. The robot is not smart enough to control itself, so it is shipped with a special
programmableremotecontroller. AsstudentofSITE,youarerequiredto programthe controller,so thatthe
robot may move as desired and perform an important task. The important task that the robot has to
perform is planting flowers on ADA campus. The robot should be controlled using the following
commands:

• TurnOn (ON) - turnsthe robot on.

• TurnOff (FF) - turnsthe robot off.

• Move Forwards(MF) - makesthe robot move 1 meterin the direction itfaces. Aftermoving forwards,
robot prints out its new position (X: %d, Y: %d).

• Move Backwards (MB) - makes the robot move 1 meter backwards, opposite to the direction it faces.
The robot does not change its direction and aftermoving backwards, it prints out its new position (X:
%d, Y: %d).

• Turn Left (TL) - makes the robot change the direction it faces by turning 90 degrees to the left
(counterclockwise).

• Turn Right (TR) - makes the robot change the direction it faces by turning 90 degrees to the right
(clockwise).

• Undo (UN) - makes the robot undo its latest movement or turning action. For example, issuing the
undo command three timesin a row willresultin the latestthree commands being reverted. If there is no
command to undo, robotshould print out a message “Impossible” without quotes.

• Plant Flower(PF) - makesthe robot plant a flower atthe point where itis currently located. After, the
robot prints out amessage” Planteda flower at(X: %d, Y: %d)” without quotes.

Robot can only move after being turned on. If the command is issued while robot is off, nothing should
happen.

Additionally, the remote controller for the robot has two special macro buttons that allow the robot to make
complex actions by issuing a combination of above-mentioned commands:

• Zig-Zag Plant (ZP) - The robot moves forwards, plants a flower, turns left, moves forwards, plants a
flower, turns right.

• Go Home (GH) - The robot moves back to its starting point.

Starting pointforthe robotisthe point(X: 0, Y: 0) and initially the robotfaces north (only its Y
position will increase if it moves forwards).

The program should continuously read user commands from the console input (ON, FF, MF, MB, TL, TR,
UN, PF, ZP, GH) and execute them. Entering QUIT should terminate the program.


Task 1 - UML Diagram (40 points)
Generate UML class diagram for this problem. Apply the Command, the Facade patterns. Upload only the
image of the UML diagram. Accepted formats: BMP, JPG or PNG.

Task 2 - Java Program (60 points)
Implement the solution in Java language using the IDE of your preference. All interactions with the program
should be through console. Before uploading, export your project (File − > Export ...) into a zip file and don’t
just copy the source filesfrom your solution.

Note: all source codes will be checked for plagiarism. Do not try to cheat!
