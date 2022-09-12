#include <stdio.h>

int main()
{
    int h,m,s1,r,s;
    printf("how many seconds to convert ?: ");
    scanf("%d", &s);
    //int s = 5437;
    
    h = s / 3600;
    r = s % 3600;
    m = r / 60;
    s = r % 60;
    
    
    printf("%i hours\n", h);
    printf("%i minuts\n", m);
    printf("%i seconds\n", s);
    return 0;
}
