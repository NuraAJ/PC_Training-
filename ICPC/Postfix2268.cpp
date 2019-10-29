//  Postfix - 2268
//  Created by NuraAJ on 10/29/19.
//  Copyright © 2019 NuraAJ. All rights reserved.
#include <iostream>
#include<string>
#include <fstream>
#include <sstream>      // std::istringstream
#include <iomanip>      // std::setprecision
#define MAX 100
using namespace std;

typedef struct{
    double S[MAX];
    int top;
}Stack;

void push(Stack *st, float num){
    if (st->top != MAX -1) st->S[++st->top] = num;
}

float pop(Stack *st){
    float num = NULL;
    if (st->top != -1) return num = st->S[st->top--];
    return num;
}

float perfomOperation(float num1, float num2, char operation){
    switch (operation) {
        case '+':
            return num1 + num2;
        case '-':
            return num1 - num2;
        case '*':
            return num1 * num2;
        case '/':
            return num1 / num2;
    }
    return 0;
}
int main(int argc, const char * argv[]) {
    Stack st;
    st.top = -1;
    string str, word;
    double num1, num2;
    ifstream infile;
    infile.open("postfix.in");
    ofstream myfile;
    myfile.open("postfix.out");
    if (myfile.is_open()){//outputfile
        if (infile.is_open()){
            while (getline(infile, str)) {
                word = "";
                istringstream iss(str, istringstream::in);
                while(iss >> word){
                    if (isdigit(word[0])) push(&st, stod(word));
                    else {
                        num2 = pop(&st);
                        num1 = pop(&st);
                        push(&st, perfomOperation(num1, num2, word[0]));
                    }
                }
                myfile << fixed << setprecision(4) << pop(&st) << endl;
            }
        }
        else cout << "Input file was not open" << endl;
    }
    else cout << "Output file was not open" << endl;
    infile.close();
    myfile.close();
    return 0;
}
