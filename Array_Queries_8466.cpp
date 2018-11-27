#include <iostream>
#include <vector>
#include <cmath>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
//How to find duplicate number on Integer array in Java

using namespace std; 

int main(int argc, char** argv) {
	int T; 
	int N, Q; 
	int temp;
	int L, R, x;
	int sum =0;  
	vector <int> numbers; 
	cin >> T; 
	for(int i = 0; i < T; i++){
		cin >> N >> Q; 
		for(int j = 0; j < N; j++){
			cin >> temp; 
			numbers.push_back(temp);
		}
		//getting the queries and updating the data 
		for(int j = 0; j < Q; j++){
			cin >> temp; 
			switch(temp){
				case 1: 
					cin >> L >> R; 
					for(int z = L-1; z <= R-1; z++){
						numbers[z] = floor(sqrt(numbers[z]));
					}
				break; 
				
				case 2: 
					sum = 0; 
					cin >> L >> R; 
					for(int z = L-1; z <= R-1; z++){
						sum+=numbers[z];
					}
					cout << sum << endl; 
				break; 
				
				case 3:
					cin >> L >> R >> x;
					for(int z = L-1; z <= R-1; z++){
						numbers[z]+=x;
					}
					 
				break; 
			}
		}
	}

	return 0;
}
