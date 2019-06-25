#include "Matrix.h"

static const string TAG = "Matrix: ";

Matrix::Matrix()
{
vector< vector<int> > theMatrix;

}


Matrix::~Matrix()
{

}

int Matrix::get(int row, int col) const
{
	
  return 0;
}


int Matrix::getNumCols() const
{
 
  return 0;
}

int Matrix::getNumRows() const
{
  return 0;
}

bool Matrix::addNewPaths(Matrix a)
{
  return true;
}

void Matrix::createIdentityMatrix(int rows, int cols)
{
for (int i=0;i<rows;i++)
{
for (int j=0;j<cols;j++)
 {
if (rows == cols)
	{
theMatrix[i][j] = 1;
	}
else
	{
theMatrix[i][j] = 0;
	}
 }
}
}

void Matrix::createZeroMatrix(int rows, int cols)
{
for (int i = 0; i < rows; i++)
{
	for (int j =0; j < cols; j++)
		{ 
			theMatrix[rows][cols] =0;
		}
}

}

void Matrix::initialize(int rows, int cols, int value)
{

}

void Matrix::matrixMultiply(Matrix a, Matrix b)
{

}

void Matrix::readMatrix()
{
vector<vector<double> > theMatrix;
cin >> rows;
cin >> cols;
cin >> theMatrix[rows][cols];



for(int i = 0; i < rows; i++)
 {
 theMatrix.resize(cols);
 for (int j=0; j < cols; j++)
 {
	 cout << theMatrix[rows][cols];
 }
 
 }

}

string Matrix::toString()
{
	/*
  for (int i=0;i<rows;i++)
 {
   for (int j=0;j<cols;j++)
	{
	  cout << theMatrix[i][j] << " ";
	}
   cout << endl;
   */
   cout << "you are here" << endl;
   return "zork";
 }

} 
