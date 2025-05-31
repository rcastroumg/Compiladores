#include <iostream>
using namespace std;

int var1,var2,var3;
int T0,T1,T2,T3;

int main(){
var1= 9;
T0= var1 * 9;
var2= T0;
var3= 0;
L2:
if(var3 < var1) goto L0;
goto L1;
L0:
cout<<var3<<endl;
T1= var3 + 1;
var3= T1;
goto L2;
L1:
if(var1 == var3) goto L3;
goto L4;
L3:
cout<<var2<<endl;
goto L5;
L4:
cout<<var1<<endl;
L5:
L11:
if(var3 > 0) goto L6;
goto L7;
L6:
if(var3 > 5) goto L8;
goto L9;
L8:
cout<<var3<<endl;
goto L10;
L9:
cout<<var1<<endl;
L10:
T2= var3 - 1;
var3= T2;
goto L11;
L7:
return 0;
}
