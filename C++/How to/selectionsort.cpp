#include <iostream>
using namespace std;
int main(){
    int length;
    cout << "Enter list size: ";
    cin >> length;
 
    int list[length];
    cout << "Enter " << length << " numbers: ";
    for(int i=0; i<length; i++)
        cin>>list[i];
 
    int index, smallest_num, loc, temp;
    for(index=0; index < length; index++) {
        smallest_num = index; //smallestsum = 0
        
        for(loc = index+1; loc < length; loc++) //find the location of the smallest item
            if(list[loc] < list[smallest_num]) //index1 
                smallest_num = loc;
        
                
        temp = list[smallest_num]; // swap the smallest element
        list[smallest_num] = list[index]; // to the beginning of the unsorted list.
        list[index] = temp;
        
        cout << index+1 << ": "; //print the list every iteration
    
        for(int i = 0; i<length; i++) 
            cout<<list[i]<<" ";

        cout<<endl;
        
 }
 return 0;
}