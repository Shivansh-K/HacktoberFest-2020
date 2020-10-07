#include <iostream> 
#include <queue> 
using namespace std; 
  
 
struct node1 
{ 
    struct node1 *left; 
    int data; 
    struct node1 *right; 
}; 
  
int treeHeight(node1 *root) 
{ 
    if (root == NULL) 
        return 0; 
    queue<node1 *> q; 
    q.push(root); 
    int height = 0; 
  
    while (1) 
    { 
        int nodeCount = q.size(); 
        if (nodeCount == 0) 
            return height; 
  
        height++; 
        while (nodeCount > 0) 
        { 
            node1 *node = q.front(); 
            q.pop(); 
            if (node->left != NULL) 
                q.push(node->left); 
            if (node->right != NULL) 
                q.push(node->right); 
            nodeCount--; 
        } 
    } 
} 
  
node1* newNode(int data) 
{ 
    node1 *temp = new node1; 
    temp->data = data; 
    temp->left = NULL; 
    temp->right = NULL; 
    return temp; 
} 
node1* insertLevelOrder(int a[], node1* root, 
                       int i, int n) 
{ 
    if (i < n) 
    { 
        node1* temp = newNode(a[i]); 
        root = temp; 
        root->left = insertLevelOrder(a, 
                   root->left, 2 * i + 1, n); 
        root->right = insertLevelOrder(a, 
                  root->right, 2 * i + 2, n); 
    } 
    return root; 
} 
int main() 
{ int a[10],n;
 cin>>n;
 for(int i=0;i<n;i++)
   cin>>a[i];
    node1 *root=insertLevelOrder(a,root,0,n);
  
    cout <<treeHeight(root); 
    return 0; 
} 
