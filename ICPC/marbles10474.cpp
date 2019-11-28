#include <iostream>
#include <vector>

using namespace std;

vector<int> marbales;
struct Node {
    int Data;
    Node*  Left;
    Node*  Right;
};
Node* CreateNode(int i){
    Node *p;
    p = new Node;
    p->Data = i;
    p->Left = NULL;
    p->Right = NULL;
    return p;
}
void InsertIter(Node *root, Node *p) /*'root' points to 'root' node*/{
    Node*  father = root, *child = root;
    while(child!=NULL){
        father = child;
        if(p->Data < father->Data)child = father->Left;
        else child = father->Right;
    } //end while
    if(p->Data < father->Data) father->Left = p;
    else father->Right = p;
} // end of function
void Inorder(Node *r){
    if (r == NULL)
        return;
    Inorder(r->Left);
    marbales.push_back(r->Data);
    Inorder(r->Right);
}

int main(int argc, const char * argv[]) {
    int N, Q;
    int marble, query;
    std::vector<int>::iterator it;
    cin >> N >> Q;
    while (N != 0 && Q != 0) {
        marbales.clear();
        Node *root = NULL;
        Node *p;
        for (int i = 0; i < N; i++) {
            cin >> marble;
            //insert marble to BST
            p = CreateNode(marble);
            if (root == NULL)root = p;
            else InsertIter(root, p);
        }
        Inorder(root);
        //Read the data and add it to the vector
        for (int i = 0; i < Q; i++) {
            cout << "CASE# " << i+1 << ":" <<endl;
            cin >> query;
            cout <<query;
            //print the position
            it = std::find(marbales.begin(), marbales.end(), query);
            if (it != marbales.end()) cout << " found at " << distance(marbales.begin(), it) + 1<< endl;
            else cout << " not found" << endl;
        }
        cin >> N >> Q;
    }
    return 0;
}
