#include <stdio.h>
#include <stdlib.h>


int main()
{
    int month_inc = 100;
    int debt = 5;
    
    int low_lim = (month_inc * 0.36) - debt;
    int upp_lim = (month_inc * 0.42) - debt;
    
    printf("your lower monthly mortgage is: %d", low_lim);
    printf("\nyour upper monthly mortgage is: %d", upp_lim);
}