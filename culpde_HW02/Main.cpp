#include "Main.h"

/****************************************************************
 * Main program for finding paths in graphs.
 *
 * Author/copyright:  Duncan Buell. All rights reserved.
 * Date: 9 January 2014
 *
**/

static const string TAG = "Main: ";

int main(int argc, char *argv[])
{
  string timeCallOutput = "";
  string logFileName = "zlog.txt";

  PathFinder pathfinder;

  // open the output file and the log file
  Utils::LogFileOpen(logFileName);

  // announce our presence and start the timer
  timeCallOutput = Utils::timecall("beginning");
  Utils::logStream << timeCallOutput;
  Utils::logStream << TAG << "Beginning execution" << endl;
  Utils::logStream << TAG << "Reading from standard input" << endl;
  Utils::logStream << TAG << "Writing to standard output" << endl;
  Utils::logStream.flush();

  // open the input file and do the real work
  pathfinder.initialize();

  pathfinder.computePaths();
  pathfinder.computeComponents();

  // let the world know we're done, close files, stop timer, finish
  Utils::logStream << TAG << "Ending execution" << endl;
  timeCallOutput = Utils::timecall("ending");
  Utils::logStream << timeCallOutput;
  Utils::logStream.flush();

  Utils::FileClose(Utils::logStream);

  return 0;
}
