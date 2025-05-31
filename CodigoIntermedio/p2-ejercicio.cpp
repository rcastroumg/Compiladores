#include <iostream>

using namespace std;

int a;
int b;
int T0;
int T1;
int T2;

int main(){
a = 8;
b = 4;
T0 = a+b;
T1 = a-b;
T2 = a*b;
if(T0>10) goto L0;
goto L1;

L0:
if(T1<10) goto L4;
goto L1;

L1:
if(T2==32) goto L4;
goto L3;

L4:
cout<<a<<endl;
cout<<b<<endl;

L3:

return 0;

} 
