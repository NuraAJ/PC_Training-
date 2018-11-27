#include <iostream>
#include <vector>
#include <cmath>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
//How to find duplicate number on Integer array in Java

using namespace std; 
int counterUp(string str){
	int j, counter = 0; 
	for(j = 0; j < str.length(); j++){
			if(str[j] == 'D'){
				continue;
			}
			else{
				while(str[j] != 'D' && j < str.length()){
					counter++; 
					j++;
				}
				break;
			}
		}
		return counter; 	
}
int main(int argc, char** argv) {
	int T; 
	string str; 
	cin >> T;
	for(int i = 0; i < T; i++){
		cin >> str; 
		cout << counterUp(str) << endl;; 
	}
	
		

	return 0;
}
