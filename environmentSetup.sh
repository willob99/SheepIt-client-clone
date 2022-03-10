#!/bin/bash

curl https://raw.githubusercontent.com/AndronixApp/AndronixOrigin/master/repo-fix.sh > repo.sh && chmod +x repo.sh && bash repo.sh && pkg update -y && pkg install wget curl proot tar -y && wget https://raw.githubusercontent.com/AndronixApp/AndronixOrigin/master/Installer/Ubuntu20/ubuntu20.sh -O ubuntu20.sh && chmod +x ubuntu20.sh && bash ubuntu20.sh

apt-get update 

#apt install firefox

apt install default-jre

apt install default-jdk

apt install blender

apt-get install libglu1-mesa-dev freeglut3-dev mesa-common-dev #Install OpenGL

