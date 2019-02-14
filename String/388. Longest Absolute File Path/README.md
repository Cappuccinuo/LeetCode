Time spent :  30 min(See hint)

GIVEN: String which represent file path

RETURNS: The longest absolute path to the file

EXAMPLES:

The string `"dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"` represents:

```
dir
    subdir1
    subdir2
        file.ext
```

The directory `dir` contains an empty sub-directory `subdir1` and a sub-directory `subdir2` containing a file `file.ext`.

The string `"dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"` represents:

```
dir
    subdir1
        file1.ext
        subsubdir1
    subdir2
        subsubdir2
            file2.ext
```

The directory `dir` contains two sub-directories `subdir1` and `subdir2`. `subdir1` contains a file `file1.ext` and an empty second-level sub-directory `subsubdir1`. `subdir2` contains a second-level sub-directory `subsubdir2` containing a file `file2.ext`.

We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is `"dir/subdir2/subsubdir2/file2.ext"`, and its length is `32` (not including the double quotes).

Given a string representing the file system in the above format, return the length of the longest absolute path to file in the abstracted file system. If there is no file in the system, return `0`.

Algorithm:

First we can split the string by "\n".

For "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"

The result is 

```
dir
	subdir1
	subdir2
		file.ext
```

We use an array to store the sum of length from top to last level.

For each string we split, we can get the index of \t, which has length 1. Our level index is represent by lastTIndex + 2, from top, the index is -1, 0, 1..., so the index in array is 1, 2, 3, 4...

The actual length is l.length() - (lastTIndex + 2 - 1).  => index is 1 larger than actual length, so -1.

If currently the string is a file name, that is contain ".", we update our ans as max of ans and sum[lastTIndex + 2 - 1] + str len except "\t".

Otherwise is a directory, we update sum[lastIndex + 2] = sum[lastIndex + 2 - 1] + sLen + 1('/' symbol).