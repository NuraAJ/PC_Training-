#include <bits/stdc++.h>

using namespace std;

typedef std::vector<double> doubles;
doubles numbers;
//inserting element to a sorted vector and keeping elements sorted source: https://stackoverflow.com/questions/15048466/inserting-element-to-a-sorted-vector-and-keeping-elements-sorted/15048651
void insert( doubles &cont, int value ) {
    doubles::iterator it = std::lower_bound( cont.begin(), cont.end(), value,      std::greater<int>() ); // find proper position in descending order
    cont.insert( it, value ); // insert before iterator it
}
vector<double> runningMedian(vector<int> a) {
    vector<double>results;
    for(int i = 0 ; i < a.size(); i++){
        insert(numbers, a[i]);
        cout << std::fixed << setprecision(1);
        if(i == 0 ) results.push_back(numbers[0]);
        else if((i+1) % 2 == 0){
            results.push_back((numbers[(i-1)/2] + numbers[ceil(i/2.0)]) / 2);
        }
        else results.push_back(numbers[i/2]);
    }
    return results;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int a_count;
    cin >> a_count;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    vector<int> a(a_count);

    for (int a_itr = 0; a_itr < a_count; a_itr++) {
        int a_item;
        cin >> a_item;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        a[a_itr] = a_item;
    }

    vector<double> result = runningMedian(a);

    for (int result_itr = 0; result_itr < result.size(); result_itr++) {
        fout << result[result_itr];

        if (result_itr != result.size() - 1) {
            fout << "\n";
        }
    }

    fout << "\n";

    fout.close();

    return 0;
}
