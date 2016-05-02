[
  adopted from http://www.cs.rochester.edu/u/www/courses/171/Fall-03/files/readme.txt
  by Deger Cenk Erdil
  for CS654 Distributed Systems
  This is a template README file about how you should form your own README file.
  In general,
        you should remove anything in between square brackets (i.e. [..]), and
        you should replace anything in between <> with a value.
]

CS542 Design Patterns
Spring 2016
PROJECT <2> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: Monday, February 29, 2016>
Submission Date: <DATE YOU SUBMIT, IN FORMAT: Monday, February 29, 2016>
Grace Period Used This Project: 0 Days
Grace Period Remaining: 0 Days
Author(s): PHANIKIRAN HARI
e-mail(s): phari2@binghamton.edu


PURPOSE:

[
  To learn about multi threading in java.
]

PERCENT COMPLETE:

[
 100
]

PARTS THAT ARE NOT COMPLETE:

[
 
]

BUGS:

[
 None
]

FILES:

[
  input file has to be given as one of the command line arguments for the program to compile
]

SAMPLE OUTPUT:

[
remote03:~/CS542/pk_assign2/firstName_lastName/primeThreads> ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=4 -Darg2=0
Buildfile: /import/linux/home/phari2/CS542/pk_assign2/firstName_lastName/primeThreads/src/build.xml

jar:

run:
     [java] The sum of all the prime numbers is: 25

BUILD SUCCESSFUL
Total time: 1 second
remote03:~/CS542/pk_assign2/firstName_lastName/primeThreads>

]

TO COMPILE:

[
  Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

## To compile: 
ant -buildfile src/build.xml all

## To run by specifying arguments from command line [similarly for the 2nd argument and so on ...]
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=firstarg 

## To create tarball for submission
ant -buildfile src/build.xml tarzip

## To untar the tarball submitted
ant -buildfile src/build.xml untarzip

]

TO RUN:

[
## To run by specifying args in build.xml (just for debugging, not for submission)
ant -buildfile src/build.xml run
]

EXTRA CREDIT:

[
  N/A
]


BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
<PHANIKIRAN HARI>

[
  
]

ACKNOWLEDGEMENT:

[
 
]

CHOICE OF DATA STRUCTURE[

Vector is the data structure I have used to store the prime numbers since it is thread synchronized.
Space and Time complexity of Vector is O(1) and constant.


]