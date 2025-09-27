#include <stdio.h>
#include <string.h>

#define MAX_TRAINS 100

// Time structure
typedef struct {
    int hour;
    int minute;
} TIME;

// Train information structure
typedef struct {
    int train_no;
    char train_name[50];
    TIME departure_time;
    TIME arrival_time;
    char start_station[50];
    char end_station[50];
} TRAIN_INFO;

// Function to sort trains by train number
void sort_trains(TRAIN_INFO trains[], int n) {
    for(int i=0; i<n-1; i++) {
        for(int j=i+1; j<n; j++) {
            if(trains[i].train_no > trains[j].train_no) {
                TRAIN_INFO temp = trains[i];
                trains[i] = trains[j];
                trains[j] = temp;
            }
        }
    }
}

// Function to list trains from a particular station
void list_by_station(TRAIN_INFO trains[], int n, char station[]) {
    sort_trains(trains, n);
    printf("\nTrains departing from %s:\n", station);
    for(int i=0; i<n; i++) {
        if(strcmp(trains[i].start_station, station) == 0) {
            printf("%d - %s at %02d:%02d\n", trains[i].train_no, trains[i].train_name,
                trains[i].departure_time.hour, trains[i].departure_time.minute);
        }
    }
}

// Function to list trains departing at a specific time from a station
void list_by_station_and_time(TRAIN_INFO trains[], int n, char station[], TIME t) {
    printf("\nTrains from %s at %02d:%02d:\n", station, t.hour, t.minute);
    for(int i=0; i<n; i++) {
        if(strcmp(trains[i].start_station, station) == 0 &&
           trains[i].departure_time.hour == t.hour &&
           trains[i].departure_time.minute == t.minute) {
            printf("%d - %s\n", trains[i].train_no, trains[i].train_name);
        }
    }
}

// Function to convert TIME to minutes
int time_to_minutes(TIME t) {
    return t.hour * 60 + t.minute;
}

// Function to list trains within the next 1 hour
void list_next_hour(TRAIN_INFO trains[], int n, char station[], TIME t) {
    int start_minutes = time_to_minutes(t);
    printf("\nTrains from %s within the next hour from %02d:%02d:\n", station, t.hour, t.minute);
    for(int i=0; i<n; i++) {
        if(strcmp(trains[i].start_station, station) == 0) {
            int dep_minutes = time_to_minutes(trains[i].departure_time);
            if(dep_minutes > start_minutes && dep_minutes <= start_minutes + 60) {
                printf("%d - %s at %02d:%02d\n", trains[i].train_no, trains[i].train_name,
                    trains[i].departure_time.hour, trains[i].departure_time.minute);
            }
        }
    }
}

// Sample driver code
int main() {
    TRAIN_INFO trains[MAX_TRAINS] = {
        {123, "Express A", {9, 30}, {14, 45}, "New Delhi", "Patna"},
        {101, "Superfast", {10, 0}, {15, 0}, "New Delhi", "Lucknow"},
        {102, "Intercity", {9, 45}, {12, 30}, "Patna", "Lucknow"},
        {140, "Morning Star", {9, 0}, {13, 0}, "New Delhi", "Varanashi"},
        {150, "FastTrack", {10, 15}, {13, 45}, "New Delhi", "Buxar"}
    };
    int n = 5;

    char station[50] = "NewDelhi";
    TIME t = {9, 0};

    list_by_station(trains, n, station);
    list_by_station_and_time(trains, n, station, t);
    list_next_hour(trains, n, station, t);

    return 0;
}