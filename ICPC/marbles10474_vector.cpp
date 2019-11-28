#include <iostream>
#include <vector>
using namespace std;

int main(int argc, const char * argv[]) {
    int N, Q, marble, query;
    std::vector<int>::iterator it;
    vector<int> marbales;
    cin >> N >> Q;
    while (N != 0 && Q != 0) {
        marbales.clear();

        for (int i = 0; i < N; i++) {
            cin >> marble;
            marbales.push_back(marble);
        }
        sort(marbales.begin(), marbales.end());
        //Read the data and add it to the vector
        for (int i = 0; i < Q; i++) {
            cin >> query;
            cout << "CASE# " << i+1 << ":" <<endl <<query;

            //print the position
            it = std::find(marbales.begin(), marbales.end(), query);
            if (it != marbales.end()) cout << " found at " << distance(marbales.begin(), it) + 1<< endl;
            else cout << " not found" << endl;
        }
        cin >> N >> Q;
    }
    return 0;
}
