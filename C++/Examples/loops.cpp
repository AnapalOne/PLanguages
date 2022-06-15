#include <iostream>
using namespace std;

int main() {
    char rprompt;
    bool restart = true;
    int move = 0, weird_thing, count;
    int score, counter = 0, sum = 0, average;



    cout << "for loop, \"thing\" game:" << endl;
    cout << "Enter distance you will travel: "; //how much you'll walk in meters
    cin >> count; 
    cout << "\nEnter number of thing: "; //distance of thing in meters
    cin >> weird_thing;

    for (int i = 0; i < count; i++) {
        move++; }

    cout << "\nMoves: " << move;
        if (move > weird_thing) {   //if move is greater than thing, you've moved past it
            cout << "\nPassed thing!" << endl;
     }
        if (move < weird_thing) {
            cout << "\nThing not reached!" << endl;
        }
        if (move == weird_thing){  //if move is equal to thing, you've reached it
         cout << "\nThing reached!" << endl;
     }






    cout << "while loop 1, yes or no:" << endl;
    while(restart) { //if condition is true, keep looping; if false, stop loop
        cout << "\nDo you want to pick another character? Y or N: "; //asks whether if the user wants to restart
        cin >> rprompt;

        if(rprompt == 'Y' || rprompt == 'y') {
            cout << "Restarting..." << endl << endl;
        }
        else {
            restart = false;
        }
    }

    cout << "while loop 2, average calculator:" << endl;
    while(counter < 6) {
        cin >> score;
        sum += score;
        counter++;
    }
    average = sum / counter;
    cout << average << endl;






    cout << "do-while loop:" << endl;
    do { //do while loop checks if variable restart is false and stops the block; if true, keep looping
        cout << "\nDo you want to pick another character? Y or N: "; //asks whether if the user wants to restart
        cin >> rprompt;

        if(rprompt == 'Y' || rprompt == 'y') {
            cout << "Restarting..." << endl << endl;
        }
        else {
            restart = false;
        }
    } while(restart);

    return 0;
}
