#include <iostream>

using namespace std;

int a;
int T0;
int T1;
int b;

int main(){
a = 1;
T0 = 5*3;
T1 = T0+a;
b = T1;
if(b>3) goto L0;
goto L1;
L0:
if(a<=1) goto L2;
goto L3;
L2:
cout<<b<<endl;
L1:
L3:

return 0;
}
