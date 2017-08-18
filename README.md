# SoberUp

Copyright (c) Victor Ochia   This work is available under the "MIT License" Please see the file LICENSE for license terms.
For any inquires, please Email : vicochia@pdx.edu. 

What is SoberUp
SoberUp is an android app made to help alcholics that are ready to become clean through various methods of tracking progress
and conveying encouragement. SoberUp features A tracker that tells users how long they have been sober as well as displays
the history of their sobreity through their longest streak, their current ongoing streak, their average streak, as well as the
total time theyve been sober since having the app. SoberUp also feautures a system where badges are released to users as they 
reach milestones in sobriety. A panic button that displays motivational quotes is implemented to convince users to stay sober, 
as well as motivational quotes when a user relapses. SoberUp also features a diary that users can use to jot down their
life of staying clean.

In depth
SoberUp features a chronometer widget to add 24 hour increments which are then converted to days when the chronometer is 
reset. Badge releases are integrated as activities within the chronometer tick listener Journal uses sharedpreferences to 
store information. Past streaks are recorded in a list which allows elements like averages and total time sober to be
calculated. Motivational quotes when the urge button is clicked are stored in an array. A random number is given to the 
activity that dislays these quotes to access the bounds of the aray. The relapse quotes follow the same circumstances as the
chronometer and days are also reset. However, the quote for the relapse button comes in as a pop-up on the screen.

More information about functionalities are explained in: https://github.com/vmannn/SoberUp/blob/master/docs:quick-talk.pdf


How is SoberUp currently
SoberUp is working properly, but there could be improvement with saving information when app is closed. Currently, Journal 
entries are always saved. Any unknown bugs or concerns can be posted on https://github.com/vmannn/SoberUp/issues


Build Instructions
Go to www.androidstudio.com and download the Android Studio IDE. You must have JDK installed as well. After opening a new
project, clone this repository. Run the application using an emulator (Preferably Nexus 6P API 24 for best results). .APK file
included can be used to attempt to run app on your own Android device. 

If any inquires or questions arise, to not hesitate contact by email: vicochia@pdx.edu






