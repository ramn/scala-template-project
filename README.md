Download
========
To download a copy of this repo sans the .git dir:

    curl -L https://github.com/ramn/scala-template-project/archive/master.tar.gz | tar xzf -

Test
====

    sbt test

Build executable
================

    sbt stage

which will create target/universal/stage/{bin,lib}
folders. An executable will be put in bin, dependency
jars in lib.
