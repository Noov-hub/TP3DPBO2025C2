#pragma once
#include <iostream>

using namespace std;

class OverclockLimit {
private:
    float maxGHz;
public:
    OverclockLimit() {}

    OverclockLimit(float maxGHz) {
        this->maxGHz = maxGHz;
    }

    void setMaxGHz(float maxGHz) { this->maxGHz = maxGHz; }
    float getMaxGHz() { return maxGHz; }

    ~OverclockLimit() {}
};
