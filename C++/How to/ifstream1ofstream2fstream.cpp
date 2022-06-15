/*
ifstream is to READ a file [ ifstream <variable>("file.txt"); ]
ofstream is to WRITE into a file [ ofstream <variable>("file.txt"); ]
fstream is to both READ and WRITE a file
     > alternatively for ifstream and ofstream, you can do [ fstream <variable>("file.txt", ifstream;::in); ]
                                                           [ fstream <variable>("file.txt", ofstream::out); ]
*/

#include <iostream>
#include <fstream>
#include <stdio.h>
using namespace std;

int main() {
     char fileName[50], ch;
     fstream fs;

     cout << "Enter file name: ";
     gets(fileName);
     
     fs.open(fileName, ifstream::in); //reading file
     //fs.open(fileName, ofstream::out) // writing to file

     if(!fs) {
          cout << "Error Occured!";
          return 0;
     }
     
     //reading the file
     while (fs.eof() == 0){
          fs.get(ch);
          cout << ch;
     }
     
     fs.close();
     return 0;
     system("Pause");
}