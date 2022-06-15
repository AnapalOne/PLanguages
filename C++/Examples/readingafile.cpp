/*
Using <fstream>,
This program will read a text file and display its contents.

> [fstream::in] is used to open the file to read its content only.
> [fp>>noskipws>>ch] is used to read the file by character-by-character without missing whitespace.
    > you can also use    [ while(fp.eof() == 0) {   ]   .eof means End Of File
                          [   fp.get(ch);             ]
                          [   cout<<ch;               ]
                          [  }                        ]
*/

#include <iostream>
#include <fstream>
#include <stdio.h>
using namespace std;

int main() {

    char fileName[50], ch;
    fstream fs;

    cout << "Enter the name of a file (.txt): ";
    gets(fileName);
    fs.open(fileName, fstream::in);
    
    if (!fs) { //you can also use if (fs == NULL)
        cout << "\nError! Invalid File!";
        return 0; //terminates program
    }
    
    cout << "\nContent of " << fileName << " =\n";
    while (fs>>noskipws>>ch) {
        cout << ch;
    }
    fs.close();
    return 0;
}
