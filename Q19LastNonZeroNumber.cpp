#include <iostream>

using namespace std;

int lastNonZeroDigit(int n) {
    int result = 1;
    for (int i = 2; i <= n; ++i) {
        result *= i;
        while (result % 10 == 0) {
            result /= 10;
        }
        result %= 10;
    }
    return result;
}

int main() {
    int input_number;
    cout << "Enter the input number: ";
    cin >> input_number;

    int output_digit = lastNonZeroDigit(input_number);
    cout << "Output: " << output_digit << endl;

    return 0;
}