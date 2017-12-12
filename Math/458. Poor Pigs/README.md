Time spent : 10 min(See other's thought before)

GIVEN: buckets number, minutesToDie, minutesToTest

RETURNS: the minimum amount of pigs need to figure out which bucket contains the poison within one hour



DESIGN STRATEGY: Transcribe formula



ooooo

ooooo

ooooo

ooooo

ooooo



We can use 2 pigs to test 5 * 5 buckets. (15 minutes die, 60 minutes test)

First 15 minutes, pig A drinks the first row, pig B drinks the first colomn. Then next 15 minutes, pig A drinks the second row, pig B drinks the second colomn. Same for the next 30 minutes.

If pig B dies between 30 - 45, then it is the second column that has the poison, but not the first two rows. After the four tests, if pig A doesn't die, the poison one is (2, 5)

