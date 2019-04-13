#include <iostream>
#include <string>

int main(){
    
    int t, A, B, N, guess;
    std::string result;
    std::cin >> t;
    for(int i = 0; i < t; i++){
        std::cin >> A >> B >> N;
        //Start the guessing
        for(int j = 0; j < N; j++){
            guess = (A + B) /2;
            std::cout << guess << std::endl;
            std::cin >> result;
            if(result == "CORRECT"){
                break;
            }
            else if(result == "TOO_SMALL"){
                A = guess + 1;
            }
            else/*TOO_BIG*/{
                B = guess - 1;
            }
        }
    }
}
