/********************************************
 * Header file for Radix.h
 *
 * Richard Walker
 * 06/12/2014
 *
**/

#ifndef RADIX_H
#define RADIX_H

#include <vector>
#include <string>

#include "../../Utilities/Utils.h"
#include "../../Utilities/Scanner.h"

using namespace std;

class Radix
{ public:
    Radix();
    virtual ~Radix();
    
    void runRadix(Scanner& inScanner, ofstream& outStream);
    
    void printVector(int radixnum, int n, vector<int> v);
    
    int createVector(int n, int radixnum, vector<int> & v);

  private:
    void add(int radixnum, int & l3, vector<int> & v3,
                           int   l1, vector<int> v1,
                           int   l2, vector<int> v2);

    void multiply(int radixnum, int & l3, vector<int> & v3,
                                int   l1, vector<int> v1,
                                int   l2, vector<int> v2);
};

#endif // RADIX_H
