#include<bits/stdc++.h> 
using namespace std; 
// Function that returns true if the array is mirror-inverse 
bool isMirrorInverse(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
    { 
        // If condition fails for any element 
        if (arr[arr[i]] != i) 
            return false; 
    } 
    // Given array is mirror-inverse 
    return true; 
} 
int main() 
{ 
        int arr[] = { 1, 2, 3, 0 }; 
        int n = sizeof(arr)/sizeof(arr[0]); 
        if (isMirrorInverse(arr,n)) 
            cout << "Yes"; 
        else
            cout << "No"; 
        return 0; 
} 