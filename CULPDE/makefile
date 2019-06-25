GPP = g++ -O2 -Wall
#GPP = g++ -Wall
#GPP = g++ -O2
#GPP = g++

UTILS = ../../Utilities
SCANNER = ../../Utilities
SCANLINE = ../../Utilities

M = Main.o
R = Radix.o
S = Scanner.o
SL = ScanLine.o
U = Utils.o

Aprog: $(M) $(R) $(S) $(SL) $(U)
	$(GPP) -o Aprog $(M) $(R) $(S) $(SL) $(U) 

Main.o: Main.h Main.cpp
	$(GPP) -o Main.o -c Main.cpp

Radix.o: Radix.h Radix.cpp
	$(GPP) -o Radix.o -c Radix.cpp

Scanner.o: $(SCANNER)/Scanner.h $(SCANNER)/Scanner.cpp
	$(GPP) -o Scanner.o -c $(SCANNER)/Scanner.cpp

ScanLine.o: $(SCANLINE)/Scanline.h $(SCANLINE)/ScanLine.cpp
	$(GPP) -o ScanLine.o -c $(SCANLINE)/ScanLine.cpp

Utils.o: $(UTILS)/Utils.h $(UTILS)/Utils.cpp
	$(GPP) -o Utils.o -c $(UTILS)/Utils.cpp

clean:
	rm Aprog
	clean
