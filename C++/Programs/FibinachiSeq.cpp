#include <iostream>
using namespace std;

int main() {
    cout << "this program fibinachi whatever spelling idc";
    
    int n, x1 = 0, y1 = 1, z1;
        //for fibinachi
    cout << endl << "factors in the fibinacci sequence: ";
    cin >> n;
    cout << "Sequence: ";
   for(int i = 1;i <= n; ++i) { 
        cout << x1 << " ";

        z1 = x1 + y1;
        x1 = y1;
        y1 = z1;
   }

    int z = 0, x2 = 0, y2 = 1, z2;
        //while fibinachi 
    cout << endl << "factors in the fibinacci sequence: ";
    cin >> n;
    cout << "Sequence: ";
    while(z < n) {
        cout << z2 << " ";

        z2 = x2 + y2;
        y2 = x2;
        x2 = z2;

        z++;
    }
}
