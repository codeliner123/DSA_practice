#include <iostream>

using namespace std; 

int main() {
    int x = 10;

    switch(x) {
        case 10:
            cout << "ten" << endl;
            break;
        case 9:
            cout << "nine" << endl;
            break;
        default:
            cout << "not ten or nine" << endl;
    }

    return 0;
}