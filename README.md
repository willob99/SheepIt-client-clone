# SheepIt Render Farm Client

[![Build Status](https://secure.travis-ci.org/laurent-clouet/sheepit-client.svg)](http://travis-ci.org/laurent-clouet/sheepit-client)

## Overview

SheepIt Render Farm Client is an *Open Source* client for the distributed render farm [**SheepIt**](https://www.sheepit-renderfarm.com).

## CS 219 Modifications

This version is for testing SheepIt with ARM-based Linux devices such as Android devices running Linux. It allows the user to specify a Blender executable to use instead of the version that SheepIt provides, which is not compatible with these devices. To use this option, start the SheepIt client with this command:

`java -jar [sheepit client].jar -ui text -login [login] -password [password] -server http://sandbox.sheepit-renderfarm.com -renderer-override /path/to/blender`

This repository also contains our script for setting up the environment for SheepIt and Blender, in environmentSetup.sh.

## Compilation

You will need Java 11 or higher. (OpenJDK and Oracle are both supported).
To create the jar file, simply type `./gradlew shadowJar` on linux/OSX and `gradlew.bat shadowJar` on Windows in the project's root directory.

## Usage

Once you have the jar file, you can see how to use it by running:

    java -jar build/libs/sheepit-client-all.jar --help

When you are doing development work, you can use a mirror of the main site specially made for demo/dev. The mirror is located at **http://sandbox.sheepit-renderfarm.com**, and you can use it by passing `-server http://sandbox.sheepit-renderfarm.com` to your invocation of the client.

At the command line ui (-ui text / -ui oneLine) you could type in the following commands and press enter to control the client:

* status: get the current status of the client (paused, stoped, etc.)
* priority <n>: set the renderer process priority
* block: block the current project
* pause: pause the client to request new jobs after the current frame has finished to render
* resume: resume the client after it was paused
* stop: stop the client after the current frame has finished
* cancel: cancel the stop request
* quit: stop the client directly without finishing the current frame
