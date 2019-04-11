//
//  main.c
//  example
//
//  Created by JunHee Lee on 08/04/2019.
//  Copyright © 2019 JunHee Lee. All rights reserved.
//

#include <stdio.h>

int a[3][3]  = {{1, 2, 3}, {4,5,6},{7,8,9}};

int main(int argc, const char * argv[]) {
    for(int i=0; i < 3; i++){
        for(int j=0; j < 3; j++){
            printf("%d ", a[i][j]);
        }
    }
    

    return 0;
}
