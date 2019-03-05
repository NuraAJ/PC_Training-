//
//  main.cpp
//  summer
//
//  Created by Noura Ahmed on 2/27/19.
//  Copyright © 2019 Nura Ahmed. All rights reserved.
//

#include <iostream>
#include <fstream>
#include <map>
using namespace std;

int main(int argc, const char * argv[]) {
    ifstream myfile;
    string line;
    myfile.open ("/Users/nouraahmed/Programming/Conquests.in");
    map<string,int> mymap;
    if (myfile.is_open()) {
        /* ok, proceed with output */
        getline (myfile, line);
        for(int i = stoi(line); i >0 ; i--){
            getline (myfile, line);
            string word = line.substr(0, line.find(" "));
            mymap[word]++;
        }
    }
    myfile.close();
    ofstream outFile;
    outFile.open ("/Users/nouraahmed/Programming/Conquests.out");
    for ( map<string,int>::iterator it=mymap.begin(); it!=mymap.end(); ++it)
        outFile << it->first << " " << it->second << '\n';
    
    return 0;
}
