/*
GET blood_sugar
GET patient_blood

COMPUTE insulin_amnt (while patient_blood > 115)
insulin_amnt = 1 + [(patient_blood - 115) / 20]
STORE insulin_amnt

DISPLAY insulin_amnt
*/

#include <stdio.h>

int main()
{
    int pb;
    printf("what is your blood sugar level? ");
    scanf("%d", &pb);
    if(pb > 115){
        int insulin_amnt = (pb - 115);
        insulin_amnt = insulin_amnt / 20;
        printf("Amount of insulin shots needed %i", insulin_amnt);
    }else{
        printf("1 shot of insulin is needed");
    }

    return 0;
}
