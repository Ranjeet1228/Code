#include <stdio.h>

// Function to find length of string (strlen)
int myStrlen(const char str[]) {
    int length = 0;
    while (str[length] != '\0') {
        length++;
    }
    return length;
}

// Function to copy one string to another (strcpy)
void myStrcpy(char dest[], const char src[]) {
    int i = 0;
    while (src[i] != '\0') {
        dest[i] = src[i];
        i++;
    }
    dest[i] = '\0';  // null-terminate
}

// Function to concatenate two strings (strcat)
void myStrcat(char dest[], const char src[]) {
    int i = 0, j = 0;

    // Move i to the end of dest
    while (dest[i] != '\0') {
        i++;
    }

    // Copy src to end of dest
    while (src[j] != '\0') {
        dest[i] = src[j];
        i++;
        j++;
    }

    dest[i] = '\0';  // null-terminate
}

int main() {
    char str1[100], str2[100], copy[100];

    printf("Enter first string: ");
    scanf("%s", str1);  // use scanf for single-word input

    printf("Enter second string: ");
    scanf("%s", str2);

    // strlen
    printf("Length of first string = %d\n", myStrlen(str1));
    printf("Length of second string = %d\n", myStrlen(str2));

    // strcpy
    myStrcpy(copy, str1);
    printf("Copy of first string = %s\n", copy);

    // strcat
    myStrcat(str1, str2);
    printf("Concatenated string = %s\n", str1);

    return 0;
}
