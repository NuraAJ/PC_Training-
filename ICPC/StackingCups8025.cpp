#include<iostream>
#include<string>
#include <fstream>
#define MAX 20
using namespace std;

typedef struct{
    string color;
    int rad;
} Table;

bool compareByRad(const Table &a, const Table &b)
{
    return a.rad < b.rad;
}

int main()
{
    string str1, str2, line;
    Table table[MAX];
    // open a file in read mode.
    ifstream infile;
    infile.open("stacking.in");
    ofstream myfile;
    myfile.open("stacking.out");
    if (infile.is_open())
    {
        while(getline(infile, line)){
            for(int i = 0; i < stoi(line) ; i++){
                infile >> str1 >> str2;
                //check in which order they are entered
                //where to put them?
                //There is a vector of pairs
                //or 2D array
                if(isalpha(str1[0])){
                    table[i].color = str1;
                    table[i].rad = stoi(str2);
                }
                else{
                    table[i].color = str2;
                    table[i].rad =  stoi(str1) / 2; //doubled
                }
            }
            //now we sort
            sort(table, table + stoi(line), compareByRad);
            if (myfile.is_open()){
                  for(int i = 0; i < stoi(line); i++){
                      myfile << table[i].color;
                      myfile << endl;
                }
            }
                
            else {
                    cout << "Unable to open file";
                }
            getline(infile, line);
        }
      infile.close();
      myfile.close();
    }
    else {
        cout << "Unable to open file";
    }
    
    return 0;
}
