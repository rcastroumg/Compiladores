#include <iostream>
using namespace std;

int var1, var2, var3;
int T0, T1, T2, T3, T4, T5;

int main(){
var1= 10;
T0= var1 * 10;
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
if(var1 == 0) goto L12;
goto L13;
L12:
var1= 200;
goto L14;
L13:
if(var1 == 1) goto L15;
goto L16;
L15:
T3= var1 + 1;
var1= T3;
goto L17;
L16:
if(var1 == 2) goto L18;
goto L19;
L18:
var1= 100;
goto L20;
L19:
var1= 1000;
L20:
L17:
L14:
return 0;
}
