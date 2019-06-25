/****************************************************************
 * Main program for Homework 1.
 *
 * Author/copyright:  David Culp
 * Date: June 10, 2014
 * Program 1: This program asks input from a user to indicate
 * their age for the current year. 
 * 
 *
**/

#include "Main.h"

using namespace std;

static const string TAG = "Main: ";

// Determines what year they were born
double birthyear = 0.0;
// Current year
double year = 2014.0;
// Data type to store the age of a person
double age = 0.0;
int main(int argc, char *argv[])
{
// Statement to read to the user what to enter
  cout << "Please enter the year you were born: " << endl;
  cin >> birthyear;
  
  age = year - birthyear;
  
// Checks to see if the year they were born is greater than 0  
  if (birthyear < year)
   {
    cout << "You will be " << age << "years old in 2014! " << endl;
   }
  else 
   {
    cout << "Impossible! You have not been born yet" << endl;
   }


  return 0;
}
