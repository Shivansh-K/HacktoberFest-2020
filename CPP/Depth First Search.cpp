#include<iostream>
#include<map>
#include<list>
using namespace std;

template<class t>
class graphs{
 map<t,list<t>> adjlist;
 public:
 graph()
 {
 }
 void addedge(t u,t v,bool bidir=true)//sets the BIDIRECTIONAL = TRUE
 {
     adjlist[u].push_back(v);
     if(bidir)//IF BIDIRECTIONAL
     {
         adjlist[v].push_back(u);
     }
 }
 void dfshelper(t u,map<t,bool> &visit)
 {
       visit[u]=true;
       cout<<u;
       for(auto it=adjlist[u].begin();it!=adjlist[u].end();it++)
       {
           if(!visit[*it])
           {
               dfshelper(*it,visit);
           }
       }
 }
 void dfs(t u)
 {
     map<t,bool> visit;
     dfshelper(u,visit);
 }



};

int main()
{
    graphs<int> g;
    int n;
    cin>>n;
    int a,b;
    for(auto i=0;i<n;i++)
    {
         cin>>a>>b;
         g.addedge(a,b);
    }
    g.dfs(0);


}
