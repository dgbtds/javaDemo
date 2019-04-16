#!/bin/bash
git init
git add .
git commit -m "注释语句"
git remote add origin git@github.com:dgbtds/javaDemo.git
git pull --rebase origin master
git push -u origin master
