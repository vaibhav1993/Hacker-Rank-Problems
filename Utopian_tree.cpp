#include <iostream>
using namespace std;

int height(int n) {
    int h=1;
   if(n==0)
       return h;
    else
      {
    for(int j=1;j<=n;j++)
            {
            if(j%2!=0)
                {
                h=h*2;
            }
            else
                {
                h=h+1;
            }
        }
    }
    return h;
}
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << height(n) << endl;
    }
}
