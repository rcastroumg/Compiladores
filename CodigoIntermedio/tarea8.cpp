#include <iostream>

using namespace std;

double T0;
double T1;
double T2;
double T3;
double T4;
double T5;
double T6;
double T7;
double T8;
double T9;
double T10;
double T11;
double T12;
double T13;
double T14;
double T15;
double T16;
double T17;
double T18;
double T19;
double T20;
double T21;
double T22;
double T23;
double T24;
double T25;
double T26;
double T27;
double T28;
double T29;
double T30;
double T31;
double T32;
double T33;
double T34;
double T35;
double T36;
double T37;
double T38;
double T39;
double T40;

double stack[10];
int p = 0;

int main() {
    T0 = p;
    T1 = T0+1;
    stack[(int)T1] = 10.5;
    T2 = T0+2;
    stack[(int)T2] = 8.2;
    T3 = p+2;
    T4 = stack[(int)T3];
    T5 = T4*3;
    T6 = p+1;
    T7 = stack[(int)T6];
    T8 = T7+T5;
    T9 = p+3;
    stack[(int)T9] = T8;
    T10 = p+1;
    T11 = stack[(int)T10];
    T12 = p+2;
    T13 = stack[(int)T12];
    T14 = T11-T13;
    T15 = T14/2;
    T16 = p+4;
    stack[(int)T16] = T15;
    T17 = p+1;
    T18 = stack[(int)T17];
    T19 = p+2;
    T20 = stack[(int)T19];
    T21 = T18-T20;
    T22 = p+1;
    T23 = stack[(int)T22];
    T24 = p+2;
    T25 = stack[(int)T24];
    T26 = T23*T25;
    T27 = T26+T21;
    T28 = p+5;
    stack[(int)T28] = T27;

    T29 = p+3;
    T30 = stack[(int)T29];
    if(T30 > 20) goto L0;
    goto L1;
    L1:
    T31 = p+4;
    T32 = stack[(int)T31];
    if(T32 < 5) goto L2;
    goto L3;
    L2:
    T33 = p+5;
    T34 = stack[(int)T33];
    if(T34 < 20) goto L4;
    goto L5;

    L0:
    L4:
    T35 = p+3;
    T36 = stack[(int)T35];
    cout << T36 << endl;
    T37 = p+4;
    T38 = stack[(int)T37];
    cout << T38 << endl;
    T39 = p+5;
    T40 = stack[(int)T39];
    cout << T40 << endl;
    goto L6;
    L3:
    L5:
    L6:
    ;
    return 0;
}
