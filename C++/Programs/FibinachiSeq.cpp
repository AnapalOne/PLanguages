#include <iostream>
using namespace std;

int main() {
    cout << "this program fibinachi whatever spelling idc\n";
    cout << "factors in the fibinacci sequence: ";
    
    int fibseq1 = 0, n, x1 = 0, y1 = 1, temp1 = 0;
        //for fibinachi
    cin >> n;
    cout << "Sequence: ";
   for(int i = 1;i <= n; ++i) { 
        cout << fibseq1 << " ";
        fibseq1 = x1 + y1;
        temp1 = x1;
        y1 = temp1;
        x1 = fibseq1;

   }

    int fibseq2 = 0, x2 = 0, y2 = 1, z = 1, temp2 = 0;
        //while fibinachi 
    cout << endl << "factors in the fibinacci sequence: ";
    cin >> n;
    cout << "Sequence: ";
    while(z <= n) {
        cout << fibseq2 << " ";
        fibseq2 = x2 + y2;
        temp2 = x2;
        y2 = temp2;
        x2 = fibseq2;
        z++;
    }
}
