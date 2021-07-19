#include<bits/stdc++.h>
using namespace std;
int main() {
  int n;
  cin>>n;
  
  vector<int> arr(n);
  for(int i=0; i<n; i++) {
    cin>>arr[i];
  }
  int id;
  cin>>id;
  sort(arr.begin(), arr.end());
  bool present = binary_search(arr.begin(), arr.end(), id);
  
  if(present) cout<<"She passed her exam";
  else cout<<"She failed";
  return 0;
}