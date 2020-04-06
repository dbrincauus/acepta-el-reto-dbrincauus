#include <stdio.h>

int main() {
    double a, b;
    while(scanf("%lf %lf", &a, &b) != EOF) {
        int c = 0;
        while(a / 1000000 < b) {
            c++;
            a = a * 2;
        }
        printf("%d\n", c);
    }
    return 0;
}
